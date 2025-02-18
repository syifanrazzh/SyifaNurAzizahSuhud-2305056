package com.syifa.tugaspertemuan2;

import java.util.Scanner;

public class Tugaspertemuan22 {
    
    public static void main(String[] args) {
        Scanner inputRanking = new Scanner(System.in);

        System.out.print("Masukkan ranking Anda: ");
        int ranking = inputRanking.nextInt();
        System.out.print("Apakah Anda naik kelas? (true/false): ");
        boolean naikKelas = inputRanking.nextBoolean();

        String hasil = ((ranking == 1) && (naikKelas)) ? 
                        "Selamat! anda mendapatkan hadiah!" : 
                        "Anda belum mendapat hadiah, tetap semangat!";

        System.out.println(hasil);

    }
}

