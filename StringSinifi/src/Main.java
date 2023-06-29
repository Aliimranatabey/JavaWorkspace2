
public class Main {

	public static void main(String[] args) {

		String a = "Mustafa";
		String b = new String("Mustafa");
		System.out.println(b); // Cikti : Mustafa
		System.out.println("Harf Sayisi : " + b.length()); // Cikti : Harf Sayisi : 7
		System.out.println("0.indeks : " + b.charAt(0)); // Cikti : 0.indeks : M
		System.out.println("2.indeks : " + b.charAt(2)); // Cikti : 2.indeks : s
		System.out.println("Son eleman : " + b.charAt(b.length() - 1)); // Cikti : Son eleman : a

		for (int i = 0; i < b.length(); i++) {
			System.out.println(b.charAt(i));
		}

		System.out.println(b.startsWith("Mu")); // Cikti : true // Belirilen ifade ile mi başlıyor ?
		System.out.println(b.endsWith("CO")); // Cikti : false // Belirilen ifade ile mi bitiyor ?
		System.out.println(b.indexOf('a')); // Cikti : 4 // Belirtilen karakter String değişkeni içerisinde hangi
											// indekste ? Eğer
											// varsa indeks numarasını yoksa -1 değerini dönderir.
		System.out.println(b.indexOf('b')); // Cikti : -1
		System.out.println(b.lastIndexOf('a')); // Cikti : 6 // Belirtilen karakter String değişkeni içerisinde sondan
												// kaçıncı
												// indekste ? Eğer
												// varsa indeks numarasını yoksa -1 değerini dönderir.
		System.out.println(b.lastIndexOf('b')); // Cikti : -1
		System.out.println(b.toLowerCase()); // Cikti : mustafa // Verilen string değişkenin tüm harflarini küçültür
		System.out.println(b.toUpperCase()); // Cikti : MUSTAFA // Verilen string değişkenin tüm harflarini büyültür

		String c = "1923";
		int d = Integer.parseInt(c); // Cikti : 1923 // Verilen String değeri integer bir değere dönüştürme işlemi
										// yapar .
		System.out.println(d);

		int e = 1923;
		String f = String.valueOf(e); // Cikti : 1923 // Verilen int değeri String bir değere dönüştürme işlemi yapar

		System.out.println(f);

		String a1 = "Mustafa";
		String b1 = "Mustafa";

		if (a1 == b1) {
			System.out.println("Esitler"); // Cikti : Esitler // Eşitlerdir çünkü bunlar bellekte aynı yeri
											// gösteriyorlar . Java bunları
											// öyle yerleştirir.
		}

		String c1 = new String("Mustafa");
		String d1 = new String("Mustafa");

		if (a1 == b1) {
			System.out.println("Esitler"); // Cikti : Esitler
		} else {
			System.out.println("Esit Değiller"); // Eşit değiller çünkü bunlar bellekte aynı yeri göstermiyorlar .
		}

		if (c1.equals(d1)) {
			System.out.println("Icerikleri Esitler"); // Cikti : Icerikleri Esitler // Eşitlerdir çünkü bunların
														// içerikleri aynı şeydir .
		} else {
			System.out.println("Icerikleri Esit Degiller");
		}
	}

}
