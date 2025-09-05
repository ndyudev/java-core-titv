package JavaCore.String.video50;

import java.util.Scanner;

public class Equals {
    public static void main(String[] args) {
    String password = "ndyudev";

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter password:");
    String enterPassword  = sc.nextLine();
    if(enterPassword.equalsIgnoreCase(password)){
        System.out.println("Password đúng");
    } else {
        System.out.println("Wrong password");
    }
    System.out.println("Length password:" + password.length());
    }
}
