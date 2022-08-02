// package latihan;

import java.util.Scanner;

public class Mahasiswa {
    public static void main(String[] args) {
        String[] nama = new String[100];
        int[] nilai = new int[100];
        String[] ket = new String[11];
        int jml;
        Scanner input = new Scanner(System.in);
        Scanner name = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa : ");
        jml = input.nextInt();
        for (int i = 0; i < jml; i++) {
            System.out.print("Nama: ");
            nama[i] = name.nextLine();
            System.out.print("Nilai: ");
            nilai[i] = input.nextInt();

            if(nilai[i]>65) ket[i]="Lulus";
            else ket[i] = "Tidak Lulus";
        }
        System.out.println("\n== DAFTAR NILAI MAHASISWA ==\n");
        System.out.println("No\tNama\tNilai\tKeterangan");
        for (int i = 0; i < jml; i++) {
            System.out.print(i+1 +"\t"+ nama[i] +"\t"+ nilai[i] +"\t\t"+ ket[i] +"\n");
        }
    }
}
