import java.util.Scanner;

public class Matematik {

	private double pi = Math.PI;

	public class Faktoriyel {

		public void faktoriyel() {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Faktoriyelinin Hesaplanmasini Istediginiz Bir sayi giriniz : ");
			int sayi = scanner.nextInt();
			scanner.nextLine();
			int fakt = 1;

			for (int i = 2; i <= sayi; i++) {
				fakt *= i;
			}

			System.out.println("Faktoriel : " + fakt);
		}

	}

	public class Asal {

		public boolean asalMi(int sayi) {

			int i = 2;
			while (i < sayi) {
				if (sayi % i == 0) {
					return false;
				}
				i++;
			}
			return true;
		}

	}

	public class Alan {

		public class DariAlan {

			public void daireAlan(int yaricap) {

				System.out.println("Dairenin Alani : " + (yaricap * yaricap * pi));

			}

		}

	}

}
