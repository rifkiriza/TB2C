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
public class CetakKelas extends AnalisisKelas {

    void CetakLuasKelas() {
        System.out.println("Luas Ruang Kelas    : " + Laptop.getHitungLuasRuang());
    }

    void CetakRasioRuangKelas() {
        System.out.println("\nRasio Luas      : " + Laptop.getHitungRasioLuas());
    }

    void CetakJumlahPintudanJendela() {
        System.out.println("\nJumlah Pintu    : " + Laptop.getJmlPintu());
        System.out.println("\nJumlah Jendela  : " + Laptop.getJmlJendela());
    }

    void CetakKelistrikan() {
        System.out.println("\nJumlah Stop Kontak    : " + Laptop.getJmlStopKontak());
        System.out.println("\nKondisi Stop Kontak   : " + Laptop.getKondStopKontak());
        System.out.println("\nPosisi Stop Kontak    : " + Laptop.getPosStopKontak());
    }

    void CetakLCD() {
        System.out.println("\nJumlah Kabel LCD  : " + Laptop.getJmlKblLCD());
        System.out.println("\nKondisi Kabel LCD : " + Laptop.getKondKabelLCD());
        System.out.println("\nPosisi Kabel LCD : " + Laptop.getPosKabelLCD());

    }

    void CetakLampu() {
        System.out.println("\nJumlah Lampu   : " + Laptop.getJmlLampu());
        System.out.println("\nKondisi Lampu  : " + Laptop.getKondLampu());
        System.out.println("\nPosisi Lampu   : " + Laptop.getPosLampu());
    }

    void CetakKipasAngin() {
        System.out.println("\nJumlah Kipas Angin    : " + Laptop.getJmlKipas());
        System.out.println("\nKondisi Kipas Angin   : " + Laptop.getKondKipas());
        System.out.println("\nPosisi Kipas Angin    : " + Laptop.getPosKipas());
    }
    
    void CetakAC(){
        System.out.println("\nJumlah AC     : " + Laptop.getJmlAC());
        System.out.println("\nKondisi AC    : " + Laptop.getKondAC());
        System.out.println("\nPosisi AC     : " + Laptop.getPosAC());
    }
    
    void CetakInternet(){
        System.out.println("\nPilih SSID    : " + Laptop.getSSID());
        System.out.println("\nKonektifitas  : " + Laptop.getBandwidth());
    }
    
    void CetakCCTV(){
        System.out.println("\nJumlah CCTV   : " + Laptop.getJmlCCTV());
        System.out.println("\nKondisi CCTV  : " + Laptop.getKondCCTV());
        System.out.println("\nPosisi CCTV   : " + Laptop.getPosCCTV());
    }
    
    void CetakKebersihan(){
        System.out.println("\nKondisi Lantai    : " +Laptop.getKondLantai());
        System.out.println("\nKondisi Dinding   : " +Laptop.getKondDinding());
        System.out.println("\nKondisi Atap      : " +Laptop.getKondAtap());
        System.out.println("\nKondisi Pintu     : " +Laptop.getKondPintu());
        System.out.println("\nKondisi Jendela   : " +Laptop.getKondJendela());
    }
    
    void CetakSirklusiUdara(){
        System.out.println("\nSirklusi Udara    : " +Laptop.getSirkulasiUdara());
    }
    
    void CetakPencahayaan(){
        System.out.println("\nPencahayaan   : " +Laptop.getPencahayaan());
    }
    void CetakKelembapan(){
        System.out.println("\nKelembapan    : " +Laptop.getKelembapan());
    }
    
    void CetakSuhu(){
        System.out.println("\nSuhu          : " + Laptop.getSuhu());
    }
    
    void CetakKebisingan(){
        System.out.println("\nKebisingan    : " + Laptop.getKebisingan());
    }
    
    void CetakBau(){
        System.out.println("\nBau           : " + Laptop.getBau());
    }
    
    void CetakKebocoran(){
        System.out.println("\nKebocoran     : " + Laptop.getKebocoran());
    }
    
    void CetakKerusakan(){
        System.out.println("\nKerusakan     : " + Laptop.getKerusakan());
    }
    
    void CetakKeausan(){
        System.out.println("\nKeausan       : " + Laptop.getKeausan());
    }
    
    void CetakKekokohan(){
        System.out.println("\nKekokohan     : " + Laptop.getKekokohan());
    }
    
    void CetakKunciPintuJendela(){
        System.out.println("\nKunci, Pintu dan Jendela : " + Laptop.getKunciJendela());
    }
    
    void CetakKeamanan(){
        System.out.println("\nKeamanan      : " + Laptop.getAman());
    }
}
