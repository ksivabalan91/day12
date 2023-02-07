package sg.edu.nus.iss.day12.controller;

import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path={"/","/home","/index"})
public class HomeController {

    @GetMapping
    public String home(Model model){

        Calendar cal = Calendar.getInstance();
        String time = new Date().toString();
        System.out.println(time);
        model.addAttribute("currTime", time);
        model.addAttribute("currHour", cal.get(Calendar.HOUR_OF_DAY));

        return "index";
    }
    
}
