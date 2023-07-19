package com.mustafamurat.paket1;

import com.mustafamurat.paket2.Araba; //Farklı pakette oldugu icin import etmemiz gerekir
import com.mustafamurat.paket2.Araba2;

public class Main {
	/*
	 * 
	 * Access Modifiers - Erişim Belirleyiciler
	 * 
	 * Erişim belirleyiciler 2 düzeyde erişim belirlerler.
	 * 
	 * Sınıf düzeyinde eirişim belirleyiciler
	 * 
	 * public : Bir class eger public yazilmissa bu classa paketin icindeki ve
	 * paketin dısındaki tum classlar tarafından erisilir .
	 * 
	 * default : Default erisim belirleyici kullanmamak anlamına gelir . Eger bir
	 * class hicbir erisim belirleyici kullanmadan yazılmıssa , bu class'a sadece
	 * aynı paketin icindeki classlar erisebilir . Paketin dısındaki classlar bu
	 * class'a erisemez .
	 *** 
	 * protected , private erisim belirleyiciler classlar icin kullanılmazlar .
	 * 
	 * Metod ve Ozellik Duzeyinde Erisim Belirleyiciler
	 * 
	 * public : Eger bir metod ve ozellik(class member veya alan) public olarak
	 * tanimlanmissa , bu alana paketin icindeki ve dısındaki tum classlar
	 * erisebilir .
	 * 
	 * default : Eger bir metod veya ozellik tanımlanırken hicbir erisim belirleyici
	 * kullanılmamıssa (default), bu alana sadece kendi paketindeki classlar
	 * erisebilir
	 * 
	 * protected : Eger bir metod veya ozellik (class member veya alan) public
	 * olarak tanımlanmıssa , bu alana aynı paketin icindeki diger classlar
	 * tarafından erisilebilir . Paketin dısındaki classlar ise sadece ve sadece bu
	 * alanın bulundugu classın bir alt classıysa erisilebilir .
	 * 
	 * private : Eger bir alan private olarak tanımlanmıssa bu alana sadece kendi
	 * classı erisebilir .
	 * 
	 * Daha onceden ogrendigimiz gibi bir methodun içinde tanımlanmıs degiskenler
	 * lokal degiskenler lokal degisken olarak tanımlanırlar .Yani , bu degiskenlere
	 * diger metodlardan ve classlardan erisilemez . Bundan dolayı bu degiskenlere
	 * access modifier eklenemez.
	 * 
	 */
	public static void main(String[] args) {

		Araba araba = new Araba(); // Farklı pakette oldugu icin import etmemiz gerekir
		Araba2 araba2 = new Araba2(); // Araba2 classı default erişim belirleyici ile tanımlandığı ve Farklı pakette
										// oldukları icin import etsek bile hata alıyoruz .
		System.out.println(araba.model);
        System.out.println(araba.renk);
        System.out.println(araba.yil);*/
        
        /*Hayvan hayvan = new Hayvan("Hayvan");
        System.out.println(hayvan.isim);*/
	}

}
