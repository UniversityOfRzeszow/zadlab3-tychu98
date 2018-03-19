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
public class Zad3_3Iteracja {

    int a, b;

    public Zad3_3Iteracja(int a, int b) {
        this.a = a;
        this.b = b;

        int potega = 1;

        for (int i = 0; i < b; i++) {
            potega *= a;
        }
        System.out.println("Wartość wyrażenia " + a + "^" + b + " = " + potega);
    }

}
