/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.POLab3;

import java.util.Arrays;

/**
 *
 * @author tychu
 */
public class Zad2_2 {

    public Zad2_2() {

        String wyraz1 = "Raz dwa trzy";
        String wyraz2 = "Raz Dwa Trzy Cztery";
        String wyraz3 = "raz dwa Trzy";
        String wyraz4 = "    Raz dwa trzy    ";

        System.out.println(wyraz1.toCharArray());
        System.out.println(Arrays.toString(wyraz1.getBytes()));
        System.out.println(wyraz1.equals(wyraz2));
        System.out.println(wyraz1.equalsIgnoreCase(wyraz3));
        System.out.println(wyraz1.compareTo(wyraz2));
        System.out.println(wyraz1.compareToIgnoreCase(wyraz2));
        System.out.println(wyraz1.indexOf('d'));
        System.out.println(wyraz1.lastIndexOf('r'));
        System.out.println(wyraz1.substring(4));
        System.out.println(wyraz1.substring(0, 5));
        System.out.println(wyraz1.replace('d', 's'));
        System.out.println(wyraz4.trim());
        System.out.println(wyraz1.toLowerCase());
        System.out.println(wyraz1.toUpperCase());
        String[] wyrazPodziel = wyraz1.split("dwa");
        String cz1 = wyrazPodziel[0];
        String cz2 = wyrazPodziel[1];
        System.out.println(cz1);
        System.out.println(cz2);

    }

}
