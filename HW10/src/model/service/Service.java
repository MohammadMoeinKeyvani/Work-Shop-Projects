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
            repository.insert (entity);
            repository.commit ();
        }
    }

    public List<Entity> report() throws Exception{
        List<Entity> entityList;
        try (Repository repository =new Repository()){
            entityList = repository.select ();
        }
        return entityList;
    }

}
