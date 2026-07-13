import java.util.Scanner;

class CabDriver {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Driver ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Driver Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Cab Number: ");
        String cabNo = sc.nextLine();

        System.out.print("Enter Mobile Number: ");
        String mobile = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        System.out.println("\n------ Cab Driver Details ------");
        System.out.println("Driver ID      : " + id);
        System.out.println("Driver Name    : " + name);
        System.out.println("Cab Number     : " + cabNo);
        System.out.println("Mobile Number  : " + mobile);
        System.out.println("Salary         : " + salary);

        sc.close();
    }
}