package model.entity;

public class Entity {
    private String goods;
    private String id;

    public String getGoods() {
        return goods;
    }

    public Entity setGoods(String goods) {
        this.goods = goods;
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
