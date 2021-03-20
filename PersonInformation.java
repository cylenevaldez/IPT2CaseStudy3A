package PersonInformation;

import java.util.Scanner;

public class PersonInformation {

    public static void main(String[] args) {
        
        Person pr = new Person();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("First Name: ");
        String Fname = sc.nextLine();
        pr.getFname(Fname);
        
        System.out.print("Last Name: ");
        String Lname = sc.nextLine();
        pr.getLname(Lname);
        
        System.out.print("Middle Name: ");
        String Mname = sc.nextLine();
        pr.getMname(Mname);
        
        System.out.print("Citizenship: ");
        int cz = sc.nextInt();
        pr.getCitizen(cz);
        
        System.out.print("Gender: ");
        String gn = sc.nextLine();
        pr.getGender(gn);
        
        System.out.print("Address: ");
        String add = sc.nextLine();
        pr.getAddress(add);
       
        System.out.print("Contact No.: ");
        int cn = sc.nextInt();
        pr.getContactNo(cn);
        
        System.out.print("Email: ");
        String em = sc.nextLine();
        pr.getEmail(em);
        
        System.out.print("Civil Status: ");
        String cs = sc.nextLine();
        pr.getCivil(cs);
    }
}
