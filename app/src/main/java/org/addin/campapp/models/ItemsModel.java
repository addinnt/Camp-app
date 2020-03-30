package org.addin.campapp.models;

public class ItemsModel {
    private String nama,logo,desc,harga, kategori;

    public ItemsModel(String nama, String logo, String desc, String harga, String kategori) {
        this.nama = nama;
        this.logo = logo;
        this.desc = desc;
        this.harga = harga;
        this.kategori = kategori;
    }

    public ItemsModel(String kategori, String logo) {
        this.logo = logo;
        this.kategori = kategori;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }
}
