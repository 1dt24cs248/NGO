import java.util.Scanner;

class BusinessPartner {

    int partnerId;
    String partnerName;
    String companyName;
    String email;
    String phone;

    void getDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Partner ID: ");
        partnerId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Partner Name: ");
        partnerName = sc.nextLine();

        System.out.print("Enter Company Name: ");
        companyName = sc.nextLine();

        System.out.print("Enter Email: ");
        email = sc.nextLine();

        System.out.print("Enter Phone Number: ");
        phone = sc.nextLine();
    }

    void displayDetails() {
        System.out.println("\n===== Business Partner Details =====");
        System.out.println("Partner ID      : " + partnerId);
        System.out.println("Partner Name    : " + partnerName);
        System.out.println("Company Name    : " + companyName);
        System.out.println("Email           : " + email);
        System.out.println("Phone Number    : " + phone);
    }

    public static void main(String[] args) {
        BusinessPartner bp = new BusinessPartner();

        bp.getDetails();
        bp.displayDetails();
    }
}