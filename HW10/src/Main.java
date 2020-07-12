import controller.Controller;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Controller controller = new Controller();
        controller.start();
        try {
            controller.sleep(90000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
