import java.util.Scanner;

public class BangunDatar{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int menu;
		do{
			System.out.println("=========================  MENU  ========================\n");
			System.out.println("1. Persegi \n2. Persegi Panjang \n3. Lingkaran \n");
			System.out.print("Masukkan pilihan (0 untuk berhenti): ");
			menu = input.nextInt();

			if(menu == 1) persegi();
			else if(menu == 2) persegiPanjang();
			else if(menu == 3) lingkaran();
			else System.out.println("Pilihan tidak tersedia.");
		}while(menu != 0);
	}

	static void persegi(){
		Scanner input = new Scanner(System.in);
		int s, luas, keliling;
		System.out.print("Masukkan sisi: ");
		s = input.nextInt();
		luas = s*s;
		keliling = 4*s;
		System.out.println("keliling = "+keliling);
		System.out.println("Luas = "+luas);
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
		System.out.println("keliling = "+keliling);
		System.out.println("Luas = "+luas);
	}


	static void lingkaran(){
		Scanner input = new Scanner(System.in);
		int r;
		double phi=3.14, luas, keliling;
		System.out.print("Masukkan jari-jari: ");
		r = input.nextInt();
		luas = phi*r*r;
		keliling = 2*phi*r;
		System.out.println("keliling = "+keliling);
		System.out.println("Luas = "+luas);
	}

}