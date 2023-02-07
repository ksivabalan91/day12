package sg.edu.nus.iss.day12.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import sg.edu.nus.iss.day12.service.CountryService;
import sg.edu.nus.iss.day12.model.*;

@Controller
@RequestMapping(path = {"/countries"}) // if only one path ("countries")
public class CountryController {

    CountryService ctySvc;

    public CountryController(){
        ctySvc = new CountryService();
    }

    // @GetMapping(produces={"application/xml"})
    @GetMapping
    public @ResponseBody List<Country> getAllCountries(){
        return ctySvc.getAllCountries();
    }

    @PostMapping()
    public @ResponseBody Boolean createCountry(@RequestBody Country cty){
        return ctySvc.createCountry(cty);
    }

    @GetMapping("/list")
    public String displayCountryList(Model model){

        List<Country> ctyList = ctySvc.getAllCountries();
        model.addAttribute("countryList", ctyList);

        return "countryList";
        

    }
    
}
