package controller;
import model.entity.Entity;
import model.repository.Repository;
import model.service.Service;

import java.util.List;

public class Controller extends Thread {
    public void insert ( String goods , String id){
        try {
            Service.getInstance().save (new Entity().setGoods(goods).setId(id));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
