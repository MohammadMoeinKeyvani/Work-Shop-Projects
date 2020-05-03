import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Employee  e []=new Employee[5];
        e [0]=new Employee();
        e [1]=new Employee();
        e [2]=new Employee();
        e [3]=new Employee();
        e [4]=new Employee();

        int i;

        for (i=0;i<5;i++)
        {
            System.out.println("Enter name of "+ (i+1) +" employee : ");
            e[i].setName(input.nextLine());
            System.out.println("Enter id of "+ (i+1) +" employee : ");
            String id=input.nextLine();
            long myid=Long.parseLong(id);
            e[i].setId(myid);
            System.out.println("Enter station of "+ (i+1) +" employee : ");
            e[i].setStation(input.nextLine());
            System.out.println("Enter age of "+ (i+1) +" employee : ");
            String age=input.nextLine();
            int myage=Integer.parseInt(age);
            e[i].setAge(myage);
        }

        System.out.println("Enter id that you want: ");
        long se=input.nextLong();

        for (i=0;i<5;i++)
        {
            if (e[i].getId()==se)
            {
                System.out.println("Personality of Employee that you intered :");
                System.out.println("Name : "+e[i].getName());
                System.out.println("Id : "+e[i].getId());
                System.out.println("Station : "+e[i].getStation());
                System.out.println("Age : "+e[i].getAge());
            }
        }

    }
}
