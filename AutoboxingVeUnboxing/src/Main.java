import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		/*
		 * 
		 * WRAPPER CLASS
		 * 
		 * boolean ---------> Boolean char ------------> Character byte ------------>
		 * Byte short -----------> Short int -------------> Integer long ------------>
		 * Long float -----------> Float double ----------> Double
		 * 
		 */

		ArrayList<String> arrayList = new ArrayList<String>();
		// ArrayList<int> arrayList2=new ArrayList<int>(); // Bu arraylistler içerisine
		// referans bir tip koymamız gerekiyor yani ArrayList<int> gibi ilkel bir veri
		// tipi koyarsak hata alırız . ArrayList<Integer> şeklinde yazmamız gerekiyor .

		ArrayList<Integer> arrayList2 = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {
			arrayList2.add(Integer.valueOf(i * 4)); // AUTOBOXING : Biz primitive (ilkel) bir veri tipi olan i değerini
													// bir kutuya alıyoruz ve bunu wrapper class cinsinde arrayliste
													// atıyoruz .
			arrayList2.add(i * 4); // JAVA BIZE KENDINI GEREKSIZ KASMA BU SEKILDE YAZ BIRAK DIYOR .
		}
		for (int i = 0; i < arrayList2.size(); i++) {
			arrayList2.add(arrayList2.get(i).intValue()); // UNBOXING : Biz o kutudan o degeri cikariyoruz .
			arrayList2.add(arrayList2.get(i)); // JAVA BIZE KENDINI GEREKSIZ KASMA BU SEKILDE YAZ BIRAK DIYOR .
		}
		// Ancak java bu autoboxing ve unboxing olaylarını programcıdan beklemiyor java
		// kendisi otamatik olarak yapiyor .
	}

}
