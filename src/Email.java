import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String alternateEmail;
    private String companySuffix = "halfabilco.com";

    // Constructor to receive the first & last name
    // public Email(String firstName, String lastName){
    public Email(){
       // this.firstName = firstName; // this.firstName refers to Class Level above, firstName local
       // this.lastName = lastName;

        Scanner in = new Scanner(System.in);

        // user input firstName
        System.out.print("Enter first name: ");
        String firstName = in.nextLine();

        // user input lastName
        System.out.print("Enter last name: ");
        String lastName = in.nextLine();

        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("======================================");

        // Call a method asking for department - return department
        this.department = setDepartment();
        System.out.println("Department: " + this.department);
        System.out.println("======================================");

        // Combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" +
                department.toLowerCase() + "." + companySuffix;
        System.out.println("Your email is: " + email);
        System.out.println("Login Name: " + this.firstName.toLowerCase() + "." + this.lastName.toLowerCase());

        // Call method that returns random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);
        System.out.println("======================================");
    }

    // Ask for department
    private String setDepartment() {
        System.out.print("DEPARTMENT CODES\n1 for Sales\n2 for Development" +
                "\n3 for Accounting\n0 for none\nEnter department code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();

        if (depChoice == 1) {
            return "Sales";
        } else if(depChoice == 2) {
            return "Development";
        } else if (depChoice == 3) {
            return "Accounting";
        } else {
            return "";
        }
    }

    // Generate random password
    private String randomPassword(int length) {
        String passwordSet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*;";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length()); // generate random pw from the letters
            password[i] = passwordSet.charAt(rand); // take the char at the number and set it to the passwordSet
        }
        return new String(password);
    }

    // Set the mailbox capacity
    // encapsulation -> hiding the property mailboxCapacity by having capacity be the
    // param setting to it
    public void setMailboxCapacity() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the mailbox capacity: ");
        this.mailboxCapacity = in.nextInt();
    }

    // Set the alternate email
    public void setAlternateEmail(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter alternative email: ");
        this.alternateEmail = in.nextLine();
    }

    // Change the password
    public void changePassword(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter new password: ");
        this.password = in.nextLine();
    }
}
