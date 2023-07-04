
public class Sayisal extends Aday {

	public Sayisal(int turkce, int matematik, int edebiyat, int fizik) {
		super(turkce, matematik, edebiyat, fizik);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int puanHesapla() {

		return getTurkce() * 5 + getMatematik() * 5 + getFizik() * 4 + getEdebiyat() * 1;

	}

}
