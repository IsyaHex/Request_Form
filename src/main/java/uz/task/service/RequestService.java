package uz.task.service;

import uz.task.domain.Request;
import uz.task.dto.RequestSaveDto;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

public interface RequestService {

    Request insertRequest(RequestSaveDto model) throws ParseException;
    List<Request> selectAllRequest();
    //    Selection criteria 1
    List<Request> findByCriteriaOne(Integer corr, Date dateBefore, Date dateAfter);
    //    Selection criteria 2
    List<Request> findByCriteriaTwo(Integer corr, Integer deliveryForm, Date dateBefore, Date dateAfter);
    //    Selection criteria 3
    List<Request> findByCriteriaThree(Date dateBefore, Date dateAfter, Integer corr, Integer deliveryForm);
    //    Selection criteria 4
    List<Request> findByCriteriaFour(Date dateBefore, Date dateAfter, Integer corr, String topic);

}
