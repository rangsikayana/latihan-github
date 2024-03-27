package org.example.entity;

import java.util.ArrayList;
import java.util.List;

public class KantorCabang {
    private String id;
    private String kota;
    private String alamat;
    private List<Karyawan> karyawanList;

    public KantorCabang(String id, String kota, String alamat) {
        this.id = id;
        this.kota = kota;
        this.alamat = alamat;
        this.karyawanList = new ArrayList<>();
    }

    public void addKaryawan(Karyawan karyawan) {
        karyawanList.add(karyawan);
    }

    public List<Karyawan> getKaryawanList() {
        return karyawanList;
    }

    public String getKota() {
        return kota;
    }
}
