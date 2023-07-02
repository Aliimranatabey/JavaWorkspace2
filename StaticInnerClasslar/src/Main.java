
public class Main {

	public static void main(String[] args) {

		Matematik.Alan alan = new Matematik.Alan(); // Bu kullanım static inner classlar icin dogrudur .

		alan.daireAlan(5);
		Matematik.Alan.staticDaireAlan(5);

	}

}
