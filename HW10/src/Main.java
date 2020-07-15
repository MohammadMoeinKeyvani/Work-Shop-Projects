import controller.Controller;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String temp,goods,id;
        int n;
        Controller controllerUnder5 = new Controller();
        Controller controllerAbove5 = new Controller();

        System.out.println("Enter the number of items you want to add : ");
        temp = input.nextLine();
        n = Integer.parseInt(temp);
        if (n <= 5)
        {
            controllerUnder5.start();
            for (int i=0 ; i<n ; i++)
            {
                System.out.print("Enter "+ (i+1) + " Goods : ");
                goods = input.nextLine();
                System.out.print("Enter "+ (i+1) + " Goods ID : ");
                id = input.nextLine();
                controllerUnder5.insert(goods,id);
            }
            try {
                Thread.sleep(90000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        else if (n > 5)
        {
            controllerAbove5.start();
            for (int i=0 ; i<n ; i++)
            {
                System.out.print("Enter "+ (i+1) + " Goods : ");
                goods = input.nextLine();
                System.out.print("Enter "+ (i+1) + " Goods ID : ");
                id = input.nextLine();
                controllerAbove5.insert(goods,id);
            }
        }

    }
}
