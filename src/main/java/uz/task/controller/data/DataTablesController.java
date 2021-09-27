package uz.task.controller.data;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.task.domain.Request;
import uz.task.service.RequestService;

import java.util.List;

@RestController
public class DataTablesController {
    private final RequestService requestService;

    public DataTablesController(RequestService requestService) {
        this.requestService = requestService;
    }

    @PostMapping("ajax/requests")
    public List<Request> getAllRequest() {
        return requestService.selectAllRequest();
    }
}
