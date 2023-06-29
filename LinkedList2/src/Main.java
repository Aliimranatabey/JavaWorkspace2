import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

	public static void listeyiBastir(LinkedList<String> gidilecekYerler) {
		/*
		 * for(String s:gidilecekYerler) { System.out.println(s); }
		 */

		ListIterator<String> iterator = gidilecekYerler.listIterator();

		while (iterator.hasNext()) { // iterator.hasNext() ifadesi belirtilen iteratorden sonra bir nesne var mı ?
										// diye kontrol ediyor en son referansın gösterdiği bir nesne olmadığı için onun
										// değeri false döner mesela .
										// iterator.hasPrevious() ifadesi belirtilen iteratorden önce bir nesne var mı ?
										// diye kontrol ediyor
			System.out.println(iterator.next());

		}

	}

	public static void siraliEkle(LinkedList<String> gidilecekSehirler, String yeni) {

		ListIterator<String> iterator = gidilecekSehirler.listIterator();
		while (iterator.hasNext()) {

			int karsilastir = iterator.next().compareTo(yeni); // eğer yeni, iteratorun gösterdiği değerle esitse
																// karsilastirin sonucu 0 cikar .Eger yeni, iteratorun
																// gösterdiği değerden daha büyükse karsilastirin sonucu
																// -1 cikar . Yani 0 dan kucuk cikar . Eger yeni
																// ,iteratorun gösterdigi degerden daha kuckse
																// karsilastirin degeri 0 dan buyuk cikar . Yani 3 tane
																// durumumuz var buna gore biz bu yeni degeri nereye
																// yerlestirecegimize karar verecegiz .

			if (karsilastir == 0) {
				// iki deger esit
				System.out.println("Listenizde bu eleman zaten var...");
				return; // Hicbir deger dondurmuyoruz sadece methodumuzu sonlandirmak icin kullaniyoruz
						// .
			} else if (karsilastir < 0) {// Burdaki eklemeyi tam anlayamadim .
				// yeni deger iterator.next() den daha buyuk.
			} else {
				iterator.previous();
				iterator.add(yeni);
				return; // Hicbir deger dondurmuyoruz sadece methodumuzu sonlandirmak icin kullaniyoruz
						// .
			}

		}
		iterator.add(yeni);
	}

	public static void main(String[] args) {

		LinkedList<String> gidilecekYerler = new LinkedList<String>();
		gidilecekYerler.add("Postane");
		gidilecekYerler.add("Market");
		gidilecekYerler.add("Okul");
		gidilecekYerler.add("Kutuphane");
		gidilecekYerler.add("Spor Salonu");
		gidilecekYerler.add("Ev");
		listeyiBastir(gidilecekYerler);
		System.out.println("--------------------------------");
		gidilecekYerler.add(4, "Alisveris Merkezi");
		gidilecekYerler.remove(3);
		listeyiBastir(gidilecekYerler);
		LinkedList<String> gidilecekSehirler = new LinkedList<String>();
		siraliEkle(gidilecekSehirler, "Istanbul");
		siraliEkle(gidilecekSehirler, "Ankara");
		siraliEkle(gidilecekSehirler, "Kocaeli");
		siraliEkle(gidilecekSehirler, "Mersin");
		siraliEkle(gidilecekSehirler, "Bursa");
		listeyiBastir(gidilecekSehirler);
	}

}
