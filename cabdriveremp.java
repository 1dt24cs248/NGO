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

import java.util.Scanner;

class CabDriver {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Driver ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Driver Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Gender: ");
        String gender = sc.nextLine();

        System.out.print("Enter Cab Number: ");
        String cabNo = sc.nextLine();

        System.out.print("Enter Driving License Number: ");
        String license = sc.nextLine();

        System.out.print("Enter Mobile Number: ");
        String mobile = sc.nextLine();

        System.out.print("Enter City: ");
        String city = sc.nextLine();

        System.out.print("Enter Experience (Years): ");
        int experience = sc.nextInt();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        System.out.println("\n========== Cab Driver Details ==========");
        System.out.println("Driver ID        : " + id);
        System.out.println("Driver Name      : " + name);
        System.out.println("Age              : " + age);
        System.out.println("Gender           : " + gender);
        System.out.println("Cab Number       : " + cabNo);
        System.out.println("License Number   : " + license);
        System.out.println("Mobile Number    : " + mobile);
        System.out.println("City             : " + city);
        System.out.println("Experience       : " + experience + " Years");
        System.out.println("Salary           : ₹" + salary);

        if (experience >= 5) {
            System.out.println("Driver Status    : Senior Driver");
        } else {
            System.out.println("Driver Status    : Junior Driver");
        }

        sc.close();
    }
}