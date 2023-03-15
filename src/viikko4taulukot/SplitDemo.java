package viikko4taulukot;

public class SplitDemo {

	public static void main(String[] args) {
		String tyontekijanTiedot = "Jukka Juslin;1000;1977;35";
		
		String[] yksiTyontekija = tyontekijanTiedot.split(";");
		String tyontekijanNimi = yksiTyontekija[0];
		String tyontekijanPalkka = yksiTyontekija[1];	
		String tyontekijanSyntymavuosi = yksiTyontekija[2];
		String tyontekijanVeroprosentti = yksiTyontekija[3];
		System.out.println(tyontekijanNimi);
		System.out.println(tyontekijanPalkka);		
		System.out.println(tyontekijanSyntymavuosi);
		System.out.println(tyontekijanVeroprosentti);
	}

}
