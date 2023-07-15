
public class KapsamSinifi2 {

	private int privateDegisken = 30;

	public KapsamSinifi2() {

	}

	public void dahiliSinifKontrol() {
		DahiliSinif d = new DahiliSinif();
		System.out.println("Kontrol Ediliyor..." + d.a); // Private Degiskene erisebiliyoruz cunku bu a degiskeni aynı
															// zamanda KapsamSinifi2 nin icerisinde tanimlanmis bir
															// degiskendir.
	}

	public class DahiliSinif {
		private int privateDegisken = 20;
		private int a = 3;

		public void onileCarp() {
			int privateDegisken = 10;
			System.out.println("*************************************");
			for (int i = 1; i < 6; i++) {
				System.out.println("---------------------------------------------------");
				System.out.println("ONILECARP METHODUNUN PRIVATE DEGISKENI " + i + "*" + privateDegisken + " = "
						+ (i * privateDegisken));
				System.out.println("---------------------------------------------------");
				System.out.println("DAHILI SINIFIN PRIVATE DEGISKENI " + i + "*" + this.privateDegisken + " = "
						+ (i * this.privateDegisken));
				System.out.println("---------------------------------------------------");
				System.out.println("KAPSAM SINIFI 2 NIN PRIVATE DEGISKENI " + i + "*"
						+ KapsamSinifi2.this.privateDegisken + " = " + (i * KapsamSinifi2.this.privateDegisken));
			}
		}
	}

}
