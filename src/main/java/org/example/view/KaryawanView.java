package org.example.view;

import org.example.entity.Karyawan;

import java.util.List;

public class KaryawanView {
    public void tampilkanKaryawanDiKantor(String kota, List<Karyawan> karyawanList) {
        System.out.println("Karyawan di kantor cabang " + kota + ":");
        for (Karyawan karyawan : karyawanList) {
            System.out.println("ID: " + karyawan.getId());
            System.out.println("Nama: " + karyawan.getNama());
            System.out.println("Tanggal Lahir: " + karyawan.getDob());
            System.out.println("Alamat: " + karyawan.getAlamat());
            System.out.println("Status: " + (karyawan.isStatus() ? "Aktif" : "Tidak Aktif"));
            System.out.println();
        }
    }
}
