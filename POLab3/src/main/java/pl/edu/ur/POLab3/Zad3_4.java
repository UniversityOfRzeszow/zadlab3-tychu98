/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.POLab3;

/**
 *
 * @author tychu
 */
public class Zad3_4 {

    public Zad3_4(int x) {

        int y = 0, fib = 1;

        for (int i = 1; i < x; i++) {

            fib += y;
            y = fib - y;

        }
        System.out.println(x + "-ty wyraz ciągu Fibonacciego wynosi: " + fib);
    }

}
