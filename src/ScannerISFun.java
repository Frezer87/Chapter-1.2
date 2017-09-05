/**
 * Display: CSC200 1.2
 * AUTHOR Frezer
 * License: GMU Licens
 * Crated on 09/05/17
 * Version 1.1
 */
import java.util.Scanner;
public class ScannerISFun{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println(" Enter your name");
        String name = keyboard.next();
        System.out.println ("Enter your password");
        int password = keyboard.nextInt();
        System.out.println ("Hello Mr." + name + ". Your password is " + password);
    }
}