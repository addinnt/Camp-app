package org.addin.campapp.models;

public class EquipmentModel {
    private String kategori,nama,logo,desc;
    private int harga;

    public EquipmentModel(String kategori, String logo) {
        this.kategori = kategori;
        this.logo = logo;
    }

    public EquipmentModel(String kategori, String nama, String logo, String desc, int harga) {
        this.kategori = kategori;
        this.nama = nama;
        this.logo = logo;
        this.desc = desc;
        this.harga = harga;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
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

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
}
