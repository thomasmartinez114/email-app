import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;

    // Constructor to receive the first & last name
    public Email(String firstName, String lastName){
        this.firstName = firstName; // this.firstName refers to Class Level above, firstName local
        this.lastName = lastName;
        System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);

        // Call a method asking for department - return department
        this.department = setDepartment();
        System.out.println("Department: " + this.department);

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

    // Set the mailbox capacity

    // Set the alternate email

    // Change the password
}
