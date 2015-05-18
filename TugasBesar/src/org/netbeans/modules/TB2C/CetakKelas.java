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
 public CetakKelas(String namaRuang, String lokasi) {
        super(namaRuang, lokasi);
    }

    void CetakLuasKelas() {
        System.out.println("\nLuas Ruang Kelas    : " +getHitungLuasRuang());
    }

    void CetakRasioRuangKelas() {
        System.out.println("\nRasio Luas      : " + getHitungRasioLuas());
    }

    void CetakJumlahPintudanJendela() {
        System.out.println("\nJumlah Pintu    : " + getJmlPintu());
        System.out.println("\nJumlah Jendela  : " + getJmlJendela());
    }

    void CetakKelistrikan() {
        System.out.println("\nJumlah Stop Kontak    : " + getJmlStopKontak());
        System.out.println("\nKondisi Stop Kontak   : " + getKondStopKontak());
        System.out.println("\nPosisi Stop Kontak    : " + getPosStopKontak());
    }

    void CetakLCD() {
        System.out.println("\nJumlah Kabel LCD  : " + getJmlKblLCD());
        System.out.println("\nKondisi Kabel LCD : " + getKondKabelLCD());
        System.out.println("\nPosisi Kabel LCD : " + getPosKabelLCD());

    }

    void CetakLampu() {
        System.out.println("\nJumlah Lampu   : " + getJmlLampu());
        System.out.println("\nKondisi Lampu  : " + getKondLampu());
        System.out.println("\nPosisi Lampu   : " + getPosLampu());
    }

    void CetakKipasAngin() {
        System.out.println("\nJumlah Kipas Angin    : " + getJmlKipas());
        System.out.println("\nKondisi Kipas Angin   : " + getKondKipas());
        System.out.println("\nPosisi Kipas Angin    : " + getPosKipas());
    }
    
    void CetakAC(){
        System.out.println("\nJumlah AC     : " + getJmlAC());
        System.out.println("\nKondisi AC    : " + getKondAC());
        System.out.println("\nPosisi AC     : " + getPosAC());
    }
    
    void CetakInternet(){
        System.out.println("\nPilih SSID    : " + getSSID());
        System.out.println("\nKonektifitas  : " + getBandwidth());
    }
    
    void CetakCCTV(){
        System.out.println("\nJumlah CCTV   : " + getJmlCCTV());
        System.out.println("\nKondisi CCTV  : " + getKondCCTV());
        System.out.println("\nPosisi CCTV   : " + getPosCCTV());
    }
    
    void CetakKebersihan(){
        System.out.println("\nKondisi Lantai    : " + getKondLantai());
        System.out.println("\nKondisi Dinding   : " + getKondDinding());
        System.out.println("\nKondisi Atap      : " + getKondAtap());
        System.out.println("\nKondisi Pintu     : " + getKondPintu());
        System.out.println("\nKondisi Jendela   : " + getKondJendela());
    }
    
    void CetakSirklusiUdara(){
        System.out.println("\nSirklusi Udara    : " + getSirkulasiUdara());
    }
    
    void CetakPencahayaan(){
        System.out.println("\nPencahayaan   : " + getPencahayaan());
    }
    void CetakKelembapan(){
        System.out.println("\nKelembapan    : " + getKelembapan());
    }
    
    void CetakSuhu(){
        System.out.println("\nSuhu          : " + getSuhu());
    }
    
    void CetakKebisingan(){
        System.out.println("\nKebisingan    : " + getKebisingan());
    }
    
    void CetakBau(){
        System.out.println("\nBau           : " + getBau());
    }
    
    void CetakKebocoran(){
        System.out.println("\nKebocoran     : " + getKebocoran());
    }
    
    void CetakKerusakan(){
        System.out.println("\nKerusakan     : " + getKerusakan());
    }
    
    void CetakKeausan(){
        System.out.println("\nKeausan       : " + getKeausan());
    }
    
    void CetakKekokohan(){
        System.out.println("\nKekokohan     : " + getKekokohan());
    }
    
    void CetakKunciPintuJendela(){
        System.out.println("\nKunci, Pintu dan Jendela : " + getKunciJendela());
    }
    
    void CetakKeamanan(){
        System.out.println("\nKeamanan      : " + getAman());
    }
}
