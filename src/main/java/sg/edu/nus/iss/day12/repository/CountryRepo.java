package sg.edu.nus.iss.day12.repository;

import java.util.ArrayList;
import java.util.List;
import sg.edu.nus.iss.day12.model.*;

public class CountryRepo {
    List<Country> countryList;

    public List<Country> getAllCountries(){
        countryList = new ArrayList<>();

        Country cty = new Country("SG","Singapore",6_000_000);
        countryList.add(cty);

        cty = new Country("MY","Malaysia",33_000_000);
        countryList.add(cty);

        cty = new Country("CN","China",1_430_000_000);
        countryList.add(cty);

        cty = new Country("HK","Hong Kong",7_000_000);
        countryList.add(cty);

        return countryList;
    }

    public Boolean createCountry(Country cty){

        if(countryList==null){
            countryList = new ArrayList<>();
        }        
        countryList.add(cty);
        return true;
    }
    
}
