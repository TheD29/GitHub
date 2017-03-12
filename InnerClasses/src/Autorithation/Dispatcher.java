package Autorithation;

public class Dispatcher {

	public static void main(String[] args) {
		user user = new user();
		user.qwerty qwerty = user.createQuerty();
		user[] users = qwerty.getUsers();
		for (user us : users) {
			// System.out.println(us.firstName + ' ' + us.lastName);
		}

		user singleUser = qwerty.getSingleUserById(1);

		if (singleUser != null) {
			System.out.println(singleUser.getFirstName() + ' ' + singleUser.getLastName());
		}

	}

}
