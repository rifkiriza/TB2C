/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.TB2C;

import java.util.Scanner;

/**
 *
 * @author Riza7
 */
public class TesRuangKelas {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        KontrolKelas Laptop = new KontrolKelas();

        //Identitas Ruang Kelas
        String nama, lokasi;
        System.out.println(" - Identias Ruang Kelas -\n");
        System.out.println("Nama Ruang      : ");
        nama = in.nextLine();
        System.out.println("Lokasi Ruang    : ");
        lokasi = in.nextLine();
        System.out.println("Nama Fakultas   : ");
        lokasi = in.nextLine();

        //Kondisi Ruang Kelas
        Laptop.hitungLuasRuang();
        Laptop.hitungBentukRuang();
        Laptop.hitungRasioLuas();
        Laptop.analisisPintuDanJendela();

        //Jumlah, Kondisi dan Posisi Sarana
        Laptop.analisisKelistrikan();
        Laptop.analisisLCD();
        Laptop.analisisLampu();
        Laptop.analisisKipasAngin();
        Laptop.analisisAC();
        Laptop.analisisIntrnet();
        Laptop.analisisCCTV();

        //Lingkungan Ruang Kelas
        Laptop.analisisKebersihan();

        //Kebersihan Ruang Kelas
        Laptop.analisisSirkulasiUdara();
        Laptop.anaisisPencahayaan();
        Laptop.analisisKelembapan();
        Laptop.analisisSuhu();

        //Kenyamanan Ruang Kelas
        Laptop.analisisKebisingan();
        Laptop.analisisbau();
        Laptop.analisisKebocoran();
        Laptop.analisisKerusakan();
        Laptop.analisisKeausan();

        //Keamanan Ruang Kelas
        Laptop.anaisisKekokohan();
        Laptop.analisisKunciPintudanJendela();
        Laptop.analisisKeamananRuang();
        
       
    }
}
