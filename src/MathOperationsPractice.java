public class MathOperationsPractice {
    public static void main(String[] args) {
        // ===== OPERATOR ARITMATIKA DASAR =====
        System.out.println("\\n=== OPERATOR ARITMATIKA DASAR ===");

        // Latihan 1: Berlatih operasi aritmatika dasar
        // - Deklarasikan dua integer: num1 = 25, num2 = 4
        int num1 = 25;
        int num2 = 4;

        // - Hitung dan simpan hasil penjumlahan num1 dan num2
        int penjumlahan = num1 + num2;

        // - Hitung dan simpan hasil pengurangan num1 dan num2
        int pengurangan = num1 - num2;

        // - Hitung dan simpan hasil perkalian num1 dan num2
        int perkalian = num1 * num2;

        // - Hitung dan simpan hasil pembagian num1 dibagi num2 (pembagian integer)
        int pembagian = num1 / num2;

        // - Hitung dan simpan sisa bagi num1 dibagi num2 (modulus)
        int modulus = num1 % num2;

        // - Print semua hasil dengan label yang deskriptif
        System.out.println("Hasil penjumlahan: " + penjumlahan);
        System.out.println("Hasil pengurangan: " + pengurangan);
        System.out.println("Hasil perkalian: " + perkalian);
        System.out.println("Hasil pembagian (integer): " + pembagian);
        System.out.println("Hasil sisa bagi (modulus): " + modulus);
        System.out.println();

        // ===== PEMBAGIAN INTEGER VS FLOATING-POINT =====
        System.out.println("\\n=== PEMBAGIAN INTEGER VS FLOATING-POINT ===");

        // Latihan 2: Jelajahi berbagai jenis pembagian
        // - Lakukan pembagian integer: 17 / 5 dan simpan hasilnya
        int hasilPembagianInteger = 17 / 5;

        // - Lakukan pembagian floating-point: 17.0 / 5 dan simpan hasilnya
        double hasilPembagianFloatingPoint = 17.0 / 5;

        // - Konversi integer ke double sebelum pembagian: (double)17 / 5 dan simpan hasilnya
        double hasilPembagianTypeCasting = (double)17 / 5;

        // - Print ketiga hasil pembagian dan amati perbedaannya
        System.out.println("Hasil pembagian integer (17 / 5): " + hasilPembagianInteger);
        System.out.println("Hasil pembagian floating-point (17.0 / 5): " + hasilPembagianFloatingPoint);
        System.out.println("Hasil pembagian dengan type casting ((double)17 / 5): " + hasilPembagianTypeCasting);
        System.out.println();

        // ===== KALKULASI PRAKTIS =====
        System.out.println("\\n=== KALKULASI PRAKTIS ===");

        // Latihan 3: Selesaikan masalah dunia nyata menggunakan operator aritmatika
        // - Hitung luas persegi panjang dengan panjang 12.5 dan lebar 8.3
        double panjang = 12.5;
        double lebar = 8.3;
        double luasPersegiPanjang = panjang * lebar;

        System.out.println("Luas Persegi Panjang : (" + panjang + " x " + lebar + ") = " + luasPersegiPanjang);

        // - Hitung keliling persegi panjang yang sama
        double kelilingPersegiPanjang = 2 * (panjang + lebar);

        System.out.println("Keliling Persegi Panjang : (2 * (" + panjang + " + " + lebar + ")) = " + kelilingPersegiPanjang);

        // - Hitung total harga: 3 barang dengan harga $15.99 masing-masing, dengan pajak 8%
        int jumlahBarang = 3;
        double hargaPerBarang = 15.99;
        double tarifPajak = 0.08; // 8%

        double subTotal = jumlahBarang * hargaPerBarang;
        double jumlahPajak = subTotal * tarifPajak;
        double totalHarga = subTotal + jumlahPajak;

        System.out.println("\n--- Perhitungan Harga Barang ---");
        System.out.println("Harga per barang: $" + hargaPerBarang);
        System.out.println("Jumlah barang: " + jumlahBarang);
        System.out.printf("Subtotal: $%.2f%n", subTotal); // Format 2 desimal
        System.out.printf("Pajak (8%%): $%.2f%n", jumlahPajak);
        System.out.printf("Total Harga: $%.2f%n", totalHarga);

        // - Konversi suhu dari Celsius ke Fahrenheit menggunakan rumus: F = (C * 9/5) + 32
        // Gunakan Celsius = 25
        double celcius= 25.0;
        double fahrenheit = (celcius * 9.0/5.0) + 32;

        System.out.println("\n--- Konversi Suhu ---");
        System.out.println(celcius + " Celcius = " + fahrenheit + " Fahrenheit");

        // - Hitung berapa minggu penuh dalam 50 hari dan berapa hari sisanya
        int totalHari = 50;
        int hariDalamSeminggu = 7;

        int jumlahMingguPenuh = totalHari / hariDalamSeminggu;
        int sisaHari = totalHari % hariDalamSeminggu;

        System.out.println("\n--- Kalkulasi Hari/Minggu ---");
        System.out.println(totalHari + " hari adalah " + jumlahMingguPenuh + " minggu penuh dan " + sisaHari + " hari sisa.");
        System.out.println();

        // ===== KALKULASI KOMPLEKS =====
        System.out.println("\\n=== KALKULASI KOMPLEKS ===");

        // Latihan 4: Berlatih ekspresi matematika yang kompleks
        // - Hitung jarak menggunakan rumus: jarak = kecepatan * waktu
        // Gunakan kecepatan = 65.5 km/jam dan waktu = 2.75 jam
        double kecepatan = 65.5; // km/jam
        double waktu = 2.75;    // jam
        double jarak = kecepatan * waktu;

        System.out.println("--- Perhitungan Jarak ---");
        System.out.printf("Kecepatan: %.2f km/jam%n", kecepatan);
        System.out.printf("Waktu: %.2f jam%n", waktu);
        System.out.printf("Jarak yang ditempuh: %.2f km%n", jarak);

        // - Hitung bunga majemuk menggunakan rumus sederhana: jumlah = pokok * (1 + suku_bunga) ^ waktu
        // pokok = 1000, suku_bunga = 0.05 (5%), waktu = 3 tahun
        double pokok = 1000.0;
        double sukuBunga = 0.05; // 5%
        int durasiWaktu = 3;     // tahun

        // Gunakan Math.pow() untuk perpangkatan
        double jumlahAkhir = pokok * Math.pow((1 + sukuBunga), durasiWaktu);

        System.out.println("\n--- Perhitungan Bunga Majemuk ---");
        System.out.printf("Pokok: $%.2f%n", pokok);
        System.out.printf("Suku Bunga: %.2f%%%n", (sukuBunga * 100)); // Menampilkan dalam persentase
        System.out.printf("Durasi Waktu: %d tahun%n", durasiWaktu);
        System.out.printf("Jumlah Akhir (setelah %d tahun): $%.2f%n", durasiWaktu, jumlahAkhir);

        // - Hitung rata-rata dari lima nilai ujian: 85, 92, 78, 96, 88
        double nilai1 = 85;
        double nilai2 = 92;
        double nilai3 = 78;
        double nilai4 = 96;
        double nilai5 = 88;

        double totalNilai = nilai1 + nilai2 + nilai3 + nilai4 + nilai5;
        int jumlahNilai = 5;
        double rataRata = totalNilai / jumlahNilai;

        System.out.println("\n--- Perhitungan Rata-Rata Nilai Ujian ---");
        System.out.printf("Nilai-nilai ujian: %.0f, %.0f, %.0f, %.0f, %.0f%n", nilai1, nilai2, nilai3, nilai4, nilai5);
        System.out.printf("Total Nilai: %.0f%n", totalNilai);
        System.out.printf("Rata-rata Nilai: %.2f%n", rataRata);
    }
}
