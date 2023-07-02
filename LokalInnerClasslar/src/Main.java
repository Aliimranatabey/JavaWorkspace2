
public class Main {

	public static void main(String[] args) {

		/*
		 * 
		 * Eger siz bir tane class tanimlayacaksaniz ve hemen bir obje olusturmak
		 * istiyorsaniz bunu baska dosyada yapmaniza gerek yok sadece o methodun
		 * icersinde kullanacaksanız bunu direkt local inner class olarak
		 * tanimlayabilirsiniz . Herhangi bir ekstra baska bir classin icinde bunu
		 * eklemeye hic luzum yok , direkt sadece o methodun icersinde siz bunu
		 * kullanacaksaniz burada local inner class tanimlamak cok mantikli bir secenek
		 * olarak karsimiza cikiyor
		 * 
		 */

		// public static class Alan {} // boyle bir class olusturma sekli yoktur . Cunku
		// 'public' , 'static' gibi anahtar kelimeler sadece ve sadece classin
		// ozelliklerine ve methotlarina eklenebilen anahtar kelimelerdir . Bundan
		// dolayi burda boyle kullanmaya calistigimiz icin hata aliriz .

		// Bu Alan Classi sadece main methodunun icerisinde gecerlidir .
		class Alan {

			public void daireAlan(int yaricap) {

				System.out.println("Dairenin Alani : " + (yaricap * yaricap * Math.PI));

			}
		}

		Alan alan = new Alan();
		Alan alan2 = new Alan();
		alan.daireAlan(10);
		alan2.daireAlan(3);

	}

	public static void deneme() {

		// Alan alan1=new Alan(); // Bu satir hatalidir . Erismeye calistigimiz methot
		// baska bir methodun innerclassi oldugu icin farkli bir methot icerisinden
		// erismeye calisinca hata verir .
	}
}
