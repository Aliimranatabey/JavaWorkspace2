
public abstract class Sekil {

	private String isim;

	Sekil(String isim) {
		this.isim = isim;
	}

	abstract void alanHesapla();

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

}
