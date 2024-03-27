package org.example.controller;

import org.example.entity.KantorCabang;
import org.example.entity.Karyawan;
import org.example.view.KaryawanView;

import java.util.List;
import java.util.Scanner;

public class KantorCabangController {
    private final KaryawanView karyawanView;
    private final Scanner scanner;

    public KantorCabangController(KaryawanView karyawanView) {
        this.karyawanView = karyawanView;
        this.scanner = new Scanner(System.in);
    }

    public void tampilkanKaryawanDiKantor(KantorCabang kantorCabang) {
        String kota = kantorCabang.getKota();
        List<Karyawan> karyawanList = kantorCabang.getKaryawanList();
        karyawanView.tampilkanKaryawanDiKantor(kota, karyawanList);
    }

    public void tambahKaryawan(KantorCabang kantorCabang) {
        System.out.print("Masukkan ID Karyawan: ");
        String id = scanner.nextLine();
        System.out.print("Masukkan Nama Karyawan: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Tanggal Lahir Karyawan: ");
        String dob = scanner.nextLine();
        System.out.print("Masukkan Alamat Karyawan: ");
        String alamat = scanner.nextLine();
        System.out.print("Apakah Karyawan Aktif? (true/false): ");
        boolean status = Boolean.parseBoolean(scanner.nextLine());

        Karyawan karyawan = new Karyawan(id, nama, dob, alamat, status);
        kantorCabang.addKaryawan(karyawan);
        System.out.println("Karyawan berhasil ditambahkan.");
    }
}
