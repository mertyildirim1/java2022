package kodlamaIoDemo_Homework3.entities;

import kodlamaIoDemo_Homework3.dataAccess.Entity;

public class Course implements Entity {

	public Course(int id, String courseName, double price) {
		this.id = id;
		this.courseName = courseName;
		this.price = price;
	}

	private int id;
	private String courseName;
	private double price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
