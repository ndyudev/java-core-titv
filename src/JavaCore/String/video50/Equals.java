package JavaCore.String.video50;

import java.util.Scanner;

public class Equals {
    public static void main(String[] args) {
        final String password = "NDYUDEV";
        Scanner sc = new Scanner(System.in);
        String psUser;
        System.out.print("Enter password: ");
        psUser = sc.nextLine();
        if (psUser.equals(password)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("password doesn't match!");
        }
    }
}
