import java.util.Scanner;

public class Main {
	private static Sarkicilar sarkicilar = new Sarkicilar(); // COMPOSITION
	private static Scanner scanner = new Scanner(System.in);

	public static void islemleriBastir() {
		System.out.println("\t 0-Islemleri Goruntule"); // \t => tab karakterini temsil eder.
		System.out.println("\t 1-Sarkicilari Goruntule");
		System.out.println("\t 2-Sarkici Ekle");
		System.out.println("\t 3-Sarkici Guncelle");
		System.out.println("\t 4-Sarkici Sil");
		System.out.println("\t 5-Sarkici Ara");
		System.out.println("\t 6-Uygulamadan Cik");
	}

	public static void sarkiciGoruntule() {
		sarkicilar.sarkicilariBastir();
	}

	public static void sarkiciEkle() {
		System.out.print("Eklemek istediginiz sarkicinin ismi : ");
		String isim = scanner.nextLine();
		sarkicilar.sarkiciEkle(isim);
	}

	public static void sarkiciGuncelle() {
		System.out.print("Guncellemek istediginiz pozisyon(1,2,3...) : ");
		int pozisyon = scanner.nextInt();
		scanner.nextLine(); // Bunu yapmamızın sebebi enter'ı input olarak algılamamasını istiyoruz o yüzden
							// biz burda dummy bir imput alma islemi yapıyoruz.
		System.out.print("Eklemek istediginiz sarkicinin ismi : ");
		String yeniIsim = scanner.nextLine();
		sarkicilar.sarkiciGuncelle(yeniIsim, pozisyon - 1);
	}

	public static void sarkiciSil() {
		System.out.print("Silmek istediginiz pozisyon(1,2,3...) : ");
		int pozisyon = scanner.nextInt();
		scanner.nextLine();
		sarkicilar.sarkiciSil(pozisyon - 1);
	}

	public static void sarkiciAra() {
		System.out.print("Aramak istediginiz sarkici ismini giriniz : ");
		String isim = scanner.nextLine();
		sarkicilar.sarkiciAra(isim);
	}

	public static void main(String[] args) {

		System.out.println("\t Sarkici uygulamasina hosgeldiniz...");
		islemleriBastir();

		boolean cikis = false;
		int islem;

		while (!cikis) {
			System.out.println("Bir islem seciniz: ");
			islem = scanner.nextInt();
			scanner.nextLine();
			switch (islem) {
			case 0:
				islemleriBastir();
				break;
			case 1:
				sarkiciGoruntule();
				break;
			case 2:
				sarkiciEkle();
				break;
			case 3:
				sarkiciGuncelle();
				break;
			case 4:
				sarkiciSil();
				break;
			case 5:
				sarkiciAra();
				break;
			case 6:
				cikis = true;
				System.out.println("Uygulamadan çıkılıyor ...");
				break;
			}
		}

	}

}
