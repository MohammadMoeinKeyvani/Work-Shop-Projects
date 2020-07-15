package controller;
import model.entity.Entity;
import model.repository.Repository;
import model.service.Service;

import java.util.List;

public class Controller {
    public void insert (String numberplate , String model , String id){
        try {
            Service.getInstance().save (new Entity().setNumberplate(numberplate).setModel(model).setId(id));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void update (String id , String numberplate , String model)
    {
        try {
            Service.getInstance().edit(new Entity() , id , numberplate ,model);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void remove (String id){
        Service.getInstance().remove(id);
    }

}
