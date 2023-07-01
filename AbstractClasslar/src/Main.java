
public class Main {

	public static void main(String[] args) {

		// Sekil sekil=new Sekil("Sekil"); // Asbtract Classlardan obje olusturamayiz ,
		// yani bu satır hata verir .

		Sekil sekil = new Kare("Kare2", 6); // Ancak abstract classların referanslarını alt siniflara direk olarak
											// esitleyebiliriz .

		sekil.alanHesapla();

		// sekil.cevreHesapla(); // Bu satir hata verir . Cunku bu satir Sekil abstract
		// classinin referansi ile alt classin kendine ozgu methoduna ulasmaya calisiyor

		Kare kare1 = new Kare("Kare1", 5);
		Daire daire1 = new Daire("Daire1", 3);

		kare1.alanHesapla();
		daire1.alanHesapla();
	}

}
