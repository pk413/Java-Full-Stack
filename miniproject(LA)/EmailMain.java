package Hello.World;

import java.util.Random;

class Email {
    private String firstName;
    private String lastName;
    private String email;
    private int mailboxCapacity;
    private String alternateEmail;
    private String password;
    private Random rand;
    
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@example.com";
        this.mailboxCapacity = 500;
        this.alternateEmail = "";
        this.rand = new Random();
        this.password = generatePassword();
    }
    
    private String generatePassword() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            sb.append((char) (rand.nextInt(26) + 'a'));
        }
        return sb.toString();
    }
    
    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }
    
    public void setAlternateEmail(String email) {
        this.alternateEmail = email;
    }
    
    public void changePassword() {
        this.password = generatePassword();
    }
    
    public void displayInfo() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Email: " + email);
        System.out.println("Mailbox Capacity: " + mailboxCapacity);
        System.out.println("Alternate Email: " + alternateEmail);
        System.out.println("Password: " + password);
    }
}

public class EmailMain {
    public static void main(String[] args) {
        Email email = new Email("John", "Doe");
        email.displayInfo();
        email.setMailboxCapacity(1000);
        email.setAlternateEmail("johndoe@gmail.com");
        email.changePassword();
        email.displayInfo();
    }
}

