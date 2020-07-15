package model.service;

import model.entity.Entity;
import model.repository.Repository;

import java.util.List;

public class Service {

    private static Service service = new Service();

    public static Service getInstance () {
        return service;
    }

    public void save (Entity entity) throws Exception {
        try (Repository repository = new Repository()) {
            entity.setGoods(entity.getGoods());
            entity.setId(entity.getId());
            repository.insert (entity);
            repository.commit ();
        }
    }


}
