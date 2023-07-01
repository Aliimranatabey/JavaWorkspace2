import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// GEOMETRIK SEKIL HESAPLAMA

		Scanner scanner = new Scanner(System.in);

		String islemler = "Islemler...\n" + "1. Kare Alani Hesapla\n" + "2. Ucgen Alani Hesapla\n"
				+ "3. Daire Alani Hesapla\n" + "Cikis : q";

		while (true) {
			System.out.println(islemler);
			System.out.print("Hangi Seklin Alaninin Hesaplamak Istiyorusunuz ? : ");
			String sekilTuru = scanner.nextLine();
			Sekil sekil = null;
			if (sekilTuru.equals("q")) {
				System.out.println("Programdan Cikiliyor...");
				break;
			} else if (sekilTuru.equals("1")) {
				System.out.print("Karenin Kenari : ");
				int kenar = scanner.nextInt();
				scanner.nextLine();
				sekil = new Kare("Kare1", kenar);
				sekil.alanHesapla();
			} else if (sekilTuru.equals("2")) {
				System.out.print("Kenar 1 : ");
				int kenar1 = scanner.nextInt();
				scanner.nextLine();
				System.out.print("Kenar 2 : ");
				int kenar2 = scanner.nextInt();
				scanner.nextLine();
				System.out.print("Kenar 3 : ");
				int kenar3 = scanner.nextInt();
				scanner.nextLine();
				sekil = new Ucgen("Ucgen1", kenar1, kenar2, kenar3);
				sekil.alanHesapla();
			} else if (sekilTuru.equals("3")) {
				System.out.print("Dairenin Yaricapi : ");
				int yaricap = scanner.nextInt();
				scanner.nextLine();
				sekil = new Daire("Ucgen1", yaricap);
				sekil.alanHesapla();
			} else {
				System.out.println("Gecersiz Islem !");
			}

		}

	}
}
