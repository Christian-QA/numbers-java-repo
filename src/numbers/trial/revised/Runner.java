package numbers.trial.revised;

public class Runner {

	public static void main(String args[]) {

		for (int i = 0; i < 201; i++) {

			int numberToCheck = i;
			Numbers number = new Numbers();
			System.out.println(number.input(numberToCheck));
		}
	}

}
