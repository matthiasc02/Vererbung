package org.campus02.vererbung;

public class Customer extends Person {

	public int id;

		/**
	 * @param vorname
	 * @param nachname
	 * @param id
	 */
	public Customer(String vorname, String nachname, int id) {
		super(vorname, nachname);
		this.id = id;
	}



	@Override
	public String toString() {
		return "Customer [vorname=" + vorname + ", nachname=" + nachname + ", id=" + id + "]";
	}

	
	
	

	
	
	
}
