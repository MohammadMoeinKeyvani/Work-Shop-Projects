package model.entity;

public class Entity {
    private String numberplate;
    private String model;
    private String id;

    ////////////////////////////constructor
    public Entity (){
        this.numberplate = "";
        this.model = "";
        this.id = "";
    }

    ///////////////////////////setter & getter
    public String getNumberplate() {
        return numberplate;
    }

    public Entity setNumberplate(String numberplate) {
        this.numberplate = numberplate;
        return this;
    }

    public String getModel() {
        return model;
    }

    public Entity setModel(String model) {
        this.model = model;
        return this;
    }

    public String getId() {
        return id;
    }

    public Entity setId(String id) {
        this.id = id;
        return this;
    }
}
