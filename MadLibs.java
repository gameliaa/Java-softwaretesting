package Ch2;

import java.util.Scanner;

public class MadLibs {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a seson of the year:");
        String season = scanner.next();

//        step 2
        System.out.println("Enter a whole number:");
        int number = scanner.nextInt();

//        step 3
        System.out.println("Enter an adjective:");
        String adjective = scanner.next();
        scanner.close();

        System.out.println("On a " + adjective  + " " + season + " day, I drink a minium of " + number + " cup of coffee");
    }
}
