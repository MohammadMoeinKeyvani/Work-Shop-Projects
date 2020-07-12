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
            entity.setNumberplate(entity.getNumberplate());
            entity.setModel(entity.getModel());
            entity.setId(entity.getId());
            repository.insert (entity);
            repository.commit ();
        }
    }

    public void edit (Entity entity , String numberplate , String model) throws Exception{
        try (Repository repo=new Repository ()){
            entity.setNumberplate (numberplate);
            entity.setModel (model);
            repo.update (entity);
            repo.commit ();
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
