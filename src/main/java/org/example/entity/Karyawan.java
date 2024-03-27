package org.example.entity;

public class Karyawan {
    private String id;
    private String nama;
    private String dob;
    private String alamat;
    private boolean status;

    // Konstruktor default tanpa argumen
    public Karyawan() {
    }

    // Konstruktor dengan argumen
    public Karyawan(String id, String nama, String dob, String alamat, boolean status) {
        this.id = id;
        this.nama = nama;
        this.dob = dob;
        this.alamat = alamat;
        this.status = status;
    }

    // Getter untuk ID
    public String getId() {
        return id;
    }

    // Setter untuk ID
    public void setId(String id) {
        this.id = id;
    }

    // Getter untuk Nama
    public String getNama() {
        return nama;
    }

    // Setter untuk Nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter untuk Tanggal Lahir
    public String getDob() {
        return dob;
    }

    // Setter untuk Tanggal Lahir
    public void setDob(String dob) {
        this.dob = dob;
    }

    // Getter untuk Alamat
    public String getAlamat() {
        return alamat;
    }

    // Setter untuk Alamat
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    // Getter untuk Status
    public boolean isStatus() {
        return status;
    }

    // Setter untuk Status
    public void setStatus(boolean status) {
        this.status = status;
    }
}
