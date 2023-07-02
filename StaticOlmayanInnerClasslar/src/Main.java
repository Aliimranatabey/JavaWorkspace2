import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Factorial factorial; // Bu satir hata verir . Cunku Matematik Classinin Inner
		// Classina erisim sekli bu sekilde olmaz .

		// Matematik.Faktoriyel faktoriyel=new Matematik.Faktoriyel(); // Bu satir da
		// hatali bir yazimdir .

		Matematik.Faktoriyel faktoriyel = new Matematik().new Faktoriyel();
		Matematik.Asal asal = new Matematik().new Asal();
		Matematik.Alan.DariAlan daireAlan = new Matematik().new Alan().new DariAlan();

		Scanner scanner = new Scanner(System.in);

		System.out.print("Bir sayi giriniz : ");
		int sayi = scanner.nextInt();
		scanner.nextLine();

		if (asal.asalMi(sayi)) {
			System.out.println("Bu sayi asaldir.");
		} else {
			System.out.println("Bu sayi asal degildir.");
		}

		faktoriyel.faktoriyel();
		daireAlan.daireAlan(5);
	}

}
