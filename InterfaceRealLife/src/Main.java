
public class Main {

	public static void main(String[] args) {

		SignUpManager signUpManager = new SignUpManager(new AgeUserCheckService());
		signUpManager.signUp(new User(1, "Mustafa", 17));
		signUpManager.signUp(new User(1, "Selim", 19));
		System.out.println("***********************************");
		SignUpManager signUpManager2 = new SignUpManager(new ComplexUserCheckService());
		signUpManager2.signUp(new User(1, "Mustafa", 21));
		signUpManager2.signUp(new User(1, "Selim", 19));

	}

}
