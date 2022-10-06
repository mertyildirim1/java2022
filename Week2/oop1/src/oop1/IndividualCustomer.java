package oop1;

public class IndividualCustomer extends Customer { // idnividual --> bireysel

	private String firstname;
	private String lastName;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
