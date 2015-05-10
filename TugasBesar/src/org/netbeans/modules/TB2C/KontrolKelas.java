/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.TB2C;

import java.util.Scanner;


public class KontrolKelas {

    RuangKelas Laptop = new RuangKelas();
    Scanner in = new Scanner(System.in);

    //Identitas Ruang Kelas
    void identitasRuang() {
        String nama, lokasi;
        System.out.println(" - Identias Ruang Kelas -\n");
        System.out.println("Nama Ruang      : ");
        nama = in.nextLine();
        System.out.println("Lokasi Ruang    : ");
        lokasi = in.nextLine();
        System.out.println("Nama Fakultas   : ");
        lokasi = in.nextLine();
    }

    //Kondisi Ruang Kelas
    void PerhitunganKelas() {
        System.out.println("\n - Kondisi Ruang Kelas - \n");
        System.out.println("Panjang Ruang       : ");
        Laptop.setPanjang(in.nextInt());
        System.out.println("Lebar Ruang         : ");
        Laptop.setLebar(in.nextInt());
        System.out.println("\nJumlah Kursi      : ");
        Laptop.setJmlKursi(in.nextInt());

    }

    void JumlahPintuDanJendela() {
        System.out.println("\nJumlah Pintu        1. 1    2. 2    3. 4");
        System.out.println("Jumlah Jendela      1. 0    2. 1    3. 4");
        System.out.println("\nJumlah Pintu      : ");
        Laptop.setJmlPintu(in.nextInt());
        System.out.println("Jumlah Jendela  : ");
        Laptop.setJmlJendela(in.nextInt());

    }

    //Jumlah, Kondisi dan Posisi Sarana
    void Kelistrikan() {
        System.out.println("\n - Jumlah, Kondisi dan Posisi Sarana -");
        System.out.println("\nJumlah Stop Kontak      1. 2                        :  2. 4             :  3. 8");
        System.out.println("Kondisi Stop Kontak     1. Baik                     :  2. Kurang Baik   :  3. Rusak");
        System.out.println("Posisi Stop Kontak      1. Di Pojok dan Dekat Dosen :  2. Di Tengah     :  3. Di Bawah");
        System.out.println("\nJumlah Stop Kontak        : ");
        Laptop.setJmlStopKontak(in.nextInt());
        System.out.println("Kondisi Stop Kontak     : ");
        Laptop.setKondStopKontak(in.nextInt());
        System.out.println("Posisi Stop Kontak      : ");
        Laptop.setPosStopKontak(in.nextInt());

    }

    void LCD() {
        System.out.println("\nJumlah Kabel LCD        1. 0           :   2. 1");
        System.out.println("Kondisi Kabel LCD       1. Berfungsi   :   2. Kurang Baik   :   3. Rusak");
        System.out.println("Posisi Kabel LCD        1. Dekat Dosen :   2. Dekat Pintu   :   3. Dekat Lampu");
        System.out.println("\nJumlah Kabel LCD      : ");
        Laptop.setJmlKblLCD(in.nextInt());
        System.out.println("Kondisi Kabel lCD   : ");
        Laptop.setKondKabelLCD(in.nextInt());
        System.out.println("Posisi Kabel LCD    : ");
        Laptop.setPosKabelLCD(in.nextInt());

    }

    void Lampu() {
        System.out.println("\nJumlah Lampu    1. 4      :   2. 10            :   3. 18");
        System.out.println("Kondisi Lampu   1. Baik   :   2. Kurang Baik   :   3. Rusak");
        System.out.println("Posisi Lampu    1. Atap   :   2. Bawah         :   3. Samping");
        System.out.println("\nJumlah Lampu      : ");
        Laptop.setJmlLampu(in.nextInt());
        System.out.println("Kondisi Lampu   : ");
        Laptop.setKondLampu(in.nextInt());
        System.out.println("Posisi Lampu    : ");
        Laptop.setPosLampu(in.nextInt());
    }

    void KipasAngin() {
        System.out.println("\nJumlah Kipas Angin      1. 1      :   2. 2             :   3. 4");
        System.out.println("Kondisi Kipas Angin     1. Baik   :   2. Kurang Baik   :   3. Rusak");
        System.out.println("Posisi Kipas Angin      1. Atap   :   2. Bawah         :   3. Samping");
        System.out.println("\nJumlah Kipas Angin        : ");
        Laptop.setJmlKipas(in.nextInt());
        System.out.println("Kondisi Kipas Angin     : ");
        Laptop.setKondKipas(in.nextInt());
        System.out.println("Posisi Kipas Angin      : ");
        Laptop.setPosKipas(in.nextInt());
    }

