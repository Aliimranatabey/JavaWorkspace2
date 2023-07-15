package com.mustafamurat.deneme;

import com.mustafamurat.swingornegi.Pencere; //Paketin import edilmesi ornegi
import javax.swing.JFrame; // Biz pencere classini dahil edince otomatik olarak onun icerisinde dahil edilmis olan JFrame classını da dahil etmis olmuyoruz .Burda tekrardan import etmemiz gerekiyor .

public class Main {

	public static void main(String[] args) {

		Pencere pencere = new Pencere();
		JFrame frame = new JFrame();

	}

}
