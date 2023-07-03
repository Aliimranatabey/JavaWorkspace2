import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<String> arrayList1 = new ArrayList<String>();

		ArrayList<Integer> arraList2 = new ArrayList<Integer>();

		Character[] charDizi = { 'J', 'A', 'V', 'A' };
		Integer[] integerDizi = { 1, 2, 3, 4, 5, 6 };
		String[] stringDizi = { "Java", "Python", "C++", "Php" };
		Ogrenci[] ogrenciDizi = { new Ogrenci("Mustafa"), new Ogrenci("Mehmet"), new Ogrenci("Merve") };

		CharYazdir.yazdir(charDizi);
		System.out.println("**********************");
		StringYazdir.yazdir(stringDizi);
		System.out.println("**********************");
		IntegerYazdir.yazdir(integerDizi);
		System.out.println("**********************");
		OgrenciYazdir.yazdir(ogrenciDizi);

		YazdirmaSinifi<Character> yazdirChar = new YazdirmaSinifi<Character>();
		YazdirmaSinifi<Integer> yazdirInteger = new YazdirmaSinifi<Integer>();
		YazdirmaSinifi<String> yazdirString = new YazdirmaSinifi<String>();
		YazdirmaSinifi<Ogrenci> yazdirOgrenci = new YazdirmaSinifi<Ogrenci>();
		
		System.out.println("GENERIC CLASS ILE YAZDIRMA");
		yazdirChar.yazdir(charDizi);
		System.out.println("**********************");
		yazdirInteger.yazdir(integerDizi);
		System.out.println("**********************");
		yazdirString.yazdir(stringDizi);
		System.out.println("**********************");
		yazdirOgrenci.yazdir(ogrenciDizi);

	}

}