    void AC() {
        System.out.println("\nJumlah AC       1. 0       :   2. 1             :   3. 2");
        System.out.println("Kondisi AC      1. Baik    :   2. Kurang Baik   :   3. Rusak");
        System.out.println("Posisi AC       1. Depan   :   2. Samping       :   3. Belakang");
        System.out.println("\nJumlah AC         : ");
        Laptop.setJmlAC(in.nextInt());
        System.out.println("Kondisi AC      : ");
        Laptop.setKondAC(in.nextInt());
        System.out.println("Posisi AC       : ");
        Laptop.setPosAC(in.nextInt());

    }

    void Intrnet() {
        System.out.println("\nPilih SSID      1. UMM Hotspot  :   2. Riza Hotspot    :  3. Gangga Hotspot   :   4. Adi Hotspot");
        System.out.println("Konektifitas    1. Bisa Login   :   2. Tidak Bisa Login");
        System.out.println("\nPilih SSID        : ");
        Laptop.setSSID(in.nextInt());
        System.out.println("Konektifitas    : ");
        Laptop.setBandwidth(in.nextInt());

    }

    void CCTV() {
        System.out.println("\nJumlah CCTV     1. 0       :   2. 1   :   3. 2");
        System.out.println("Kondisi CCTV    1. Baik    :   2. Kurang Baik    :    3. Rusak");
        System.out.println("Posisi CCTV     1. Depan   :   2. Samping        :    3. Belakang");
        System.out.println("\nJumlah CCTV       : ");
        Laptop.setJmlCCTV(in.nextInt());
        System.out.println("Kondisi CCTV    : ");
        Laptop.setKondCCTV(in.nextInt());
        System.out.println("Posisi CCTV     : ");
        Laptop.setPosCCTV(in.nextInt());

    }

    //Lingkungan Ruang Kelas
    void Kebersihan() {
        System.out.println("\n - Lingkungan Ruang Kelas -");
        System.out.println("\nKondisi Lantai        : ");
        Laptop.setKondLantai(in.next());
        System.out.println("Kondisi Dinding     : ");
        Laptop.setKondDinding(in.next());
        System.out.println("Kondisi Atap        : ");
        Laptop.setKondAtap(in.next());
        System.out.println("Kondisi Pintu       : ");
        Laptop.setKondPintu(in.next());
        System.out.println("Kondisi Jendela     : ");
        Laptop.setKondJendela(in.next());

    }

    //Kebersihan Ruang Kelas
    void SirkulasiUdara() {
        System.out.println("\n - Kebersihan Ruang Kelas -");
        System.out.println("\nSirkulasi Udara   : ");
        Laptop.setSirkulasiUdara(in.next());

    }

    void Pencahayaan() {
        System.out.println("\nNilai Pencahayaan : ");
        Laptop.setPencahayaan(in.nextInt());

    }

    void Kelembapan() {
        System.out.println("\nKelembapan        : ");
        Laptop.setKelembapan(in.nextInt());

    }

    void Suhu() {
        System.out.println("\nSuhu              : ");
        Laptop.setSuhu(in.nextInt());

    }

    //Kenyamanan Ruang Kelas
    void Kebisingan() {
        System.out.println("\n - Kenyamanan Ruang Kelas -");
        System.out.println("\nKebisingan    : ");
        Laptop.setKebisingan(in.nextLine());

    }

    void Bau() {
        System.out.println("\nBau   : ");
        Laptop.setBau(in.nextLine());

    }

    void Kebocoran() {
        System.out.println("\nKebocoran     : ");
        Laptop.setKebocoran(in.nextLine());

    }

    void Kerusakan() {
        System.out.println("\nKerusakan     : ");
        Laptop.setKerusakan(in.nextLine());

    }

    void Keausan() {
        System.out.println("\nKeausan   : ");
        Laptop.setKeausan(in.nextLine());

    }

    //Keamanan Ruang Kelas
    void Kekokohan() {
        System.out.println("\n - Keamanan Ruang Kelas -");
        System.out.println("\nKekokohan     : ");
        Laptop.setKekokohan(in.next());

    }

    void KunciPintudanJendela() {
        System.out.println("\nKunci Pintu dan Jendela : ");
        Laptop.setKunciJendela(in.next());

    }

    void KeamananRuang() {
        System.out.println("\nKeamanan  : ");
        Laptop.setAman(in.next());

    }
}
