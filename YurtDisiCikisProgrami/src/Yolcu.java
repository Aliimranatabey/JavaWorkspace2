import java.util.Scanner;

public class Yolcu implements IYurtDisiKurallari {

	private int harc;
	private boolean siyasiYasak;
	private boolean vizeDurumu;

	public Yolcu() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Yatirdiginiz Harc Bedeli : ");
		this.harc = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Siyasi Yasaginiz Bulunuyor Mu ? (evet ya da hayir) : ");
		String cevap = scanner.nextLine();
		if (cevap.equals("evet")) {
			this.siyasiYasak = true;
		} else {
			this.siyasiYasak = false;
		}
		System.out.print("Vizeniz bulunuyor mu ? (evet ya da hayir) : ");
		String cevap2 = scanner.nextLine();

		if (cevap2.equals("evet")) {
			this.vizeDurumu = true;
		} else {
			this.vizeDurumu = false;
		}

	}

	@Override
	public boolean yurtDisiHarciKontrol() {
		if (this.harc < 15) {
			System.out.println("Lutfen Yurt Disi Cikis Harcini Tam Yatirin .");
			return false;
		} else {
			System.out.println("Yurt Disi Harci Tamam .");
			return true;
		}

	}

	@Override
	public boolean siyasiYasak() {
		if (this.siyasiYasak == true) {
			System.out.println("Siyasi Yasaginiz Bulunuyor , Yurt Disina Cikamazsiniz !");
			return false;
		} else {
			System.out.println("Siyasi Yasaginiz Bulunmuyor !");
			return true;
		}
	}

	@Override
	public boolean vizeDurumu() {
		if (this.vizeDurumu == true) {
			System.out.println("Vize islemleri tamam !");
			return true;
		} else {
			System.out.println("Vizeniz gideceginiz ulkede bulunmamaktadir !");
			return false;
		}
	}
}
