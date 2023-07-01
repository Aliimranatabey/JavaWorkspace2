
public class Seyirci {

	private String isim;
	public static int seyirciSayisi = 0;

	Seyirci(String isim) {
		this.isim = isim;
		seyirciSayisi++;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public void oyunSeyret() {
		System.out.println(isim + " oyun seyrediyor...");
	}

	public int getSeyirciSayisi() {
		return seyirciSayisi;
	}
}
