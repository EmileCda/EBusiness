package fr.emile.mavenone.entity;

public class Table {
	private int id;
	private String number;
	private String street;
	private String city;
	private String zipCode;
	private int idUser;
	
	public Table(int id, String number, String street, String city, String zipCode, int idUser) {
		super();
		this.setId(id);
		this.setNumber(number);
		this.street = street;
		this.city = city;
		this.zipCode = zipCode;
		this.idUser = idUser;
	}
	public int getId() {
		return id /2;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		
		
		this.number = "monnumber "+ number;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public int getIdUser() {
		return idUser;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	
	
}
