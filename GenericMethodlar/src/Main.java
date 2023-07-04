
public class Main {

	public static void main(String[] args) {

		Sayisal sayisal1 = new Sayisal(30, 40, 20, 30);
		Sayisal sayisal2 = new Sayisal(25, 45, 2, 35);

		Sayisal birinci1 = birinci(sayisal1, sayisal2);

		EsitAgirlik esitAgirlik1 = new EsitAgirlik(30, 40, 20, 2);
		EsitAgirlik esitAgirlik2 = new EsitAgirlik(40, 10, 50, 0);

		EsitAgirlik birinci2 = birinci(esitAgirlik1, esitAgirlik2);

		System.out.println("Birinci Sayisal Ogrencinin Puani : " + birinci1.puanHesapla());
		System.out.println("Birinci Esit Agirlik Ogrencinin Puani : " + birinci2.puanHesapla());
		/*Character[] charDizi = { 'J', 'A', 'V', 'A' };
		Integer[] integerDizi = { 1, 2, 3, 4, 5, 6 };
		String[] stringDizi = { "Java", "Python", "C++", "Php" };
		Ogrenci[] ogrenciDizi = { new Ogrenci("Mustafa"), new Ogrenci("Mehmet"), new Ogrenci("Merve") };

		yazdir(charDizi);
		yazdir(integerDizi);
		yazdir(stringDizi);
		yazdir(ogrenciDizi);*/
	}

	// GENERIC METHOT ORNEGI
	public static <E extends Aday> E birinci(E e1, E e2) {

		if (e1.puanHesapla() > e2.puanHesapla()) {
			return e1;
		} else {
			return e2;
		}

	}

	/*public static <E> void yazdir(E[] dizi) {
		for (E e : dizi) {
			System.out.println(e);
		}
	}*/

}
