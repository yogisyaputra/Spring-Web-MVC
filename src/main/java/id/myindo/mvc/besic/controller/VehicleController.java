package id.myindo.mvc.besic.controller;

import id.myindo.mvc.besic.service.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class VehicleController {
    @Autowired
    private Vehicle car;

    @RequestMapping("/showcar")
    public ModelAndView showCar(){
        return new ModelAndView("welcome","massage",car.toString());
    }

    @RequestMapping("/showmove")
    public ModelAndView showMove(){
        return new ModelAndView("welcome","massage",car.move());
    }
}
