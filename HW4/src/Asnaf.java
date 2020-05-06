import java.util.Scanner;

public abstract class Asnaf {
    private static final int pastaPrice=3000;
    private static final int oilPrice=3000;
    private static final int eggPrice=8000;
    private static final int meatPrice=50000;
    private static final int milkPrice=2000;
    private static final int iceCreamPrice=1000;
    private static final int sodaPrice=4000;
    private static final int coffeePrice=2000;
    private static final int snacksPrice=2000;
    private static final int chipsPrice=3000;
    private static final int vegetablePrice=1000;
    private static final int applePrice=3000;
    private static final int ricePrice=4000;
    private static final int wheatPrice=3000;
    private static final int wrenchPrice=3000;
    private static final int cutterPrice=3000;

    //////////////////////////////////////// getters
    public int getPastaPrice() {
        return pastaPrice;
    }

    public int getOilPrice() {
        return oilPrice;
    }

    public int getEggPrice() {
        return eggPrice;
    }

    public int getMeatPrice() {
        return meatPrice;
    }

    public int getMilkPrice() {
        return milkPrice;
    }

    public int getIceCreamPrice() {
        return iceCreamPrice;
    }

    public int getSodaPrice() {
        return sodaPrice;
    }

    public int getCoffeePrice() {
        return coffeePrice;
    }

    public int getSnacksPrice() {
        return snacksPrice;
    }

    public int getChipsPrice() {
        return chipsPrice;
    }

    public int getVegetablePrice() {
        return vegetablePrice;
    }

    public int getApplePrice() {
        return applePrice;
    }

    public int getRicePrice() {
        return ricePrice;
    }

    public int getWheatPrice() {
        return wheatPrice;
    }

    public int getWrenchPrice() {
        return wrenchPrice;
    }

    public int getCutterPrice() {
        return cutterPrice;
    }

    /////////////////////////////////// methods
    public void NameRegister()
    {
        System.out.print("Enter the number of employees for registry : ");
        Scanner scanner=new Scanner(System.in);
        int EmployeeNum=Integer.parseInt(scanner.nextLine());
        String [] Name=new String[EmployeeNum];
        for(int i=0;i<EmployeeNum;i++)
        {
            System.out.print("Employee " + (i+1) + " Name : ");
            Name[i]=scanner.nextLine();
        }
        for(int i=0;i<EmployeeNum;i++)
        {
            System.out.println(Name[i]);
        }
    }

    public int Advantage(long UltimateMoney){
        System.out.println("This company must pay some percentage of its ultimate income to the Asnaf. Deal?(y/n)");
        Scanner scanner=new Scanner(System.in);
        String answer=scanner.nextLine();
        if (answer.equals("n"))
        {
            System.out.println("This company doesn't have the rights required for continuing its career!");
            return 0;
        }
        else
            System.out.println("This company has the adequate rights to continue its career!");
        return 1;
    }


}
