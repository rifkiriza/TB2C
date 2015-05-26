/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.TB2C;

import java.util.Scanner;


import java.util.Scanner;

public class TesRuangKelas {

    public static void main(String[] args) {
        String namaRuang;
        String lokasi;
        String fakultas;
        
        Scanner in = new Scanner(System.in);
        KontrolKelas Laptop = new KontrolKelas();

        System.out.println("Masukkan Nama Ruang : ");
        namaRuang = in.nextLine();
        System.out.println("\nMasukkan Lokasi : ");
        lokasi = in.nextLine();
            
        //identitas Ruang Kelas
        System.out.println("\nApakah Anda Mahasiswa Fakultas Teknik Informatika :         - ( ya atau tidak ) -");
        String jawab = in.nextLine();
        if (jawab.equals("ya")) {
            Laptop.IdentitasKelas(namaRuang, lokasi);
        } else {
            System.out.println("\nMasukkan Nama Fakultas : ");
            fakultas = in.nextLine();
            Laptop.IdentitasKelas(namaRuang, lokasi, fakultas);
        }

        //Kondisi Ruang Kelas
        Laptop.PerhitunganKelas();
        Laptop.JumlahPintuDanJendela();

        //Jumlah, Kondisi dan Posisi Sarana
        Laptop.Kelistrikan();
        Laptop.LCD();
        Laptop.Lampu();
        Laptop.KipasAngin();
        Laptop.AC();
        Laptop.Intrnet();
        Laptop.CCTV();

        //Lingkungan Ruang Kelas
        Laptop.Kebersihan();

        //Kebersihan Ruang Kelas
        Laptop.SirkulasiUdara();
        Laptop.Pencahayaan();
        Laptop.Kelembapan();
        Laptop.Suhu();

        //Kenyamanan Ruang Kelas
        Laptop.Kebisingan();
        Laptop.Bau();
        Laptop.Kebocoran();
        Laptop.Kerusakan();
        Laptop.Keausan();

        //Keamanan Ruang Kelas
        Laptop.Kekokohan();
        Laptop.KunciPintudanJendela();
        Laptop.KeamananRuang();

        //Analisis dan Output Ruang Kelas
        Laptop.AnalisisDanOutput();

    }
}
