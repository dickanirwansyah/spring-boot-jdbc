package com.dicka.jdbc.springbootjdbc.entitie;

public class Gudang {

    private String idgudang;
    private String nama;
    private String deskripsi;

    public Gudang(){}

    public Gudang(String idgudang, String nama, String deskripsi) {
        this.idgudang = idgudang;
        this.nama = nama;
        this.deskripsi = deskripsi;
    }

    public String getIdgudang(){
        return idgudang;
    }

    public void setIdgudang(String idgudang){
        this.idgudang = idgudang;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getDeskripsi(){
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi){
        this.deskripsi = deskripsi;
    }
}
