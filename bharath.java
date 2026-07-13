import java.util.Scanner;

class Bharat {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String name = sc.nextLine();

        System.out.println("\nWelcome " + name);

        System.out.println("\n------ Information About Bharat ------");
        System.out.println("Country Name   : Bharat (India)");
        System.out.println("Capital        : New Delhi");
        System.out.println("National Animal: Bengal Tiger");
        System.out.println("National Bird  : Peacock");
        System.out.println("National Flower: Lotus");
        System.out.println("National Fruit : Mango");
        System.out.println("National Tree  : Banyan Tree");
        System.out.println("National River : Ganga");
        System.out.println("Currency       : Indian Rupee (INR)");
        System.out.println("Official Languages : Hindi and English");

        System.out.println("\nBharat is known for its rich culture,");
        System.out.println("diverse traditions, festivals, and history.");

        sc.close();
    }
}