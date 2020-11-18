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
    }

    // Ask for department

    // Generate random password

    // Set the mailbox capacity

    // Set the alternate email

    // Change the password
}
