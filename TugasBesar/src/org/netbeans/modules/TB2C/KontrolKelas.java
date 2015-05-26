/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.TB2C;

import java.util.Scanner;


public class KontrolKelas {

    Scanner in = new Scanner(System.in);
    CetakKelas Comp = new CetakKelas();

    void AnalisisDanOutput() {
        //Kondisi Ruang Kelas
        Comp.CetakLuasKelas();
        Comp.AnalisisLuasRuang();
        Comp.CetakRasioRuangKelas();
        Comp.AnalisisRasioLuas();
        Comp.CetakJumlahPintudanJendela();
        Comp.AnalisisJumlahPintudanJendela();

        //Jumlah, Posisi dan Rencana
        Comp.CetakKelistrikan();
        Comp.AnalisisKelistrikan();
        Comp.CetakLCD();
        Comp.AnalisisLCD();
        Comp.CetakLampu();
        Comp.AnalisisLampu();
        Comp.CetakKipasAngin();
        Comp.AnalisisKipasAngin();
        Comp.CetakAC();
        Comp.AnalisisAC();
        Comp.CetakInternet();
        Comp.AnalisisInternet();
        Comp.CetakCCTV();
        Comp.AnalisisCCTV();

        //Kebersihan Ruang Kelas
        Comp.CetakKebersihan();
        Comp.AnalisisKebersihan();
        Comp.CetakSirklusiUdara();
        Comp.AnalisisSirkulasiUdara();
        Comp.CetakPencahayaan();
        Comp.AnalisisPencahayaan();
        Comp.CetakKelembapan();
        Comp.AnalisisKelembapan();
        Comp.CetakSuhu();
        Comp.AnalisisSuhu();

        //Kenyamannan Ruang Kelas
        Comp.CetakKebisingan();
        Comp.AnalisisKebisingan();
        Comp.CetakBau();
        Comp.AnalisisBau();
        Comp.CetakKebocoran();
        Comp.AnalisisKebocoran();
        Comp.CetakKerusakan();
        Comp.AnalisisKerusakan();
        Comp.CetakKeausan();
        Comp.AnalisisKeausan();

        //Keamanan Ruang Kelas
        Comp.CetakKekokohan();
        Comp.AnalisisKekokohan();
        Comp.CetakKunciPintuJendela();
        Comp.AnalisisKunciPintudanJendela();
        Comp.CetakKeamanan();
        Comp.AnalisisKeamananRuang();
    }

    
    void IdentitasKelas(String namaRuang, String lokasi) {
        Comp.setNamaRuang(namaRuang);
        Comp.setLokasi(lokasi);

    }

    void IdentitasKelas(String namaRuang, String lokasi, String fakultas) {
        Comp.setNamaRuang(namaRuang);
        Comp.setLokasi(lokasi);
        Comp.setFakultas(fakultas);
    }

    //Kondisi Ruang Kelas
    void PerhitunganKelas() {
        System.out.println("\n - Kondisi Ruang Kelas - \n");
        System.out.println("Panjang Ruang       : ");
        Comp.setPanjang(in.nextInt());
        System.out.println("Lebar Ruang         : ");
        Comp.setLebar(in.nextInt());
        System.out.println("\nJumlah Kursi      : ");
        Comp.setJmlKursi(in.nextInt());

    }

    void JumlahPintuDanJendela() {
        System.out.println("\nJumlah Pintu        1. 1    2. 2    3. 4");
        System.out.println("Jumlah Jendela      1. 0    2. 1    3. 4");
        System.out.println("\nJumlah Pintu      : ");
        Comp.setJmlPintu(in.nextInt());
        System.out.println("Jumlah Jendela  : ");
        Comp.setJmlJendela(in.nextInt());

    }

    //Jumlah, Kondisi dan Posisi Sarana
    void Kelistrikan() {
        System.out.println("\n - Jumlah, Kondisi dan Posisi Sarana -");
        System.out.println("\nJumlah Stop Kontak      1. 2                        :  2. 4             :  3. 8");
        System.out.println("Kondisi Stop Kontak     1. Baik                     :  2. Kurang Baik   :  3. Rusak");
        System.out.println("Posisi Stop Kontak      1. Di Pojok dan Dekat Dosen :  2. Di Tengah     :  3. Di Bawah");
        System.out.println("\nJumlah Stop Kontak        : ");
        Comp.setJmlStopKontak(in.nextInt());
        System.out.println("Kondisi Stop Kontak     : ");
        Comp.setKondStopKontak(in.nextInt());
        System.out.println("Posisi Stop Kontak      : ");
        Comp.setPosStopKontak(in.nextInt());

    }

    void LCD() {
        System.out.println("\nJumlah Kabel LCD        1. 0           :   2. 1");
        System.out.println("Kondisi Kabel LCD       1. Berfungsi   :   2. Kurang Baik   :   3. Rusak");
        System.out.println("Posisi Kabel LCD        1. Dekat Dosen :   2. Dekat Pintu   :   3. Dekat Lampu");
        System.out.println("\nJumlah Kabel LCD      : ");
        Comp.setJmlKblLCD(in.nextInt());
        System.out.println("Kondisi Kabel lCD   : ");
        Comp.setKondKabelLCD(in.nextInt());
        System.out.println("Posisi Kabel LCD    : ");
        Comp.setPosKabelLCD(in.nextInt());

    }

