public class Office {
    private String Id;
    private String name;
    private String department;

    ///////////////////////////// constructor
    public Office() {
        this.Id = "";
        this.name = "";
        this.department = "";
    }

    ///////////////////////////// setters & getters

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

}
