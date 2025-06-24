import java.util.Scanner;

class Mahasiswa {
    String nim;
    String nama;
    String jurusan;

    // Constructor
    Mahasiswa(String nim, String nama, String jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
    }

    // Method untuk menampilkan data
    void tampilkanData() {
        System.out.println("\n=== Data Mahasiswa ===");
        System.out.println("NIM     : " + nim);
        System.out.println("Nama    : " + nama);
        System.out.println("Jurusan : " + jurusan);
    }
}

public class MahasiswaApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan NIM     : ");
        String nim = scanner.nextLine();

        System.out.print("Masukkan Nama    : ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan Jurusan : ");
        String jurusan = scanner.nextLine();

        // Membuat objek Mahasiswa
        Mahasiswa mhs = new Mahasiswa(nim, nama, jurusan);

        // Menampilkan data
        mhs.tampilkanData();

        scanner.close();
    }
}
