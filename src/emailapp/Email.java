package emailapp;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Email {//objects
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity=500;
    private String alternateEmail;
    private int defaultPasswordLength=10;
    private String email;
    private String companySuffix="xyzcompany.com";

    //Constructor to receive first and last name
    public Email(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
        System.out.println("EMAIL CREATED: " + this.firstName+ " " + this.lastName);

        //calling a method asking for department and returning the department
        this.department=setDepartment();
        System.out.println("Department:" + this.department);
        //calliing a method that returns a random password
        this.password= randomPassword(defaultPasswordLength=10);
        System.out.println("Your Password is :" + this.password);

        //combine elements to generate email
        email=firstName.toLowerCase()+ "."+ lastName.toLowerCase() +"@"+ department+ "."+ companySuffix;
        System.out.println("Your Email is: " + email);


    }

    //Ask for department
    private String setDepartment() {
        System.out.print("Department codes\n1 for Sales\n2 for Development \n3 for Accounting\n0 for none\n Enter Department code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) {
            return "Sales";
        } else if (depChoice == 2) {
            return "Development";
        } else if (depChoice == 3) {
            return "Accounting";
        } else if (depChoice == 0) {
            return " ";
        }
        return null;
    }


        //generate random password


        private String randomPassword(int length) {
            String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
            char[] password = new char[length];
            Random random = new Random();

            for (int i = 0; i < length; i++) {
                int rand = random.nextInt(passwordSet.length());
                password[i] = passwordSet.charAt(rand);
            }

            return new String(password);
        }



        //set the mailbox capacity

    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity=capacity;
    }

        //set the alternate email
    public void setAlternateEmail(String altEmail){
        this.alternateEmail=altEmail;
    }

        //change the password
    public void changePassword(String password){
            this.password=password;
        }

        public int getMailboxCapacity(){return mailboxCapacity;}
        public String getAlternateEmail(){ return alternateEmail;}
        public String getPassword(){ return password;}




}
