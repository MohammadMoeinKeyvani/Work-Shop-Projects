public class Employee {
    ///////////////////////////////////
    private String name;
    private long id;
    private String station;
    private int age;

    //////////////////////////////////// Setter

    public void setName(String n)
    {
        this.name=n;
    }
    public void setId(long i)
    {
        this.id=i;
    }
    public void setStation(String s)
    {
        this.station=s;
    }
    public void setAge(int a)
    {
        this.age=a;
    }

    ////////////////////////////////////// Getter

    public String getName()
    {
        return this.name;
    }
    public long getId()
    {
        return this.id;
    }
    public String getStation()
    {
        return this.station;
    }
    public int getAge()
    {
        return this.age;
    }



}//end of class
