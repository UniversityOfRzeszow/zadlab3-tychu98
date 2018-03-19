/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.POLab3;

import java.util.Scanner;

/**
 *
 * @author Asia
 */
public class Main {

    public static int rekurencja(int x, int y) {

        if (y == 0) {
            return 1;
        }

        return x * rekurencja(x, --y);
    }

    public static void main(String[] args) {
        // TODO 1.4, 1.7, 
        // TODO 2.2
        // TODO 3.3, 3.4
        int x = -4, y = 5, z = 6;
        Scanner we = new Scanner(System.in);
        System.out.println("Podaj numer zadania, które ma zostac wyświetlone: ");
        int n = we.nextInt();

        switch (n) {

            case 1:
                Zad1_4 zad1 = new Zad1_4(x);
                break;

            case 2:
                Zad1_7 zad2 = new Zad1_7(y, z);
                break;
            case 3:
                Zad2_2 zad3 = new Zad2_2();
                break;

            case 4:
                System.out.println("Iteracja");
                System.out.print("Podaj podstawę potęgi: ");
                int a = we.nextInt();
                System.out.print("\n\nPodaj wykładnik potęgi: ");
                int b = we.nextInt();

                Zad3_3Iteracja zad4_1 = new Zad3_3Iteracja(a, b);

                System.out.println("Rekurencja:");

                System.out.print("Podaj podstawę potęgi: ");
                a = we.nextInt();
                System.out.print("\n\nPodaj wykładnik potęgi: ");
                b = we.nextInt();
                int wynik = rekurencja(a, b);

                System.out.println("Wartość wyrażenia " + a + "^" + b + " = " + wynik);

                break;

            case 5:
                System.out.println("Podaj który wyraz ciągu Fibonacciego ma zostać wyliczony(Iteracja): ");
                a = we.nextInt();
                Zad3_4 zad5 = new Zad3_4(a);
                break;
            default:
                System.out.println("Nie ma takiego numeru zadania");

        }
    }
}
