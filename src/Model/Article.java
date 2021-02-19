package Model;

import java.io.Serializable;

public class Article implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int id;
	private String nom;
	private int price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Article(int id, String nom, int price) {
		super();
		this.id = id;
		this.nom = nom;
		this.price = price;
	}
	public Article(String nom, int price) {
		super();
		this.nom = nom;
		this.price = price;
	}
	public Article() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Article [id=" + id + ", nom=" + nom + ", price=" + price + "]";
	}
	
	
	
	
	
}
