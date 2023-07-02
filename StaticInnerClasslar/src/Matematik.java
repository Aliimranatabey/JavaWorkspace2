
public class Matematik {

	private double pi = Math.PI;

	public static class Alan {

		public void daireAlan(int yaricap) {

			System.out.println("Dairenin Alani : " + (yaricap * yaricap * Math.PI));

		}

		public static void staticDaireAlan(int yaricap) {

			// System.out.println("Dairenin Alani : " + (yaricap * yaricap * pi)); // bu
			// satir hatali bir kullanimdir
			// .Static bir class icerisinden static
			// olmayan bir class icerisindeki
			// degiskenlere ve methotlara erisilemez (pi)
			System.out.println("Dairenin Alani : " + (yaricap * yaricap * Math.PI));

		}
	}
}
