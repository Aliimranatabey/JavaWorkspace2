
public class Kare extends Sekil {

	private int kenar;

	Kare(String isim, int kenar) {
		super(isim);
		this.kenar = kenar;

	}

	@Override
	void alanHesapla() {

		System.out.println(getIsim() + " in alani : " + (kenar * kenar));

	}

}
