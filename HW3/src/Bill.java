public class Bill {
    public void costCalculater(Sim a)
    {
        System.out.println("The cost of intenet used (Cost in Tomans) : "+ a.internetCost());
        System.out.println("The cost of messages used (Cost in Tomans) : "+ a.messageCost());
        System.out.println("The cost of inner calls used (Cost in Tomans) : "+ a.icallsCost());
        System.out.println("The cost of outer calls used (Cost in Tomans) : "+ a.ocallsCost());

    }


}
