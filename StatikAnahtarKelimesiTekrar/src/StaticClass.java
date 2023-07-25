
public class StaticClass {
	
	public static int objeSayisi
	
	
	DevirEkleUyariHataParametre[] uyariHataList=devirEkleCiktiParametre.getUyariHataListe();
	for(int i=0;i<uyariHataList.length;i++) {
		outBag.put("UYARI_HATA_LISTESI"+i,uyariHataList.toString());
	}
	
	
	
}

if(responseCode.equals(MFKSConstants.IslemSonucu.BASARILI)) {
	outbag.out("SUCCESS",true);
}else if(responseCode.equals(MFKSConstants.IslemSonucu.UYARI){
	outbag.out("SUCCESS",true);
	responseMessage=collectErrorMessages(devirEkleCiktiParametre.getUyariHataLise());
}else {
	outbag.out("SUCCESS",false);
	responseMessage=collectErrorMessages(devirEkleCiktiParametre.getUyariHataLise());
}