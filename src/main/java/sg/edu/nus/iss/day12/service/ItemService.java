package sg.edu.nus.iss.day12.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import sg.edu.nus.iss.day12.repository.ItemRepo;
import sg.edu.nus.iss.day12.model.Item;

@Service
public class ItemService {

    @Autowired
    ItemRepo itmRepo; //this is same

    // // as this
    // public ItemService(){
    //     itmRepo = new ItemRepo();
        
    // }

    public List<Item> retrieveItemList(){
        return itmRepo.getCartItems();
    }
    
}
