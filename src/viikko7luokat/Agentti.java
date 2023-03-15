package viikko7luokat;

public class Agentti {
	// 1. ATTRIBUUTIT
    private String etunimi;
    private String sukunimi;
    
    // 2. PARAMETRILLINEN KONSTRUKTORI
    public Agentti(String etunimi, String sukunimi) {
        this.etunimi = etunimi;
        this.sukunimi = sukunimi;
    }
    // 3. METODIT (SET JA GET YMS)
    public void tulosta() {
        System.out.println("My name is " + sukunimi + ", " + etunimi + " " + sukunimi);
    }
    // 4. TOSTRING-METODI
	@Override
	public String toString() {
		String paluu = "";
		paluu += "My name is ";
		paluu += sukunimi + ", ";
		paluu += etunimi + " " + sukunimi;
		
		return paluu;
	}   
}
