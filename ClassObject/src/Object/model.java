package Object;

public class model {
	private String lastName;
	private String firstName;

	public model(String lastName, String firstName) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	@Override // Означає що клас є перевизначений
	public String toString() {
		// TODO Auto-generated method stub
		return "LNaem: " + lastName + " FNAME: " + firstName;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		model model = (model) obj;
		if (lastName.equals(model.getLastName()) && firstName.equals(getFirstName()))
			return true;
		return false;
	}

}
