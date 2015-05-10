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

    String AnalisisLuasRuang() {
        Laptop.setHitungLuasRuang(Laptop.getPanjang() * Laptop.getLebar());
        if (Laptop.getPanjang() != Laptop.getLebar()) {
            System.out.println("\nSesuai");
            return "Sesuai";
        } else {
            System.out.println("\nTidak Sesuai");
            return "Tidak Sesuai";

        }
    }

    String AnalisisRasioLuas() {
        Laptop.setHitungRasioLuas(Laptop.getHitungLuasRuang() / Laptop.getJmlKursi());
        if (Laptop.getHitungRasioLuas() >= 0.5) {
            System.out.println("\nSesuai");
            return "Sesuai";
        } else {
            System.out.println("\nTidak Sesuai");
            return "Tidak Sesuai";
        }
    }

    String AnalisisJumlahPintudanJendela() {
        if (Laptop.getJmlPintu() == 2 && Laptop.getJmlJendela() == 2 || Laptop.getJmlJendela() == 3) {
            System.out.println("\nSesuai");
            return "Sesuai";
        } else {
            System.out.println("\nTidak Sesuai");
            return "Tidak Sesuai";
        }

    }

    String AnalisisKelistrikan() {
        if (Laptop.getJmlStopKontak() == 2 || Laptop.getJmlStopKontak() == 3 && Laptop.getKondStopKontak() == 1 && Laptop.getPosStopKontak() == 1) {
            System.out.println("\nSesuai");
            return "Sesuai";
        } else {
            System.out.println("\nTidak Sesuai");
            return "Tidak Sesuai";
        }
    }

    String AnalisisLCD() {
        if (Laptop.getJmlKblLCD() == 2 && Laptop.getKondKabelLCD() == 1 && Laptop.getPosKabelLCD() == 1) {
            System.out.println("\nSesuai");
            return "Sesuai";
        } else {
            System.out.println("\nTidak Sesuai");
            return "Tidak Sesuai";
        }

    }

    String AnalisisLampu() {
        if (Laptop.getJmlLampu() == 2 || Laptop.getJmlLampu() == 3 && Laptop.getKondLampu() == 1 && Laptop.getPosLampu() == 1) {
            System.out.println("\nSesuai");
            return "Sesuai";
        } else {
            System.out.println("\nTidak Sesuai");
            return "Tidak Sesuai";
        }
    }

    String AnalisisKipasAngin() {

        if (Laptop.getJmlKipas() == 2 || Laptop.getJmlKipas() == 3 && Laptop.getKondKipas() == 1 && Laptop.getPosKipas() == 1) {
            System.out.println("\nSesuai");
            return "Sesuai";
        } else {
            System.out.println("\nTidak Sesuai");
            return "Tidak Sesuai";
        }

    }

    String AnalisisAC() {

        if (Laptop.getJmlAC() == 2 || Laptop.getJmlAC() == 3 && Laptop.getKondAC() == 1 && Laptop.getPosAC() == 1) {
            System.out.println("\nSesuai");
            return "Sesuai";
        } else {
            System.out.println("\nTidak Sesuai");
            return "Tidak Sesuai";
        }
    }

    String AnalisisInternet() {
        if (Laptop.getSSID() == 1 && Laptop.getBandwidth() == 1) {
            System.out.println("\nSesuai");
            return "Sesuai";
        } else {
            System.out.println("\nTidak Sesuai");
            return "Tidak Sesuai";
        }
    }

    String AnalisisCCTV() {
        if (Laptop.getJmlCCTV() == 3 && Laptop.getKondCCTV() == 1 && Laptop.getPosCCTV() == 1 || Laptop.getPosCCTV() == 3) {
            System.out.println("\nSesuai");
            return "Sesuai";
        } else {
            System.out.println("\nTidak Sesuai");
            return "Tidak Sesuai";
        }
    }

    String AnalisisKebersihan() {
        if (Laptop.getKondLantai().equals("bersih") && Laptop.getKondDinding().equals("bersih") && Laptop.getKondAtap().equals("bersih")
                && Laptop.getKondPintu().equals("bersih") && Laptop.getKondJendela().equals("bersih")) {
            System.out.println("\nSesuai");
            return "Sesuai";
        } else {
            System.out.println("\nTidak Sesuai");
            return "Tidak Sesuai";
        }
    }
    
    String AnalisisSirkulasiUdara(){
    if (Laptop.getSirkulasiUdara().equals("lancar")) {
            System.out.println("\nSesuai");
            return "Sesuai";
        } else {
            System.out.println("\nTidak Sesuai");
            return "Tidak Sesuai";
        }
    }
    
    String AnalisisPencahayaan (){
    if (Laptop.getPencahayaan() >= 250 && Laptop.getPencahayaan() <= 350) {
            System.out.println("\nSesuai");
            return "Sesuai";
        } else {
            System.out.println("\nTidak Sesuai");
            return "Tidak Sesuai";
        }
    }
    String AnalisisKelembapan(){
        if (Laptop.getKelembapan() >= 70 && Laptop.getKelembapan() <= 80) {
            System.out.println("\nSesuai");
            return "Sesuai";
        } else {
            System.out.println("\nTidak Sesuai");
            return "Tidak Sesuai";
        }
    }
    String AnalisisSuhu() {
    if (Laptop.getSuhu() >= 25 && Laptop.getSuhu() <= 35) {
            System.out.println("\nSesuai");
            return "Sesuai";
        } else {
            System.out.println("\nTidak Sesuai");
            return "Tidak Sesuai";
        }
    
    }
    
    String AnalisisKebisingan() {
    if (Laptop.getKebisingan().equals("tidak bising")) {
            System.out.println("\nSesuai");
            return "Sesuai";
        } else {
            System.out.println("\nTidak Sesuai");
            return "Tidak Sesuai";
        }
    }
    
    String AnalisisBau(){
    
    if (Laptop.getBau().equals("tidak bau")) {
            System.out.println("\nSesuai");
            return "Sesuai";
        } else {
            System.out.println("\nTidak Sesuai");
            return "Tidak Sesuai";
        }
    }
    
    String AnalisisKebocoran (){
        if (Laptop.getKebocoran().equals("tidak bocor")) {
            System.out.println("\nSesuai");
            return "Sesuai";
        } else {
            System.out.println("\nTidak Sesuai");
            return "Tidak Sesuai";
        }
    
    }
    
    String AnalisisKerusakan (){
        
        if (Laptop.getKerusakan().equals("tidak rusak")) {
            System.out.println("\nSesuai");
            return "Sesuai";
        } else {
            System.out.println("\nTidak Sesuai");
            return "Tidak Sesuai";
        }
    
    }
    
    String AnalisisKeausan (){
        
        if (Laptop.getKeausan().equals("tidak aus")) {
            System.out.println("\nSesuai");
            return "Sesuai";
        } else {
            System.out.println("\nTidak Sesuai");
            return "Tidak Sesuai";
        }
    
    }
    
    String AnalisisKekokohan (){
    if (Laptop.getKekokohan().equals("kokoh")) {
            System.out.println("\nSesuai");
            return "Sesuai";
        } else {
            System.out.println("\nTidak Sesuai");
            return "Tidak Sesuai";
        }
    }
    
    String AnalisisKunciPintudanJendela(){
    if (Laptop.getKunciJendela().equals("ada")) {
            System.out.println("\nSesuai");
            return "Sesuai";
        } else {
            System.out.println("\nTidak Sesuai");
            return "Tidak Sesuai";
        }
    
    }
    
    String AnalisisKeamananRuang(){
    if (Laptop.getAman().equals("aman")) {
            System.out.println("\nSesuai");
            return "Sesuai";
        } else {
            System.out.println("\nTidak Sesuai");
            return "Tidak Sesuai";
        }
    
    
    }


}
