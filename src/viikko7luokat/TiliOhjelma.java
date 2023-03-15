package viikko7luokat;

public class TiliOhjelma {

	public static void main(String[] args) {
		Tili tili = new Tili();
		tili.talletus(200.0);
		System.out.println(tili);
	}
}
class Tili {
	private double saldo = 0;

	
	
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	// METODI, JOKA SAA PARAMETRINA TALLETUSMAARAN JA EI PALAUTA MITAAN
	// METODIT EIVAT YLEENSA OLE STATIC
	public void talletus(double maara) {
		saldo = saldo + maara;
	}

	@Override
	public String toString() {
		return "Tili [saldo=" + saldo + "]";
	}
}
