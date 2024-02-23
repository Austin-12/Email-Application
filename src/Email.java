import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private int passwordLength = 10;
    private String department;
    private String email;
    private int mailboxCapacity = 500;
    private String alternateEmail;
    private String companySuffix = "Mycompany.com";

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        //call a method asking for the department - return the department
        this.department = setDepartment();

        //call a method that returns a random password
        this.password = randomPassword(passwordLength);
        System.out.println("Your password is: " + this.password);

        //combine elements to make email
        email = firstName.toLowerCase() + "." +lastName.toLowerCase() + "@" + department + "." + companySuffix;
    }

    //ask for department
    private String setDepartment() {
        System.out.print( "New worker: " + firstName +". Department Codes: \n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");

        Scanner in = new Scanner(System.in);
        int deptChoice = in.nextInt();

        if(deptChoice == 1) {
            return "sales";
        } else if(deptChoice == 2) {
            return "dev";
        } else if(deptChoice == 3) {
            return "acct";
        } else {
            return "";
        }

        }

        //generate random password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char [] password = new char[length];

        for(int i = 0; i < length; i++) {
            int rand = (int)(Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    //set mailbox capacity
    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    //set alt email
    public void setAtlernateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }

    //change password
    public void changePassword(String password) {
        this.password = password;
    }

    //get mailboxcapacity
    public int getMailboxCapacity() {
        return mailboxCapacity;
    }
    //get alt email
    public String getAlternateEmail() {
        return alternateEmail;
    }
    //get password
    public String getPassword() {
        return password;
    }

    public String showInfo() {
        return "DISPLAY NAME: " + firstName + " " + lastName +
                "\nCOMPANY EMAIL: " + email +
                "\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
    }
    }


