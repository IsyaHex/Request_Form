package uz.task.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import uz.task.constant.AccessEnum;
import uz.task.constant.CorrespondentEnum;
import uz.task.constant.DeliveryFormEnum;
import uz.task.constant.InspectionEnum;
import uz.task.dto.RequestSaveDto;
import uz.task.service.RequestService;

import java.text.ParseException;

@Controller
@RequestMapping({"/", "/index"})
public class IndexController {

    private final RequestService requestService;
    private static final String url = "http://localhost:5151";

    public IndexController(RequestService requestService) {
        this.requestService = requestService;
    }

    @GetMapping
    public String main(Model model) {
        model.addAttribute("request", new RequestSaveDto());
        model.addAttribute("accessList", AccessEnum.values());
        model.addAttribute("correspondentList", CorrespondentEnum.values());
        model.addAttribute("deliveryList", DeliveryFormEnum.values());
        model.addAttribute("inspectionList", InspectionEnum.values());
        return "index";
    }

    @PostMapping("/addRequest")
    public String addRequest(@ModelAttribute(name = "request") RequestSaveDto request, Model model,
                             MultipartFile file) throws ParseException {
        requestService.insertRequest(request);
        model.addAttribute("request", request);
        model.addAttribute("accessList", AccessEnum.values());
        model.addAttribute("correspondentList", CorrespondentEnum.values());
        model.addAttribute("deliveryList", DeliveryFormEnum.values());
        model.addAttribute("inspectionList", InspectionEnum.values());
        model.addAttribute("file", file);
        return "redirect:" + url;
    }

//    @PostMapping("/addRequest/file")
//    public String addRequest(@ModelAttribute(name = "request") RequestSaveDto request, Model model,
//                             @RequestParam("file")MultipartFile file, RedirectAttributes attr) throws ParseException {
//        requestService.insertRequest(request);
//        model.addAttribute("request", request);
//        model.addAttribute("accessList", AccessEnum.values());
//        model.addAttribute("correspondentList", CorrespondentEnum.values());
//        model.addAttribute("deliveryList", DeliveryFormEnum.values());
//        model.addAttribute("inspectionList", InspectionEnum.values());
//        attr.addFlashAttribute("message", "You successfully uploaded " + file.getOriginalFilename() + "!");
//        return "redirect:" + url;
//    }

}
