package Autorithation;

public class user {

	private String firstName;
	private String lastName;
	private long id;

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public long getId() {
		return id;
	}

	private user(long id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public user() {
	}

	public class qwerty {
		private user[] users;

		private qwerty() {
			users = new user[3];
			users[0] = new user(1, "Dima", "Berezovskyi");
			users[1] = new user(2, "Dima1", "Berezovskyi2");
			users[2] = new user(3, "lName", "fName");
		}

		public user[] getUsers() {
			return users;
		}

		public user getSingleUserById(long id) {
			if (users != null && users.length > 0) {
				for (user user : users) {
					if (user.getId() == id) {
						return user;

					}
					return null;
				}

			} else {
				return null;
			}
			return null;
		}
	}

	public qwerty createQuerty() {
		return new qwerty();
	}
}