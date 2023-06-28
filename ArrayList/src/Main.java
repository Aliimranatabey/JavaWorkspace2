import java.util.ArrayList;

public class Main {

	public static void yazdir(ArrayList<String> a) {
		for (int i = 0; i < a.size(); i++) {
			System.out.println("Element " + (i + 1) + " : " + a.get(i));
		}
	}

	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<String>();

		arrayList.add("Metallica");
		arrayList.add("Gun's Roses");
		arrayList.add("Black Sabbath");
		arrayList.add("Iron Maiden");
		arrayList.add("Metallica");

		// System.out.println(arrayList.get(0));
		// System.out.println(arrayList.get(1));
		// System.out.println(arrayList.get(5));
		// System.out.println(arrayList.size());

		// arrayList.remove("Metallica"); // remove icerisine index te verebiliriz
		// değerin kendisini de verebiliriz .
		// arrayList.remove(1);

		// System.out.println(arrayList.indexOf("Metallica")); // Metallicayı ilk
		// gördüğü yerin indexini verir . Yani 0. elemandır .

		// System.out.println(arrayList.lastIndexOf("Metallica"));
		// System.out.println(arrayList.indexOf("Dream Theater"));

		// for (int i = 0; i < arrayList.size(); i++) {
		// System.out.println(arrayList.get(i));
		// }

		arrayList.set(4, "Megadeth");

		yazdir(arrayList);

	}

}
