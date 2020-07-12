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


    public void update ( String numberplate , String model)
    {
        try {
            Service.getInstance().edit(new Entity() , numberplate ,model);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
