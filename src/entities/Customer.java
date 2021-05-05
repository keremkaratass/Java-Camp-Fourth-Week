package entities;

import java.time.LocalDate;
import java.util.Date;

import abstracts.Entity;



public class Customer implements Entity   {
//Kodlar�m�z� yazarken somut s�n�flar buradaki gibi ��plak kal�yorsa yani herhangi bir inheritance ya da implemantasyon alm�yorsa ileride nesnellik zaafiyeti ya�ar�z.
  private int id;
  private String firstName;
  private String lastName;
  private String nationalityId;
  private LocalDate birthDate;
  
  
  
public Customer() {
	
}
public Customer(int id, String firstName, String lastName, String nationalityId, LocalDate birthDate) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.nationalityId = nationalityId;
	this.birthDate = birthDate;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getNationalityId() {
	return nationalityId;
}
public void setNationalityId(String nationalityId) {
	this.nationalityId = nationalityId;
}
public LocalDate getBirthDate() {
	return birthDate;
}
public void setBirthDate(LocalDate birthDate) {
	this.birthDate = birthDate;
}

  
  
}
