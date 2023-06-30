
public class MakineMuhendisi implements IMuhendis {

	private boolean askerlik;
	private boolean adliSicil;

	public MakineMuhendisi(boolean askerlik, boolean adliSicil) {
		this.askerlik = askerlik;
		this.adliSicil = adliSicil;
	}

	@Override
	public void askerlikDurumuSorgula() {

		if (askerlik) {
			System.out.println("Askerligimi yaptim.");
		} else {
			System.out.println("Askerligimi henuz yapmadim.");
		}

	}

	@Override
	public String mezuniyetOrtalamasi(double derece) {

		return "Ortalamam : " + derece;
	}

	@Override
	public void adliSicilSorgula() {

		if (adliSicil) {
			System.out.println("Adli sicil kaydim bulunuyor.");
		} else {
			System.out.println("Herhangi bir adli sicil kaydim bulunmuyor.");
		}

	}

	@Override
	public void isTecrubesi(String[] array) {

		if (array.length == 0) {
			System.out.println("Herhangi bir iş tecrübem bulunmuyor.");
		} else {
			System.out.println("Makine Mühendisi Olarak Su Sirketlerde Calistim ...");
			for (int i = 0; i < array.length; i++) {

				System.out.println(array[i]);

			}
		}

	}

	public void referansGetir(String[] array) {

		if (array.length == 0) {
			System.out.println("Herhangi bir referansım bulunmuyor.");
		} else {
			System.out.println("Referanslarım ...");
			for (int i = 0; i < array.length; i++) {

				System.out.println(array[i]);

			}
		}
	}

}
