
public class Ogrenci {

	private String isim;

	Ogrenci(String isim) {
		this.isim = isim;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Isim : " + isim;
	}

}
