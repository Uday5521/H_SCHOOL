package hibernate_school;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Visitor {
	
	@Id
	private int id;
	private String name;
	private String email;
	private LocalDate dob;
	private LocalDateTime visitorDateTime;
	private char gender;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public LocalDateTime getVisitorDateTime() {
		return visitorDateTime;
	}
	public void setVisitorDateTime(LocalDateTime visitorDateTime) {
		this.visitorDateTime = visitorDateTime;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
	

}
