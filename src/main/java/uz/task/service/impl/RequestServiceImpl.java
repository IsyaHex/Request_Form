package uz.task.service.impl;

import org.springframework.stereotype.Service;
import uz.task.domain.Request;
import uz.task.dto.RequestSaveDto;
import uz.task.repository.RequestRepository;
import uz.task.service.RequestService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Service
public class RequestServiceImpl implements RequestService {

    private final RequestRepository requestRepository;

    public RequestServiceImpl(RequestRepository formRepository) {
        this.requestRepository = formRepository;
    }

    @Override
    public Request insertRequest(RequestSaveDto model) throws ParseException {
        Request request = new Request();
        addUser(model, request);
        return requestRepository.save(request);
    }

    @Override
    public List<Request> selectAllRequest() {
        return requestRepository.findAll();
    }

//    Selection criteria 1
    @Override
    public List<Request> findByCriteriaOne(Integer corr, Date dateBefore, Date dateAfter) {
        return requestRepository.findAllByCorrespondentAndRegistrationDateIsBetween(corr, dateBefore, dateAfter);
    }

//    Selection criteria 2
    @Override
    public List<Request> findByCriteriaTwo(Integer corr, Integer deliveryForm, Date dateBefore, Date dateAfter) {
        return requestRepository.findAllByCorrespondentAndDeliveryFormAndRegistrationDateBetween(corr, deliveryForm, dateBefore, dateAfter);
    }

//    Selection criteria 3
    @Override
    public List<Request> findByCriteriaThree(Date dateBefore, Date dateAfter, Integer corr, Integer deliveryForm) {
        return requestRepository.findAllByRegistrationDateBetweenAndCorrespondentIsNotAndDeliveryFormIsNot(
                dateBefore, dateAfter, corr, deliveryForm);
    }

//    Selection criteria 4
    @Override
    public List<Request> findByCriteriaFour(Date dateBefore, Date dateAfter, Integer corr, String topic) {
        return requestRepository.findAllByRegistrationDateBetweenAndCorrespondentAndTopicIsNotContaining(
                dateBefore, dateAfter, corr, topic);
    }


    private void addUser(RequestSaveDto model, Request request) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        request.setRegistrationNumber(model.getRegistrationNumber());
        request.setRegistrationDate(Date.from(Instant.now()));
        request.setSourceFileId(model.getSourceFileId());
        request.setSourceDate(simpleDateFormat.parse(model.getSourceDate()));
        request.setDeliveryForm(model.getDeliveryForm());
        request.setCorrespondent(model.getCorrespondent());
        request.setTopic(model.getTopic());
        request.setDescription(model.getDescription());
        request.setDueDate(simpleDateFormat.parse(model.getDueDate()));
        request.setAccess(model.getAccess());
        request.setInspection(model.getInspection());
//        request.setFilePath(String.valueOf(model.getFilePath()));
    }
}
