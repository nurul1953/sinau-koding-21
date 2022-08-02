// package latihan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Mhs{
    String nama, jurusan, nim, status;
    int nilai;

    public Mhs(String nama, String jurusan, String nim, String status, int nilai) {
        this.nama = nama;
        this.jurusan = jurusan;
        this.nim = nim;
        this.status = status;
        this.nilai = nilai;
    }

    public String getNama() {
        return nama;
    }

    public String getJurusan() {
        return jurusan;
    }

    public String getNim() {
        return nim;
    }

    public String getStatus() {
        return status;
    }

    public int getNilai() {
        return nilai;
    }
}

public class Mahasiswa {

    public static void main(String[] args) {
        String nama, jurusan, nim, status;
        int nilai, jml;

        Scanner input = new Scanner(System.in);
        Scanner name = new Scanner(System.in);

        List<Mhs> mhsList = new ArrayList<>();

        System.out.print("Masukkan jumlah mahasiswa : ");
        jml = input.nextInt();
        for (int i = 0; i < jml; i++) {
            System.out.println("Mahasiswa " + (i+1));
            System.out.print("Nama: ");
            nama = name.nextLine();
            System.out.print("Jurusan: ");
            jurusan = name.nextLine();
            System.out.print("NIM: ");
            nim = name.nextLine();
            System.out.print("Nilai: ");
            nilai = input.nextInt();

            if(nilai>65) status="Lulus";
            else status = "Tidak Lulus";

            mhsList.add(new Mhs(nama, jurusan, nim, status, nilai));
        }
        System.out.println("\n== DAFTAR NILAI MAHASISWA ==\n");
        System.out.println("No\tNama\tJurusan\tNIM\t\tNilai\tStatus");
        int no=1;
        for (Mhs i:mhsList){
            System.out.println(no++ +"\t"+ i.getNama() +"\t"+ i.getJurusan() +"\t\t"+ i.getNim() +"\t"+ i.getNilai() +"\t\t"+ i.getStatus());
        }
    }
}
