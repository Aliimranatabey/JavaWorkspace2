
public class Main {

	public static void main(String[] args) {

		// Asagidaki yapinin en cok kullanildigi yeri soyle aciklayabiliriz . Siz eger
		// javadan sonra bir android gelistirme egitimine baslarsaniz , androidde ilk
		// olarak genelde butonlar gosterilir . Siz bunu orda cok fazla goreceksiniz.
		// Yani bu anonim inner class yapisi Androidde cok fazla kullaniliyor
		IOgrenci iOgrenci = new IOgrenci() {

			@Override
			public void derseGir() {

				System.out.println("Derse Giriyorum...");

			}

			@Override
			public void dersCalis() {

				System.out.println("Ders Calisiyorum...");

			}
		};

		iOgrenci.dersCalis();
		iOgrenci.derseGir();

		System.out.println("***************************************************");

		AOgrenci aOgrenci = new AOgrenci("Mustafa Murat Coskun", 314) {

			@Override
			void kayitYaptir() {

				System.out.println("Kayit yapiliyor... " + "Isim : " + getIsim() + " Numara : " + getNumara());

			}
		};

		aOgrenci.kayitYaptir();
		aOgrenci.selamla();
	}

	public interface IOgrenci {

		void dersCalis();

		void derseGir();
	}

	// interfaceden farkli olarak govdeli methot bulundurdugu icin main methodu
	// icersinde cagrildiginda hata almamasi icin "static" olarak tanimlanmasi
	// gerekmektedir .

	public static abstract class AOgrenci {

		private String isim;
		private int numara;

		public AOgrenci(String isim, int numara) {
			this.isim = isim;
			this.numara = numara;
		}

		public String getIsim() {
			return isim;
		}

		public void setIsim(String isim) {
			this.isim = isim;
		}

		public int getNumara() {
			return numara;
		}

		public void setNumara(int numara) {
			this.numara = numara;
		}

		abstract void kayitYaptir();

		public void selamla() {

			System.out.println("Selamlar...");

		}
	}

}
