package pl.edu.ur.POLab3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tychu
 */
public class Zad1_4 {

    int q;
    int x;

    public Zad1_4(int x) {
        this.x = x;
        System.out.println("x=" + x);
        System.out.println("Przesunięcie x o 3 w lewo bez znaku");
        q = (x << 3);
        System.out.println("x=" + q);
        System.out.println("Przesunięcie x o 3 w prawo bez znaku");
        q = (x >> 3);
        System.out.println("x=" + q);
        System.out.println("Przesunięcie x o 3 w prawo ze znakiem");
        q = (x >>> 3);
        System.out.println("x=" + q);

    }

}
