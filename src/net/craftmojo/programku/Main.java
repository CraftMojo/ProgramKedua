/*
Created by Yanto Setiawan
Date:
 */

package net.craftmojo.programku;

import java.util.Scanner;

public class Main {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        persegiPanjang();
        System.out.println("===============");
        segitiga();
    }

    private static void persegiPanjang() {
        //init
        PersegiPanjang PP = new PersegiPanjang();

        //input
        System.out.print("Masukkan Panjang: ");
        PP.setP(input.nextInt());

        System.out.print("Masukkan Lebar: ");
        PP.setL(input.nextInt());

        //output
        System.out.println("Luas Persegi Panjang= " + PP.luasPersegiPanjang());
    }

    private static void segitiga() {
        //init
        Segitiga SS = new Segitiga();

        //input
        System.out.print("Masukkan Alas: ");
        SS.setA(input.nextInt());

        System.out.print("Masukkan Tinggi: ");
        SS.setT(input.nextInt());

        //output
        System.out.println("Luas Persegi Panjang= " + SS.luasSegitiga());
    }


}



