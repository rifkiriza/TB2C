/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.TB2C;

/**
 *
 * @author win 8
 */
public class AnalisisKelas extends KontrolKelas {

    public AnalisisKelas(String namaRuang, String lokasi) {
        super(namaRuang, lokasi);
    }

    String AnalisisLuasRuang() {
        setHitungLuasRuang(HitungLuas());
        if (getPanjang() != getLebar()) {
            System.out.println("\nSesuai");
            return "Sesuai";
        } else {
            System.out.println("\nTidak Sesuai");
            return "Tidak Sesuai";

        }
    }

    String AnalisisRasioLuas() {
        setHitungRasioLuas(HitungRasio());
        if (getHitungRasioLuas() >= 0.5) {
            System.out.println("\nSesuai");
            return "Sesuai";
        } else {
            System.out.println("\nTidak Sesuai");
            return "Tidak Sesuai";
        }
    }

    String AnalisisJumlahPintudanJendela() {
        if (getJmlPintu() == 2 && getJmlJendela() == 2 || getJmlJendela() == 3) {
            System.out.println("\nSesuai");
            return "Sesuai";
        } else {
            System.out.println("\nTidak Sesuai");
            return "Tidak Sesuai";
        }

    }

    String AnalisisKelistrikan() {
        if (getJmlStopKontak() == 2 || getJmlStopKontak() == 3 && getKondStopKontak() == 1 && getPosStopKontak() == 1) {
            System.out.println("\nSesuai");
            return "Sesuai";
        } else {
            System.out.println("\nTidak Sesuai");
            return "Tidak Sesuai";
        }
    }

    String AnalisisLCD() {
        if (getJmlKblLCD() == 2 && getKondKabelLCD() == 1 && getPosKabelLCD() == 1) {
            System.out.println("\nSesuai");
            return "Sesuai";
        } else {
            System.out.println("\nTidak Sesuai");
            return "Tidak Sesuai";
        }

    }

    String AnalisisLampu() {
        if (getJmlLampu() == 2 || getJmlLampu() == 3 && getKondLampu() == 1 && getPosLampu() == 1) {
            System.out.println("\nSesuai");
            return "Sesuai";
        } else {
            System.out.println("\nTidak Sesuai");
            return "Tidak Sesuai";
        }
    }

    String AnalisisKipasAngin() {

        if (getJmlKipas() == 2 || getJmlKipas() == 3 && getKondKipas() == 1 && getPosKipas() == 1) {
            System.out.println("\nSesuai");
            return "Sesuai";
        } else {
            System.out.println("\nTidak Sesuai");
            return "Tidak Sesuai";
        }

    }

    String AnalisisAC() {

        if (getJmlAC() == 2 || getJmlAC() == 3 && getKondAC() == 1 && getPosAC() == 1) {
            System.out.println("\nSesuai");
            return "Sesuai";
        } else {
            System.out.println("\nTidak Sesuai");
            return "Tidak Sesuai";
        }
    }

    String AnalisisInternet() {
        if (getSSID() == 1 && getBandwidth() == 1) {
            System.out.println("\nSesuai");
            return "Sesuai";
        } else {
            System.out.println("\nTidak Sesuai");
            return "Tidak Sesuai";
        }
    }

    String AnalisisCCTV() {
        if (getJmlCCTV() == 3 && getKondCCTV() == 1 && getPosCCTV() == 1 || getPosCCTV() == 3) {
            System.out.println("\nSesuai");
            return "Sesuai";
        } else {
            System.out.println("\nTidak Sesuai");
            return "Tidak Sesuai";
        }
    }

    String AnalisisKebersihan() {
        if (getKondLantai().equals("bersih") && getKondDinding().equals("bersih") && getKondAtap().equals("bersih")
                && getKondPintu().equals("bersih") && getKondJendela().equals("bersih")) {
            System.out.println("\nSesuai");
            return "Sesuai";
        } else {
            System.out.println("\nTidak Sesuai");
            return "Tidak Sesuai";
        }
    }

    String AnalisisSirkulasiUdara() {
        if (getSirkulasiUdara().equals("lancar")) {
            System.out.println("\nSesuai");
            return "Sesuai";
        } else {
            System.out.println("\nTidak Sesuai");
            return "Tidak Sesuai";
        }
    }

    String AnalisisPencahayaan() {
        if (getPencahayaan() >= 250 && getPencahayaan() <= 350) {
            System.out.println("\nSesuai");
            return "Sesuai";
        } else {
            System.out.println("\nTidak Sesuai");
            return "Tidak Sesuai";
        }
    }

    String AnalisisKelembapan() {
        if (getKelembapan() >= 70 && getKelembapan() <= 80) {
            System.out.println("\nSesuai");
            return "Sesuai";
        } else {
            System.out.println("\nTidak Sesuai");
            return "Tidak Sesuai";
        }
    }

    String AnalisisSuhu() {
        if (getSuhu() >= 25 && getSuhu() <= 35) {
            System.out.println("\nSesuai");
            return "Sesuai";
        } else {
            System.out.println("\nTidak Sesuai");
            return "Tidak Sesuai";
        }

    }

    String AnalisisKebisingan() {
        if (getKebisingan().equals("tidak bising")) {
            System.out.println("\nSesuai");
            return "Sesuai";
        } else {
            System.out.println("\nTidak Sesuai");
            return "Tidak Sesuai";
        }
    }

    String AnalisisBau() {

        if (getBau().equals("tidak bau")) {
            System.out.println("\nSesuai");
            return "Sesuai";
        } else {
            System.out.println("\nTidak Sesuai");
            return "Tidak Sesuai";
        }
    }

    String AnalisisKebocoran() {
        if (getKebocoran().equals("tidak bocor")) {
            System.out.println("\nSesuai");
            return "Sesuai";
        } else {
            System.out.println("\nTidak Sesuai");
            return "Tidak Sesuai";
        }

    }

    String AnalisisKerusakan() {

        if (getKerusakan().equals("tidak rusak")) {
            System.out.println("\nSesuai");
            return "Sesuai";
        } else {
            System.out.println("\nTidak Sesuai");
            return "Tidak Sesuai";
        }

    }

    String AnalisisKeausan() {

        if (getKeausan().equals("tidak aus")) {
            System.out.println("\nSesuai");
            return "Sesuai";
        } else {
            System.out.println("\nTidak Sesuai");
            return "Tidak Sesuai";
        }

    }

    String AnalisisKekokohan() {
        if (getKekokohan().equals("kokoh")) {
            System.out.println("\nSesuai");
            return "Sesuai";
        } else {
            System.out.println("\nTidak Sesuai");
            return "Tidak Sesuai";
        }
    }

    String AnalisisKunciPintudanJendela() {
        if (getKunciJendela().equals("ada")) {
            System.out.println("\nSesuai");
            return "Sesuai";
        } else {
            System.out.println("\nTidak Sesuai");
            return "Tidak Sesuai";
        }

    }

    String AnalisisKeamananRuang() {
        if (getAman().equals("aman")) {
            System.out.println("\nSesuai");
            return "Sesuai";
        } else {
            System.out.println("\nTidak Sesuai");
            return "Tidak Sesuai";
        }

    }

}
