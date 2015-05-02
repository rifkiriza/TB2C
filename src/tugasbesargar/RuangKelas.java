/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasbesargar;

/**
 *
 * @author Riza7
 */
public class RuangKelas {

    /**
     * @param args the command line arguments
     */
    
    //Identitas Ruang Kelas
    private String namaRuang;
    private String lokasi;
    private String fakultas;
    
    //Kondisi Ruang Kelas
    double HitungLuasRuang;
    double HitungBentukRuang;
    double HitungRasioLuas;
    private int panjang;
    private int lebar;
    private int jmlKursi;
    private int jmlPintu;
    private int jmlJendela;
    
    //Jumlah, Kondisi dan Posisi Sarana
    private int jmlStopKontak;
    private int kondStopKontak;
    private int posStopKontak;
    private int jmlKblLCD;
    private int kondKabelLCD;
    private int posKabelLCD;
    private int jmlLampu;
    private int kondLampu;
    private int posLampu;
    private int jmlKipas;
    private int kondKipas;
    private int posKipas;
    private int jmlAC;
    private int kondAC;
    private int posAC;
    private int SSID;
    private int bandwidth;
    private int jmlCCTV;
    private int kondCCTV;
    private int posCCTV;
    
    //Lingkungan Ruang Kelas
    private String kondLantai;
    private String kondDinding;
    private String kondAtap;
    private String kondPintu;
    private String kondJendela;
    
    //Kebersihan Ruang Kelas
    private String sirkulasiUdara;
    private int pencahayaan;
    private int kelembapan;
    private int suhu;
    
    //Kenyamanan Ruang Kelas
    private String kebisingan;
    private String bau;
    private String kebocoran;
    private String kerusakan;
    private String keausan;
    
    //Keamanan Ruang Kelas
    private String kekokohan;
    private String kunciPintu;
    private String kunciJendela;
    private String aman;

    public String getNamaRuang() {
        return namaRuang;
    }

