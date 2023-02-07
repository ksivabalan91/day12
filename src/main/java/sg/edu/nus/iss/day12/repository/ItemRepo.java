package sg.edu.nus.iss.day12.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import sg.edu.nus.iss.day12.model.Item;

@Repository
public class ItemRepo {
    public List<Item> itemList;

    public List<Item> getCartItems(){
        itemList = new ArrayList<>();

        Item itm = new Item();
        itm.setItemName("Louis Vuitton");
        itm.setQuantity(5);
        itemList.add(itm);
        
        itm = new Item();
        itm.setItemName("Chanel");
        itm.setQuantity(5);
        itemList.add(itm);

        itm = new Item();
        itm.setItemName("Prada");
        itm.setQuantity(10);
        itemList.add(itm);

        itm = new Item();
        itm.setItemName("Gucci");
        itm.setQuantity(1);
        itemList.add(itm);

        itm = new Item();
        itm.setItemName("Balenciaga");
        itm.setQuantity(100);
        itemList.add(itm);

        return itemList;

    }

    
}
