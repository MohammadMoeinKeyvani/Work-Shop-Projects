import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int meg,mes,incall,oucall;
        Sim a = new Sim();
        Bill bill = new Bill();
        System.out.println("Please enter the megabyte used of the internet : ");
        meg=input.nextInt();
        a.setMg(meg);
        System.out.println("Please enter the number of the messages that you send : ");
        mes=input.nextInt();
        a.setPm(mes);
        System.out.println("Please enter the minutes of inner call that you used : ");
        incall=input.nextInt();
        a.setInnerCalls(incall);
        System.out.println("Please enter the minutes of outter call that you used : ");
        oucall=input.nextInt();
        a.setOutterCalls(oucall);
        bill.costCalculater(a);
    }


}
