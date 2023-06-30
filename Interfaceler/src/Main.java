
public class Main {

	public static void main(String[] args) {

		PcMuhendisi muhendis1 = new PcMuhendisi(false, false);

		muhendis1.askerlikDurumuSorgula();
		muhendis1.adliSicilSorgula();
		System.out.println(muhendis1.mezuniyetOrtalamasi(3.32));
		String[] tecrube1 = { "Vestel", "Havelsan", "Turksat" };
		muhendis1.isTecrubesi(tecrube1);
		
		MakineMuhendisi muhendis2=new MakineMuhendisi(true, false);
		String[] tecrube2= {};
		String[] referans= {"Mustafa Murat Coskun","Serhat Say"};
		muhendis2.adliSicilSorgula();
		muhendis2.askerlikDurumuSorgula();
		System.out.println(muhendis2.mezuniyetOrtalamasi(2.31));
		muhendis2.isTecrubesi(tecrube1);
		muhendis2.referansGetir(referans);

	}

}