    public void setNamaRuang(String namaRuang) {
        this.namaRuang = namaRuang;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public int getJmlKursi() {
        return jmlKursi;
    }

    public void setJmlKursi(int jmlKursi) {
        this.jmlKursi = jmlKursi;
    }

    public int getJmlPintu() {
        return jmlPintu;
    }

    public void setJmlPintu(int jmlPintu) {
        this.jmlPintu = jmlPintu;
    }

    public int getJmlJendela() {
        return jmlJendela;
    }

    public void setJmlJendela(int jmlJendela) {
        this.jmlJendela = jmlJendela;
    }

    public int getJmlStopKontak() {
        return jmlStopKontak;
    }

    public void setJmlStopKontak(int jmlStopKontak) {
        this.jmlStopKontak = jmlStopKontak;
    }

    public int getKondStopKontak() {
        return kondStopKontak;
    }

    public void setKondStopKontak(int kondStopKontak) {
        this.kondStopKontak = kondStopKontak;
    }

    public int getPosStopKontak() {
        return posStopKontak;
    }

    public void setPosStopKontak(int posStopKontak) {
        this.posStopKontak = posStopKontak;
    }

    public int getJmlKblLCD() {
        return jmlKblLCD;
    }

    public void setJmlKblLCD(int jmlKblLCD) {
        this.jmlKblLCD = jmlKblLCD;
    }

    public int getKondKabelLCD() {
        return kondKabelLCD;
    }

    public void setKondKabelLCD(int kondKabelLCD) {
        this.kondKabelLCD = kondKabelLCD;
    }

    public int getPosKabelLCD() {
        return posKabelLCD;
    }

    public void setPosKabelLCD(int posKabelLCD) {
        this.posKabelLCD = posKabelLCD;
    }

    public int getJmlLampu() {
        return jmlLampu;
    }

    public void setJmlLampu(int jmlLampu) {
        this.jmlLampu = jmlLampu;
    }

    public int getKondLampu() {
        return kondLampu;
    }

    public void setKondLampu(int kondLampu) {
        this.kondLampu = kondLampu;
    }

    public int getPosLampu() {
        return posLampu;
    }

    public void setPosLampu(int posLampu) {
        this.posLampu = posLampu;
    }

    public int getJmlKipas() {
        return jmlKipas;
    }

    public void setJmlKipas(int jmlKipas) {
        this.jmlKipas = jmlKipas;
    }

    public int getKondKipas() {
        return kondKipas;
    }

    public void setKondKipas(int kondKipas) {
        this.kondKipas = kondKipas;
    }

    public int getPosKipas() {
        return posKipas;
    }

    public void setPosKipas(int posKipas) {
        this.posKipas = posKipas;
    }

    public int getJmlAC() {
        return jmlAC;
    }

    public void setJmlAC(int jmlAC) {
        this.jmlAC = jmlAC;
    }

    public int getKondAC() {
        return kondAC;
    }

    public void setKondAC(int kondAC) {
        this.kondAC = kondAC;
    }

    public int getPosAC() {
        return posAC;
    }

    public void setPosAC(int posAC) {
        this.posAC = posAC;
    }

    public int getSSID() {
        return SSID;
    }

    public void setSSID(int SSID) {
        this.SSID = SSID;
    }

    public int getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(int bandwidth) {
        this.bandwidth = bandwidth;
    }

    public int getJmlCCTV() {
        return jmlCCTV;
    }

    public void setJmlCCTV(int jmlCCTV) {
        this.jmlCCTV = jmlCCTV;
    }

    public int getKondCCTV() {
        return kondCCTV;
    }

    public void setKondCCTV(int kondCCTV) {
        this.kondCCTV = kondCCTV;
    }

    public int getPosCCTV() {
        return posCCTV;
    }

    public void setPosCCTV(int posCCTV) {
        this.posCCTV = posCCTV;
    }

    public String getKondLantai() {
        return kondLantai;
    }

    public void setKondLantai(String kondLantai) {
        this.kondLantai = kondLantai;
    }

    public String getKondDinding() {
        return kondDinding;
    }

    public void setKondDinding(String kondDinding) {
        this.kondDinding = kondDinding;
    }

    public String getKondAtap() {
        return kondAtap;
    }

    public void setKondAtap(String kondAtap) {
        this.kondAtap = kondAtap;
    }

    public String getKondPintu() {
        return kondPintu;
    }

    public void setKondPintu(String kondPintu) {
        this.kondPintu = kondPintu;
    }

    public String getKondJendela() {
        return kondJendela;
    }

    public void setKondJendela(String kondJendela) {
        this.kondJendela = kondJendela;
    }

    public String getSirkulasiUdara() {
        return sirkulasiUdara;
    }

    public void setSirkulasiUdara(String sirkulasiUdara) {
        this.sirkulasiUdara = sirkulasiUdara;
    }

    public int getPencahayaan() {
        return pencahayaan;
    }

    public void setPencahayaan(int pencahayaan) {
        this.pencahayaan = pencahayaan;
    }

    public int getKelembapan() {
        return kelembapan;
    }

    public void setKelembapan(int kelembapan) {
        this.kelembapan = kelembapan;
    }

    public int getSuhu() {
        return suhu;
    }

    public void setSuhu(int suhu) {
        this.suhu = suhu;
    }

    public String getKebisingan() {
        return kebisingan;
    }

    public void setKebisingan(String kebisingan) {
        this.kebisingan = kebisingan;
    }

    public String getBau() {
        return bau;
    }

    public void setBau(String bau) {
        this.bau = bau;
    }

    public String getKebocoran() {
        return kebocoran;
    }

    public void setKebocoran(String kebocoran) {
        this.kebocoran = kebocoran;
    }

    public String getKerusakan() {
        return kerusakan;
    }

    public void setKerusakan(String kerusakan) {
        this.kerusakan = kerusakan;
    }

    public String getKeausan() {
        return keausan;
    }

    public void setKeausan(String keausan) {
        this.keausan = keausan;
    }

    public String getKekokohan() {
        return kekokohan;
    }

    public void setKekokohan(String kekokohan) {
        this.kekokohan = kekokohan;
    }

    public String getKunciPintu() {
        return kunciPintu;
    }

    public void setKunciPintu(String kunciPintu) {
        this.kunciPintu = kunciPintu;
    }

    public String getKunciJendela() {
        return kunciJendela;
    }

    public void setKunciJendela(String kunciJendela) {
        this.kunciJendela = kunciJendela;
    }

    public String getAman() {
        return aman;
    }

    public void setAman(String aman) {
        this.aman = aman;
    }

    double Luas() {
        HitungLuasRuang = panjang * lebar;
        return HitungLuasRuang;
    }

    double Rasio() {
        HitungRasioLuas = HitungLuasRuang / jmlKursi;
        return HitungRasioLuas;
    }

}
