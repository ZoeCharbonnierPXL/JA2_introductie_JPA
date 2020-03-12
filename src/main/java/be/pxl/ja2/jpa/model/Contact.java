package be.pxl.ja2.jpa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contacts") //objecten van klasse contact zitten opgeslaan in de tabel met naam: contacts
public class Contact {
	@Id //primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) //strategie die hibernate moet gebruiken voor genereren nieuwe obj
	private int id;
	private String name;
	private int phone;
	private String email;

	public Contact() { //altijd default constructor toevoegen
	}

	public Contact(String name, int phone, String email) {
		this.name = name;
		this.phone = phone;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Contact{" +
				"id=" + id +
				", name='" + name + '\'' +
				", phone=" + phone +
				", email='" + email + '\'' +
				'}';
	}
}
