package latihan;

import java.util.Scanner;

public class BangunDatar extends BangunDatarAbstract{
    int menu;
    public static void main(String[] args) {
        BangunDatar bangunDatar = new BangunDatar();
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("=========================  MENU  ========================\n");
            System.out.println("1. Persegi \n2. Persegi Panjang \n3. Lingkaran \n");
            System.out.print("Masukkan pilihan (0 untuk berhenti): ");
            bangunDatar.menu = input.nextInt();

            if(bangunDatar.menu == 1) persegi();
            else if(bangunDatar.menu == 2) persegiPanjang();
            else if(bangunDatar.menu == 3) lingkaran();
            else System.out.println("Pilihan tidak tersedia.");
        }while(bangunDatar.menu != 0);


    }

    static void persegi(){
        Scanner input = new Scanner(System.in);
        int s, luas, keliling;
        System.out.print("Masukkan sisi: ");
        s = input.nextInt();
        luas = s*s;
        keliling = 4*s;
        BangunDatar bangunDatar = new BangunDatar();
        bangunDatar.keliling(keliling);
        bangunDatar.luas(luas);
    }

    static void persegiPanjang(){
        Scanner input = new Scanner(System.in);
        int p, l, luas, keliling;
        System.out.print("Masukkan panjang: ");
        p = input.nextInt();
        System.out.print("Masukkan lebar: ");
        l = input.nextInt();
        luas = p*l;
        keliling = 2*(p+l);
        BangunDatar bangunDatar = new BangunDatar();
        bangunDatar.keliling(keliling);
        bangunDatar.luas(luas);
    }


    static void lingkaran(){
        Scanner input = new Scanner(System.in);
        int r;
        double phi=3.14, luas, keliling;
        System.out.print("Masukkan jari-jari: ");
        r = input.nextInt();
        luas = phi*r*r;
        keliling = 2*phi*r;
        BangunDatar bangunDatar = new BangunDatar();
        bangunDatar.keliling(keliling);
        bangunDatar.luas(luas);
    }

    @Override
    void luas(double luas) {
        super.luas(luas);
    }

    @Override
    void keliling(double kel) {
        super.keliling(kel);
    }
}
