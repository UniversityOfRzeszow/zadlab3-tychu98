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
public class Zad1_7 {

    int x, y, z;

    public Zad1_7(int x, int y) {
        this.x = x;
        this.y = y;

        System.out.println("Operator logiczny XOR(^) porównuje nam bity podanych liczb, jeśli są one takie same wypisuje 0, w przeciwnym wypadku wypisane zostanie j");
        z = x ^ y;
        System.out.println("Wartość wyrażenia x=5 XOR y=6 wynosi " + z);
        System.out.println("Operator logiczny NOT(!) jest zwykłym zaprzeczeniem danego wyrażenia");
        if (x != y) {
            System.out.println("Liczby są różne");
        } else {
            System.out.println("Liczby są równe");
        }

    }

}
