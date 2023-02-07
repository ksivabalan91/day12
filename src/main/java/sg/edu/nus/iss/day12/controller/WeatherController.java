package sg.edu.nus.iss.day12.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/weather")
public class WeatherController {
    
    @GetMapping
    // request param springboot documentation to see
    // @Requestparam to pass in parameters, 
    // http://localhost:3000/weather?city=London&units=nanometers
    public String weather(@RequestParam(required=true) String city, @RequestParam(name="units",defaultValue="kilometers") String units, Model model){
        model.addAttribute("city", city);
        model.addAttribute("units", units);
        return "weather";
    
    }
    @GetMapping("{country}")
    // request param springboot documentation to see
    // http://localhost:3000/weather/London?units=nanometers 
    public String weather2(@PathVariable(name="country",required=true) String city, @RequestParam(name="units",defaultValue="kilometers") String units, Model model){
        model.addAttribute("city", city);
        model.addAttribute("units", units);
        return "weather";
    }

    
}
