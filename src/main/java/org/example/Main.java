package org.example;

import org.example.controller.KantorCabangController;
import org.example.entity.KantorCabang;
import org.example.view.KaryawanView;

public class Main {
    public static void main(String[] args) {
        // Membuat objek KaryawanView
        KaryawanView karyawanView = new KaryawanView();

        // Membuat objek KantorCabangController
        KantorCabangController kantorCabangController = new KantorCabangController(karyawanView);

        // Membuat objek KantorCabang
        KantorCabang kantorCabang = new KantorCabang("1", "Jakarta", "Jalan Sudirman");
        KantorCabang kantorCabang2 = new KantorCabang("2", "Solo", "Jalan Soekarno");

        // Memanggil metode untuk menambahkan karyawan
        kantorCabangController.tambahKaryawan(kantorCabang);
        kantorCabangController.tambahKaryawan(kantorCabang2);

        // Memanggil metode untuk menampilkan karyawan di kantor cabang
        kantorCabangController.tampilkanKaryawanDiKantor(kantorCabang);
        kantorCabangController.tampilkanKaryawanDiKantor(kantorCabang2);
    }
}
