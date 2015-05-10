/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.TB2C;

import java.util.Scanner;


  public class TesRuangKelas {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        CetakKelas Laptop = new CetakKelas();
        
        
        
        //identitas Ruang Kelas
        Laptop.identitasRuang();

        //Kondisi Ruang Kelas
        Laptop.PerhitunganKelas();
        Laptop.AnalisisLuasRuang();
        Laptop.CetakLuasKelas();
        Laptop.AnalisisRasioLuas();
        Laptop.CetakRasioRuangKelas();
        Laptop.JumlahPintuDanJendela();
        Laptop.CetakJumlahPintudanJendela();
        Laptop.AnalisisJumlahPintudanJendela();
        
        //Jumlah, Kondisi dan Posisi Sarana
        Laptop.Kelistrikan();
        Laptop.CetakKelistrikan();
        Laptop.AnalisisKelistrikan();
        Laptop.LCD();
        Laptop.CetakLCD();
        Laptop.AnalisisLCD();
        Laptop.Lampu();
        Laptop.CetakLampu();
        Laptop.AnalisisLampu();
        Laptop.KipasAngin();
        Laptop.CetakKipasAngin();
        Laptop.AnalisisKipasAngin();
        Laptop.AC();
        Laptop.CetakAC();
        Laptop.AnalisisAC();
        Laptop.Intrnet();
        Laptop.CetakInternet();
        Laptop.AnalisisInternet();
        Laptop.CCTV();
        Laptop.CetakCCTV();
        Laptop.AnalisisCCTV();
        
        //Lingkungan Ruang Kelas
        Laptop.Kebersihan();
        Laptop.CetakKebersihan();
        Laptop.AnalisisKebersihan();

        //Kebersihan Ruang Kelas
        Laptop.SirkulasiUdara();
        Laptop.CetakSirklusiUdara();
        Laptop.AnalisisSirkulasiUdara();
        Laptop.Pencahayaan();
        Laptop.CetakPencahayaan();
        Laptop.AnalisisPencahayaan();
        Laptop.Kelembapan();
        Laptop.CetakKelembapan();
        Laptop.AnalisisKelembapan();
        Laptop.Suhu();
        Laptop.CetakSuhu();
        Laptop.AnalisisSuhu();
        
        //Kenyamanan Ruang Kelas
        Laptop.Kebisingan();
        Laptop.CetakKebisingan();
        Laptop.AnalisisKebisingan();
        Laptop.Bau();
        Laptop.CetakBau();
        Laptop.AnalisisBau();
        Laptop.Kebocoran();
        Laptop.CetakKebocoran();
        Laptop.AnalisisKebocoran();
        Laptop.Kerusakan();
        Laptop.CetakKerusakan();
        Laptop.AnalisisKerusakan();
        Laptop.Keausan();
        Laptop.CetakKeausan();
        Laptop.AnalisisKeausan();
        
        //Keamanan Ruang Kelas
        Laptop.Kekokohan();
        Laptop.CetakKekokohan();
        Laptop.AnalisisKekokohan();
        Laptop.KunciPintudanJendela();
        Laptop.CetakKunciPintuJendela();
        Laptop.AnalisisKunciPintudanJendela();
        Laptop.KeamananRuang();
        Laptop.CetakKeamanan();
        Laptop.AnalisisKeamananRuang();
        
       
    }
}
