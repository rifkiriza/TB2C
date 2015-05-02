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

    //Kondisi Ruang Kelas
    void hitungLuasRuang() {
        System.out.println("\n - Kondisi Ruang Kelas - \n");
        System.out.println("Panjang Ruang       : ");
        Laptop.setPanjang(in.nextInt());
        System.out.println("Lebar Ruang         : ");
        Laptop.setLebar(in.nextInt());
        System.out.println("Luas Ruang Kelas    : " + Laptop.Luas());
    }

    String hitungBentukRuang() {
        if (Laptop.getPanjang() != Laptop.getLebar()) {
            System.out.println("\nSesuai");
            return "Sesuai";//kesesuain
        } else {
            System.out.println("\nTidak Sesuai");
            return "Tidak Sesuai";
        }
    }

    String hitungRasioLuas() {
        System.out.println("\nJumlah Kursi      : ");
        Laptop.setJmlKursi(in.nextInt());
        System.out.println("Rasio Luas      : " + Laptop.Rasio());

        if (Laptop.Rasio() >= 0.5) {
            System.out.println("\nSesuai");
            return "Sesuai";
        } else {
            System.out.println("\nTidak Sesuai");
            return "Tidak Sesuai";
        }

    }

    String analisisPintuDanJendela() {
        System.out.println("\nJumlah Pintu        1. 1    2. 2    3. 4");
        System.out.println("Jumlah Jendela      1. 0    2. 1    3. 4");
        System.out.println("\nJumlah Pintu      : ");
        Laptop.setJmlPintu(in.nextInt());
        System.out.println("Jumlah Jendela  : ");
        Laptop.setJmlJendela(in.nextInt());
        if (Laptop.getJmlPintu() == 2 && Laptop.getJmlJendela() == 2 || Laptop.getJmlJendela() == 3) {
            System.out.println("\nSesuai");
            return "Sesuai";
        } else {
            System.out.println("\nTidak Sesuai");
            return "Tidak Sesuai";
        }
    }

    //Jumlah, Kondisi dan Posisi Sarana
    String analisisKelistrikan() {
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
        if (Laptop.getJmlStopKontak() == 2 || Laptop.getJmlStopKontak() == 3 && Laptop.getKondStopKontak() == 1 && Laptop.getPosStopKontak() == 1) {
            System.out.println("\nSesuai");
            return "Sesuai";
        } else {
            System.out.println("\nTidak Sesuai");
            return "Tidak Sesuai";
        }

    }

    String analisisLCD() {
        System.out.println("\nJumlah Kabel LCD        1. 0           :   2. 1");
        System.out.println("Kondisi Kabel LCD       1. Berfungsi   :   2. Kurang Baik   :   3. Rusak");
        System.out.println("Posisi Kabel LCD        1. Dekat Dosen :   2. Dekat Pintu   :   3. Dekat Lampu");
        System.out.println("\nJumlah Kabel LCD      : ");
        Laptop.setJmlKblLCD(in.nextInt());
        System.out.println("Kondisi Kabel lCD   : ");
        Laptop.setKondKabelLCD(in.nextInt());
        System.out.println("Posisi Kabel LCD    : ");
        Laptop.setPosKabelLCD(in.nextInt());
        if (Laptop.getJmlKblLCD() == 2 && Laptop.getKondKabelLCD() == 1 && Laptop.getPosKabelLCD() == 1) {
            System.out.println("\nSesuai");
            return "Sesuai";
        } else {
            System.out.println("\nTidak Sesuai");
            return "Tidak Sesuai";
        }
    }

    String analisisLampu() {
        System.out.println("\nJumlah Lampu    1. 4      :   2. 10            :   3. 18");
        System.out.println("Kondisi Lampu   1. Baik   :   2. Kurang Baik   :   3. Rusak");
        System.out.println("Posisi Lampu    1. Atap   :   2. Bawah         :   3. Samping");
        System.out.println("\nJumlah Lampu      : ");
        Laptop.setJmlLampu(in.nextInt());
        System.out.println("Kondisi Lampu   : ");
        Laptop.setKondLampu(in.nextInt());
        System.out.println("Posisi Lampu    : ");
        Laptop.setPosLampu(in.nextInt());
        if (Laptop.getJmlLampu() == 2 || Laptop.getJmlLampu() == 3 && Laptop.getKondLampu() == 1 && Laptop.getPosLampu() == 1) {
            System.out.println("\nSesuai");
            return "Sesuai";
        } else {
            System.out.println("\nTidak Sesuai");
            return "Tidak Sesuai";
        }
    }

    String analisisKipasAngin() {
        System.out.println("\nJumlah Kipas Angin      1. 1      :   2. 2             :   3. 4");
        System.out.println("Kondisi Kipas Angin     1. Baik   :   2. Kurang Baik   :   3. Rusak");
        System.out.println("Posisi Kipas Angin      1. Atap   :   2. Bawah         :   3. Samping");
        System.out.println("\nJumlah Kipas Angin        : ");
        Laptop.setJmlKipas(in.nextInt());
        System.out.println("Kondisi Kipas Angin     : ");
        Laptop.setKondKipas(in.nextInt());
        System.out.println("Posisi Kipas Angin      : ");
        Laptop.setPosKipas(in.nextInt());
        if (Laptop.getJmlKipas() == 2 || Laptop.getJmlKipas() == 3 && Laptop.getKondKipas() == 1 && Laptop.getPosKipas() == 1) {
            System.out.println("\nSesuai");
            return "Sesuai";
        } else {
            System.out.println("\nTidak Sesuai");
            return "Tidak Sesuai";
        }
    }

    String analisisAC() {
        System.out.println("\nJumlah AC       1. 0       :   2. 1             :   3. 2");
        System.out.println("Kondisi AC      1. Baik    :   2. Kurang Baik   :   3. Rusak");
        System.out.println("Posisi AC       1. Depan   :   2. Samping       :   3. Belakang");
        System.out.println("\nJumlah AC         : ");
        Laptop.setJmlAC(in.nextInt());
        System.out.println("Kondisi AC      : ");
        Laptop.setKondAC(in.nextInt());
        System.out.println("Posisi AC       : ");
        Laptop.setPosAC(in.nextInt());
        if (Laptop.getJmlAC() == 2 || Laptop.getJmlAC() == 3 && Laptop.getKondAC() == 1 && Laptop.getPosAC() == 1) {
            System.out.println("\nSesuai");
            return "Sesuai";
        } else {
            System.out.println("\nTidak Sesuai");
            return "Tidak Sesuai";
        }

    }

    String analisisIntrnet() {
        System.out.println("\nPilih SSID      1. UMM Hotspot  :   2. Riza Hotspot    :  3. Gangga Hotspot   :   4. Adi Hotspot");
        System.out.println("Konektifitas    1. Bisa Login   :   2. Tidak Bisa Login");
        System.out.println("\nPilih SSID        : ");
        Laptop.setSSID(in.nextInt());
        System.out.println("Konektifitas    : ");
        Laptop.setBandwidth(in.nextInt());
        if (Laptop.getSSID() == 1 && Laptop.getBandwidth() == 1) {
            System.out.println("\nSesuai");
            return "Sesuai";
        } else {
            System.out.println("\nTidak Sesuai");
            return "Tidak Sesuai";
        }
    }

    String analisisCCTV() {
        System.out.println("\nJumlah CCTV     1. 0       :   2. 1   :   3. 2");
        System.out.println("Kondisi CCTV    1. Baik    :   2. Kurang Baik    :    3. Rusak");
        System.out.println("Posisi CCTV     1. Depan   :   2. Samping        :    3. Belakang");
        System.out.println("\nJumlah CCTV       : ");
        Laptop.setJmlCCTV(in.nextInt());
        System.out.println("Kondisi CCTV    : ");
        Laptop.setKondCCTV(in.nextInt());
        System.out.println("Posisi CCTV     : ");
        Laptop.setPosCCTV(in.nextInt());
        if (Laptop.getJmlCCTV() == 3 && Laptop.getKondCCTV() == 1 && Laptop.getPosCCTV() == 1 || Laptop.getPosCCTV() == 3) {
            System.out.println("\nSesuai");
            return "Sesuai";
        } else {
            System.out.println("\nTidak Sesuai");
            return "Tidak Sesuai";//**
        }
    }

}

