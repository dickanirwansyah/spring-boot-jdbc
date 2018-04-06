package com.dicka.jdbc.springbootjdbc.entitie;

public class Barang {

    private String idbarang;
    private String nama;
    private int jumlah;
    private int price;
    private boolean valid;
    private Gudang gudang;

    public String getIdbarang(){
        return idbarang;
    }

    public void  setIdbarang(String idbarang){
        this.idbarang = idbarang;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public int getJumlah(){
        return jumlah;
    }

    public void setJumlah(int jumlah){
        this.jumlah = jumlah;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public boolean isValid(){
        return valid;
    }

    public void setValid(boolean valid){
        this.valid = valid;
    }

    public Gudang getGudang(){
        return gudang;
    }

    public void setGudang(Gudang gudang){
        this.gudang = gudang;
    }
}
