
public class Main {

	public static void main(String[] args) {

		Seyirci seyirci1 = new Seyirci("Oguz Artiran");
		Seyirci seyirci2 = new Seyirci("Mustafa Murat Coskun");

		seyirci1.oyunSeyret();
		System.out.println("Seyirci Sayisi : " + Seyirci.seyirciSayisi);
		// System.out.println("Seyirci Sayisi : " + Seyirci.getSeyirciSayisi()); // Bu
		// satir hata verir cunku getSeyirciSayisi() methodu static bir methot degildir
		// . Class ismi uzerinden erisilemez .
		System.out.println("Seyirci Sayisi : " + seyirci1.getSeyirciSayisi());
		System.out.println("Seyirci Sayisi : " + seyirci2.seyirciSayisi);

		// selamla(); // bu satir hata verir cunku static olan bir methotdan static
		// olmayan bir
		// methodu direkt olarak cagiramayiz ...
		
		selamla2();
	}

	// Bu methot static bir methot olmadigi icin program calisinca direkt olarak
	// olusmaz . Sadece static methotlar direkt olusur . Bu yazdigimiz methot ise
	// Main classindan olusturulan bir obje araciligi ile olusturulur.
	public void selamla() {

		System.out.println("Selamlar....");

	}
	
	public static void selamla2() {

		System.out.println("Selamlar....");

	}
}
