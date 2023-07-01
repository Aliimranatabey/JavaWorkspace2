
public class Daire extends Sekil {

	private int yaricap;

	Daire(String isim, int yaricap) {
		super(isim);
		this.yaricap = yaricap;
	}

	@Override
	void alanHesapla() {

		System.out.println(getIsim() + " in alani : " + Math.PI * (yaricap * yaricap));

	}

}
