public class Sim {
    private final int cmg=40;
    private final int cpm=10;
    private final int cinnerCalls=60;
    private final int coutterCalls=700;

    private int mg;
    private int pm;
    private int innerCalls;
    private int outterCalls;
    //public Sim a;

    public Sim()
    {
        this.mg=0;
        this.pm=0;
        this.innerCalls=0;
        this.outterCalls=0;
    }
    ///////////////////////////////////////// setters
    public void setMg(int a)
    {
        this.mg=a;
    }
    public void setPm(int a)
    {
        this.pm=a;
    }
    public void setInnerCalls(int a)
    {
        this.innerCalls=a;
    }
    public void setOutterCalls(int a)
    {
        this.outterCalls=a;
    }
    ///////////////////////////////////////// getters
    public int getMg()
    {
        return this.mg;
    }
    public int getPm()
    {
        return this.pm;
    }
    public int getInnerCalls()
    {
        return this.innerCalls;
    }
    public int getOutterCalls()
    {
        return this.outterCalls;
    }


    ///////////////////////////////////////// methods
    public int internetCost()
    {
        int ic = cmg * this.mg;
        return ic;
    }
    public long messageCost()
    {
        long mc=cpm*this.pm;
        return mc;
    }
    public long icallsCost()
    {
        long icc=cinnerCalls*this.innerCalls;
        return icc;
    }
    public long ocallsCost()
    {
        long occ=coutterCalls*this.outterCalls;
        return occ;
    }
}
