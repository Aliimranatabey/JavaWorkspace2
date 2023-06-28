
public class Main {

	public static void main(String[] args) {

		String[] array = { "Elma", "Armut", "Kiraz" };
		int[] array2 = { 1, 2, 3, 4, 5, 6, 7 };
		Deneme[] array3 = { new Deneme("Mustafa"), new Deneme("Murat"), new Deneme("Coskun") };
		for (String a : array) {
			System.out.println(a);
		}
		System.out.println("----------------");
		for (int i : array2) {
			System.out.println(i);
		}
		System.out.println("----------------");
		for (Deneme d : array3) {
			System.out.println(d.getIsim()); // getter setter methodları olmadan direkt System.out.println(d); yazsaydık düzgün çalışmayacaktı . Deneme@372f7a8d bu şekilde çıktılar oluşturacaktı .
		}
	}

}
