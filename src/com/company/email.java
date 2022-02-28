package com.company;


import java.util.Scanner;

public class email {
     private String firstname;
     private String lastname;
     private String password;
     private String email;
     private String department;
     private int mailboxCapacity=50;
     private int defaultPasswordLength = 5;
     private String companyDomain = "jamesholdings.com";
     private String alternativeEmail;

     public email(String firstname, String lastname){

         //constructor to get the firstname and the lastname.

         this.firstname = firstname;
         this.lastname = lastname;
         System.out.println("Email created: "+this.firstname +" "+ this.lastname);

         //calling a method for asking for a department and then return department.
         this.department = departments();
         System.out.println("Department: "+this.department);

         //calling the method for setting a password
         this.password = randomPassword(defaultPasswordLength);
         System.out.println("Your password is:  "+this.password);

         //combination of the email.
         email = firstname.toLowerCase() + "."+ lastname.toLowerCase()+ "@" + department +"."+ companyDomain;
         System.out.println("Your email is: " + email);
     }
     private String departments(){

         //method for asking for a department.

         System.out.print("Enter your department\n1 for Sales\n2 for Engineering\n3 for Accounting\n4" +
                 " for Transportation\nSelect your department: ");
         System.out.println();
         Scanner scan = new Scanner(System.in);
         int depChoice = scan.nextInt();
         if (depChoice ==1 ){
             return "sales";
         }else if (depChoice ==2){
             return "Engineering";
         }else if (depChoice ==3){
             return "Accounting";
         }else if (depChoice== 4){
             return "Transportation";
         }else {return "";}


     }
     //create a random password
    private String randomPassword(int length){
         String passwordset = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%&";
         char[]  password = new char[length];
         for (int i=0; i<length; i++){
             int randomnumber = (int) (Math.random() * passwordset.length());
             password[i] = passwordset.charAt(randomnumber);
         }
         return new String(password);
    }
    //set the email capacity.
    public void mailboxCapacity(int capacity){
         this.mailboxCapacity = capacity;
    }
    //set email alternative.
    public void setAlternativeEmail(String altemail){
         this.alternativeEmail= altemail;
    }
    //change password.
    public void changePassword(String newpassword){
         this.password = newpassword;
    }

    public int getMailboxCapacity(){return mailboxCapacity;}
    public String getAlternativeEmail(){return alternativeEmail;}
    public String getPassword(){return password;}

}

