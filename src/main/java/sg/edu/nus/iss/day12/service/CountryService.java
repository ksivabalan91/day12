package sg.edu.nus.iss.day12.service;

import java.util.List;

import sg.edu.nus.iss.day12.model.Country;
import sg.edu.nus.iss.day12.repository.CountryRepo;

public class CountryService {

    CountryRepo ctyRepo;

    public CountryService(){
        ctyRepo = new CountryRepo();
    }

    public List<Country> getAllCountries(){
        return ctyRepo.getAllCountries();
    }
    
    public Boolean createCountry(Country cty){
        Boolean result = ctyRepo.createCountry(cty);
        return result;
    }
}
