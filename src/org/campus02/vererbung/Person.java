package org.campus02.vererbung;

public class Person {
	
	protected String vorname;
	protected String nachname;
	
	
	
	/**
	 * @param vorname
	 * @param nachname
	 */
	public Person(String vorname, String nachname) {
		super();
		this.vorname = vorname;
		this.nachname = nachname;
	}
	
	



	public String getVorname() {
		return vorname;
	}



	public String getNachname() {
		return nachname;
	}



	public void setVorname(String vorname) {
		this.vorname = vorname;
	}



	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	
	@Override
	public String toString() {
		return "Person [vorname=" + vorname + ", nachname=" + nachname + "]";
	}

}
