import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Office office = new Office();
        String sttoint,empid;
        int temp;

        System.out.println("Welcome!!");
        while (true) {
            try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "javaclass",
                    "123")) {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                connection.setAutoCommit(false);
                PreparedStatement preparedStatement;

                System.out.println("What do you want??(enter the number) 1.Show department 2.Show employees 3.Hiring employees " +
                        "4.Update employees info 5.Firing employees (for exit enter any key)");
                sttoint = input.nextLine();
                temp = Integer.parseInt(sttoint);
                //SHOW DEPARTMENT
                if (temp == 1){
                    System.out.println("1. Financial Department 2. Design Department 3. Support Department");
                    continue;
                }
                //SHOW EMPLOYEES
                else if (temp == 2){
                    Statement statement = connection.createStatement();
                    ResultSet resultSet = statement.executeQuery("select * from office");
                    while(resultSet.next()) {
                        System.out.print("EmployeeID: "+resultSet.getString("id")+", ");
                        System.out.print("Name of the Employee: "+resultSet.getString("name")+", ");
                        System.out.print("Department: "+resultSet.getString("department"));
                        System.out.println();
                    }
                    continue;
                }
                //HIRING EMPLOYEES
                else if (temp == 3) {
                    System.out.print("Enter EmployeeID : ");
                    office.setId(input.nextLine());
                    System.out.print("Enter Name of the Employee : ");
                    office.setName(input.nextLine());
                    System.out.print("Enter Employee Department : ");
                    office.setDepartment(input.nextLine());
                    preparedStatement = connection.prepareStatement("insert into office (id , name , department ) values (?,?,?)");
                    preparedStatement.setString(1, office.getId());
                    preparedStatement.setString(2, office.getName());
                    preparedStatement.setString(3, office.getDepartment());
                    preparedStatement.executeUpdate();
                    connection.commit();
                    System.out.println("Employee added successfully .");
                    continue;
                }
                // UPDATE INFO
                else if (temp == 4) {
                    System.out.print("Enter EmployeeID to Update Employee Info : ");
                    empid = input.nextLine();
                    preparedStatement = connection.prepareStatement("update office set name=? , department=?  where id =? ");
                    System.out.print("Enter new name : ");
                    office.setName(input.nextLine());
                    preparedStatement.setString(1, office.getName());
                    System.out.print("Enter new Department of Employee : ");
                    office.setDepartment(input.nextLine());
                    preparedStatement.setString(2, office.getDepartment());
                    preparedStatement.setString(3, empid);
                    preparedStatement.execute();
                    connection.commit();
                    System.out.println("Employee " + empid + " updated.");
                    continue;
                }
                //FIRING EMPLOYEES
                else if (temp == 5){
                    System.out.print("Enter EmployeeID to delete Employee : ");
                    empid = input.nextLine();
                    preparedStatement = connection.prepareStatement("delete from office where id = ?");
                    preparedStatement.setString(1, empid);
                    preparedStatement.execute();
                    connection.commit();
                    System.out.println("Office " + empid + " deleted.");
                    continue;
                }
                //EXIT
                else
                    break;

            } catch (ClassNotFoundException e) {
                System.out.println("DB Driver Not Exist!!");
            } catch (SQLException e) {
                System.out.println("DB ERROR " + e.getMessage());
            }

        }
    }//end of mian
}//end of class