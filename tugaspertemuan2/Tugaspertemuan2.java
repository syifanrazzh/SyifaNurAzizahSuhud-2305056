package com.syifa.tugaspertemuan2;

import java.util.Scanner;

public class Tugaspertemuan2 {

    public static void main(String[] args) {
         Scanner inputBilangan = new Scanner(System.in);

        System.out.print("Masukkan bilangan pecahan pertama: ");
        double a = inputBilangan.nextDouble();
        System.out.print("Masukkan bilangan pecahan kedua: ");
        double b = inputBilangan.nextDouble();
        System.out.print("Masukkan bilangan pecahan ketiga: ");
        double c = inputBilangan.nextDouble();

        double penjumlahan = a + b + c;
        double pengurangan = a - b - c;
        double perkalian = a * b * c;
        double pembagian = a / b / c;
      
        System.out.println("\nHasil operasi:");
        System.out.println("Penjumlahan: " + penjumlahan);
        System.out.println("Pengurangan: " + pengurangan);
        System.out.println("Perkalian: " + perkalian);
        System.out.println("Pembagian: " + pembagian);

    }
}
