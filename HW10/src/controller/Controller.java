package controller;
import model.entity.Entity;
import model.repository.Repository;
import model.service.Service;

import java.util.List;

public class Controller extends Thread {
    public void insert (String numberplate , String model , String id){
        try {
            Service.getInstance().save (new Entity());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


//    public void update ( String numberplate , String model)
//    {
//        try {
//            Service.getInstance().edit(new Entity() , numberplate ,model);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }

}