    void Lampu() {
        System.out.println("\nJumlah Lampu    1. 4      :   2. 10            :   3. 18");
        System.out.println("Kondisi Lampu   1. Baik   :   2. Kurang Baik   :   3. Rusak");
        System.out.println("Posisi Lampu    1. Atap   :   2. Bawah         :   3. Samping");
        System.out.println("\nJumlah Lampu      : ");
        Comp.setJmlLampu(in.nextInt());
        System.out.println("Kondisi Lampu   : ");
        Comp.setKondLampu(in.nextInt());
        System.out.println("Posisi Lampu    : ");
        Comp.setPosLampu(in.nextInt());
    }

    void KipasAngin() {
        System.out.println("\nJumlah Kipas Angin      1. 1      :   2. 2             :   3. 4");
        System.out.println("Kondisi Kipas Angin     1. Baik   :   2. Kurang Baik   :   3. Rusak");
        System.out.println("Posisi Kipas Angin      1. Atap   :   2. Bawah         :   3. Samping");
        System.out.println("\nJumlah Kipas Angin        : ");
        Comp.setJmlKipas(in.nextInt());
        System.out.println("Kondisi Kipas Angin     : ");
        Comp.setKondKipas(in.nextInt());
        System.out.println("Posisi Kipas Angin      : ");
        Comp.setPosKipas(in.nextInt());
    }

    void AC() {
        System.out.println("\nJumlah AC       1. 0       :   2. 1             :   3. 2");
        System.out.println("Kondisi AC      1. Baik    :   2. Kurang Baik   :   3. Rusak");
        System.out.println("Posisi AC       1. Depan   :   2. Samping       :   3. Belakang");
        System.out.println("\nJumlah AC         : ");
        Comp.setJmlAC(in.nextInt());
        System.out.println("Kondisi AC      : ");
        Comp.setKondAC(in.nextInt());
        System.out.println("Posisi AC       : ");
        Comp.setPosAC(in.nextInt());

    }

    void Intrnet() {
        System.out.println("\nPilih SSID      1. UMM Hotspot  :   2. Riza Hotspot    :  3. Gangga Hotspot   :   4. Adi Hotspot");
        System.out.println("Konektifitas    1. Bisa Login   :   2. Tidak Bisa Login");
        System.out.println("\nPilih SSID        : ");
        Comp.setSSID(in.nextInt());
        System.out.println("Konektifitas    : ");
        Comp.setBandwidth(in.nextInt());

    }

    void CCTV() {
        System.out.println("\nJumlah CCTV     1. 0       :   2. 1   :   3. 2");
        System.out.println("Kondisi CCTV    1. Baik    :   2. Kurang Baik    :    3. Rusak");
        System.out.println("Posisi CCTV     1. Depan   :   2. Samping        :    3. Belakang");
        System.out.println("\nJumlah CCTV       : ");
        Comp.setJmlCCTV(in.nextInt());
        System.out.println("Kondisi CCTV    : ");
        Comp.setKondCCTV(in.nextInt());
        System.out.println("Posisi CCTV     : ");
        Comp.setPosCCTV(in.nextInt());

    }

    //Lingkungan Ruang Kelas
    void Kebersihan() {
        System.out.println("\n - Lingkungan Ruang Kelas -");
        System.out.println("\nKondisi Lantai        : ");
        Comp.setKondLantai(in.next());
        System.out.println("Kondisi Dinding     : ");
        Comp.setKondDinding(in.next());
        System.out.println("Kondisi Atap        : ");
        Comp.setKondAtap(in.next());
        System.out.println("Kondisi Pintu       : ");
        Comp.setKondPintu(in.next());
        System.out.println("Kondisi Jendela     : ");
        Comp.setKondJendela(in.next());

    }

    //Kebersihan Ruang Kelas
    void SirkulasiUdara() {
        System.out.println("\n - Kebersihan Ruang Kelas -");
        System.out.println("\nSirkulasi Udara   : ");
        Comp.setSirkulasiUdara(in.next());

    }

    void Pencahayaan() {
        System.out.println("\nNilai Pencahayaan : ");
        Comp.setPencahayaan(in.nextInt());

    }

    void Kelembapan() {
        System.out.println("\nKelembapan        : ");
        Comp.setKelembapan(in.nextInt());

    }

    void Suhu() {
        System.out.println("\nSuhu              : ");
        Comp.setSuhu(in.nextInt());

    }

    //Kenyamanan Ruang Kelas
    void Kebisingan() {
        System.out.println("\n - Kenyamanan Ruang Kelas -");
        System.out.println("\nKebisingan    : ");
        Comp.setKebisingan(in.nextLine());

    }

    void Bau() {
        System.out.println("\nBau   : ");
        Comp.setBau(in.nextLine());

    }

    void Kebocoran() {
        System.out.println("\nKebocoran     : ");
        Comp.setKebocoran(in.nextLine());

    }

    void Kerusakan() {
        System.out.println("\nKerusakan     : ");
        Comp.setKerusakan(in.nextLine());

    }

    void Keausan() {
        System.out.println("\nKeausan   : ");
        Comp.setKeausan(in.nextLine());

    }

    //Keamanan Ruang Kelas
    void Kekokohan() {
        System.out.println("\n - Keamanan Ruang Kelas -");
        System.out.println("\nKekokohan     : ");
        Comp.setKekokohan(in.next());

    }

    void KunciPintudanJendela() {
        System.out.println("\nKunci Pintu dan Jendela : ");
        Comp.setKunciJendela(in.next());

    }

    void KeamananRuang() {
        System.out.println("\nKeamanan  : ");
        Comp.setAman(in.next());

    }

}
