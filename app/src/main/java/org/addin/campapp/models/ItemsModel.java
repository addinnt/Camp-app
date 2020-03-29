package org.addin.campapp.models;

public class ItemsModel {
    private String nama,logo,desc,harga;


    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public ItemsModel(String nama, String logo, String desc, String harga) {

        this.nama = nama;
        this.logo = logo;
        this.desc = desc;
        this.harga = harga;
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
}
