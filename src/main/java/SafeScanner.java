package main.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SafeScanner{
    Scanner scanner;
    public SafeScanner(){
        this.scanner = new Scanner(System.in);
    }

    public int getInt(){
        int i = 0;
        int nombre = 0;
        while (i==0)
        {
            try
            {
             Scanner scanner = new Scanner(System.in);
             nombre = scanner.nextInt();
             i = 1;
            }
            catch(InputMismatchException e)
            {
            System.out.println("Saisir un integer : ");
            }
        }
        return nombre;
        }


    public void closeScanner(){
        scanner.close();
    }

}
