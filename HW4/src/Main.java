import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main extends Exception
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String temp = "";
        int check = 0,choice = 0,numberOfItems = 0,branchChoice = 0;
        MainStore onlineStore = new MainStore();
        Branch1 onlineStore2 = new Branch1();


        onlineStore.NameRegister();
        onlineStore.Advantage(1000000000);

        System.out.println("\nBuy from : 1- Main Store 2- Branches ");
        while (1 == 1)
        {
            boolean b = false;
            try {
                temp = input.nextLine();
                branchChoice = Integer.parseInt(temp);
                b = true ;
            } catch (Exception invalidNumber) {
                invalidNumber = new Exception("Invalid Number.Please try again.");
                System.out.println(invalidNumber.getMessage());
            }
            if (b)
                break;
        }

        //////////////////////////////
        if (branchChoice == 1) {
            while (1 == 1) {
                ///////////////////////////////////////
                while (1 == 1) {
                    boolean b = false;
                    try {
                        System.out.println("Category : (Please enter number of thing that you want)");
                        System.out.println("1- Food  2- Egg and Meat  3- Dairy  4- Drink  5- Snacks and Chips ");
                        temp = input.nextLine();
                        check = Integer.parseInt(temp);
                        b = true;
                    } catch (Exception invalidNumber) {
                        invalidNumber = new Exception("Invalid Number.Please try again.");
                        System.out.println(invalidNumber.getMessage());
                    }
                    if (b)
                        break;
                }

                ///////////////////////////////////////

                switch (check) {
                    case 1:
                        System.out.println("1- Pasta Price: " + onlineStore.getPastaPrice() + " ; 2- Oil Price: " + onlineStore.getOilPrice());
                        break;
                    case 2:
                        System.out.println("1- Egg Price: " + onlineStore.getEggPrice() + " ; 2- Meat Price: " + onlineStore.getMeatPrice());
                        break;
                    case 3:
                        System.out.println("1- Milk Price: " + onlineStore.getMilkPrice() + " ; 2- Ice cream Price: " + onlineStore.getIceCreamPrice());
                        break;
                    case 4:
                        System.out.println("1- Soda Price: " + onlineStore.getSodaPrice() + " ; 2- Coffee Price: " + onlineStore.getCoffeePrice());
                        break;
                    case 5:
                        System.out.println("1- Snacks Price: " + onlineStore.getSnacksPrice() + " ; 2- Chips Price: " + onlineStore.getChipsPrice());
                        break;
                }

                /////////////////////////////////////////

                while (1 == 1) {
                    boolean b = false;
                    try {
                        temp = input.nextLine();
                        choice = Integer.parseInt(temp);
                        b = true;
                    } catch (Exception invalidNumber) {
                        invalidNumber = new Exception("Invalid Number.Please try again.");
                        System.out.println(invalidNumber.getMessage());
                    }
                    if (b)
                        break;
                }

                System.out.print("How many of these items do you want? ");

                while (1 == 1) {
                    boolean b = false;
                    try {
                        temp = input.nextLine();
                        numberOfItems = Integer.parseInt(temp);
                        b = true;
                    } catch (Exception invalidNumber) {
                        invalidNumber = new Exception("Invalid Number.Please try again.");
                        System.out.println(invalidNumber.getMessage());
                    }
                    if (b)
                        break;
                }

                ////////////////////////////////////// if for choice and number of items

                if (check == 1) {
                    if (choice == 1)
                        onlineStore.setNumberOfPasta(numberOfItems);
                    if (choice == 2)
                        onlineStore.setNumberOfOil(numberOfItems);
                }

                if (check == 2) {
                    if (choice == 1)
                        onlineStore.setNumberOfEgg(numberOfItems);
                    if (choice == 2)
                        onlineStore.setNumberOfMeat(numberOfItems);
                }

                if (check == 3) {
                    if (choice == 1)
                        onlineStore.setNumberOfMilk(numberOfItems);
                    if (choice == 2)
                        onlineStore.setNumberOfIceCream(numberOfItems);
                }

                if (check == 4) {
                    if (choice == 1)
                        onlineStore.setNumberOfSoda(numberOfItems);
                    if (choice == 2)
                        onlineStore.setNumberOfCoffee(numberOfItems);
                }

                if (check == 5) {
                    if (choice == 1)
                        onlineStore.setNumberOfSnacks(numberOfItems);
                    if (choice == 2)
                        onlineStore.setNumberOfChips(numberOfItems);
                }

                ///////////////////////////////// check out

                System.out.println("1-Exit and display the receipts or 2- Continue buying ??");
                while (1 == 1) {
                    boolean b = false;
                    try {
                        temp = input.nextLine();
                        choice = Integer.parseInt(temp);
                        b = true;
                    } catch (Exception invalidNumber) {
                        invalidNumber = new Exception("Invalid Number.Please try again.");
                        System.out.println(invalidNumber.getMessage());
                    }
                    if (b)
                        break;
                }
                if (choice == 1)
                    break;
                else if (choice == 2)
                    continue;
            }//end of main loop
            System.out.println("You have to pay : "+ (onlineStore.getPastaPrice()*onlineStore.getNumberOfPasta() + onlineStore.getOilPrice()*onlineStore.getNumberOfOil() + onlineStore.getEggPrice()*onlineStore.getNumberOfEgg() + onlineStore.getMeatPrice()*onlineStore.getNumberOfMeat() + onlineStore.getMilkPrice()*onlineStore.getNumberOfMilk() + onlineStore.getIceCreamPrice()*onlineStore.getNumberOfIceCream() + onlineStore.getSodaPrice()*onlineStore.getNumberOfSoda() + onlineStore.getCoffeePrice()*onlineStore.getNumberOfCoffee() + onlineStore.getSnacksPrice()*onlineStore.getNumberOfSnacks() + onlineStore.getChipsPrice()*onlineStore.getNumberOfChips()));
        }

        /////////////////////////////// branches

        else if (branchChoice == 2)
        {
            while (1 == 1) {
                ///////////////////////////////////////
                while (1 == 1) {
                    boolean b = false;
                    try {
                        System.out.println("Category : (Please enter number of thing that you want)");
                        System.out.println("1- Food  2- Egg and Meat  3- Dairy  4- Drink  5- Snacks and Chips 6- Fruits And Vegetables  7-Rice And Wheat  8-Tools");
                        temp = input.nextLine();
                        check = Integer.parseInt(temp);
                        b = true;
                    } catch (Exception invalidNumber) {
                        invalidNumber = new Exception("Invalid Number.Please try again.");
                        System.out.println(invalidNumber.getMessage());
                    }
                    if (b)
                        break;
                }

                ///////////////////////////////////////

                switch (check) {
                    case 1:
                        System.out.println("1- Pasta Price: " + onlineStore2.getPastaPrice() + " ; 2- Oil Price: " + onlineStore2.getOilPrice());
                        break;
                    case 2:
                        System.out.println("1- Egg Price: " + onlineStore2.getEggPrice() + " ; 2- Meat Price: " + onlineStore2.getMeatPrice());
                        break;
                    case 3:
                        System.out.println("1- Milk Price: " + onlineStore2.getMilkPrice() + " ; 2- Ice cream Price: " + onlineStore2.getIceCreamPrice());
                        break;
                    case 4:
                        System.out.println("1- Soda Price: " + onlineStore2.getSodaPrice() + " ; 2- Coffee Price: " + onlineStore2.getCoffeePrice());
                        break;
                    case 5:
                        System.out.println("1- Snacks Price: " + onlineStore2.getSnacksPrice() + " ; 2- Chips Price: " + onlineStore2.getChipsPrice());
                        break;
                    case 6:
                        System.out.println("1- Vegetable Price: " + onlineStore2.getVegetablePrice() + " ; 2- CApple Price: " + onlineStore2.getApplePrice());
                        break;
                    case 7:
                        System.out.println("1- Rice Price: " + onlineStore2.getRicePrice() + " ; 2- Wheat Price: " + onlineStore2.getWheatPrice());
                        break;
                    case 8:
                        System.out.println("1- Wrench Price: " + onlineStore2.getWrenchPrice() + " ; 2- Cutter Price: " + onlineStore2.getCutterPrice());
                        break;
                }

                /////////////////////////////////////////

                while (1 == 1) {
                    boolean b = false;
                    try {
                        temp = input.nextLine();
                        choice = Integer.parseInt(temp);
                        b = true;
                    } catch (Exception invalidNumber) {
                        invalidNumber = new Exception("Invalid Number.Please try again.");
                        System.out.println(invalidNumber.getMessage());
                    }
                    if (b)
                        break;
                }

                System.out.print("How many of these items do you want? ");

                while (1 == 1) {
                    boolean b = false;
                    try {
                        temp = input.nextLine();
                        numberOfItems = Integer.parseInt(temp);
                        b = true;
                    } catch (Exception invalidNumber) {
                        invalidNumber = new Exception("Invalid Number.Please try again.");
                        System.out.println(invalidNumber.getMessage());
                    }
                    if (b)
                        break;
                }

                ////////////////////////////////////// if for choice and number of items

                if (check == 1) {
                    if (choice == 1)
                        onlineStore2.setNumberOfPasta(numberOfItems);
                    if (choice == 2)
                        onlineStore2.setNumberOfOil(numberOfItems);
                }

                if (check == 2) {
                    if (choice == 1)
                        onlineStore2.setNumberOfEgg(numberOfItems);
                    if (choice == 2)
                        onlineStore2.setNumberOfMeat(numberOfItems);
                }

                if (check == 3) {
                    if (choice == 1)
                        onlineStore2.setNumberOfMilk(numberOfItems);
                    if (choice == 2)
                        onlineStore2.setNumberOfIceCream(numberOfItems);
                }

                if (check == 4) {
                    if (choice == 1)
                        onlineStore2.setNumberOfSoda(numberOfItems);
                    if (choice == 2)
                        onlineStore2.setNumberOfCoffee(numberOfItems);
                }

                if (check == 5) {
                    if (choice == 1)
                        onlineStore2.setNumberOfSnacks(numberOfItems);
                    if (choice == 2)
                        onlineStore2.setNumberOfChips(numberOfItems);
                }

                if (check == 6) {
                    if (choice == 1)
                        onlineStore2.setNumberOfVegetable(numberOfItems);
                    if (choice == 2)
                        onlineStore2.setNumberOfApple(numberOfItems);
                }

                if (check == 7) {
                    if (choice == 1)
                        onlineStore2.setNumberOfRice(numberOfItems);
                    if (choice == 2)
                        onlineStore2.setNumberOfWheat(numberOfItems);
                }

                if (check == 8) {
                    if (choice == 1)
                        onlineStore2.setNumberOfWrench(numberOfItems);
                    if (choice == 2)
                        onlineStore2.setNumberOfCutter(numberOfItems);
                }

                ///////////////////////////////// check out

                System.out.println("1-Exit and display the receipts or 2- Continue buying ??");
                while (1 == 1) {
                    boolean b = false;
                    try {
                        temp = input.nextLine();
                        choice = Integer.parseInt(temp);
                        b = true;
                    } catch (Exception invalidNumber) {
                        invalidNumber = new Exception("Invalid Number.Please try again.");
                        System.out.println(invalidNumber.getMessage());
                    }
                    if (b)
                        break;
                }
                if (choice == 1)
                    break;
                else if (choice == 2)
                    continue;
            }//end of main loop
            System.out.println("You have to pay : "+ (onlineStore2.getPastaPrice()*onlineStore2.getNumberOfPasta() + onlineStore2.getOilPrice()*onlineStore2.getNumberOfOil() + onlineStore2.getEggPrice()*onlineStore2.getNumberOfEgg() + onlineStore2.getMeatPrice()*onlineStore2.getNumberOfMeat() + onlineStore2.getMilkPrice()*onlineStore2.getNumberOfMilk() + onlineStore2.getIceCreamPrice()*onlineStore2.getNumberOfIceCream() + onlineStore2.getSodaPrice()*onlineStore2.getNumberOfSoda() + onlineStore2.getCoffeePrice()*onlineStore2.getNumberOfCoffee() + onlineStore2.getSnacksPrice()*onlineStore2.getNumberOfSnacks() + onlineStore2.getChipsPrice()*onlineStore2.getNumberOfChips() + onlineStore2.getVegetablePrice()*onlineStore2.getNumberOfVegetable() + onlineStore2.getApplePrice()*onlineStore2.getNumberOfApple() + onlineStore2.getRicePrice()*onlineStore2.getNumberOfRice() + onlineStore2.getWheatPrice()*onlineStore2.getNumberOfWheat() + onlineStore2.getWrenchPrice()*onlineStore2.getNumberOfWrench() + onlineStore2.getCutterPrice()*onlineStore2.getNumberOfCutter()));
        }
    }//end of main method

}//end of Main class
