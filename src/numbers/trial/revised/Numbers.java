package numbers.trial.revised;

public class Numbers {

	public String numToWordConverter(int number) {

		String[] wordForm = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
				"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen",
				"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };

		String resultWord = wordForm[number];
		return resultWord;

	}

	public String input(int number) {

		int[] digit = { (number % 10), ((number / 10) % 10), ((number / 100) % 10), ((number / 1000) % 10) };
		/// Finds last digit from modulus
		/// Finds second last digit by taking away
		/// Finds third last digit by taking away
		/// Finds fourth last digit by taking away

		int digitCount = 1; /// Counts digits from 1

		Numbers wordForm = new Numbers();
		String wordNumberTens = "";
		String wordNumberHundreds = "";
		String wordNumberThousands = "";

		if (digit[1] >= 2) {

			String digit1Word = wordForm.numToWordConverter(digit[0]);
			String digit2Word = wordForm.numToWordConverter(digit[1] + 18);

			if (digit[0] != 0) {
				wordNumberTens = digit2Word + "-" + digit1Word;
			} else {
				wordNumberTens = digit2Word;
			}
			digitCount++;
		} else if (digit[1] < 2) {

			String digit1Word = wordForm.numToWordConverter(digit[0] + (digit[1] * 10));
			wordNumberTens = digit1Word;
			if (digit[1] > 0) {
				digitCount++;
			}
		}

		if (digit[2] > 0) {

			String digit3Word = wordForm.numToWordConverter(digit[2]);

			if (digit[0] > 0) {
				wordNumberHundreds = digit3Word + "-hundred and ";
				digitCount++;
			} else {
				wordNumberThousands = digit3Word + "-hundred";
				digitCount += 2;
			}
		}
		if (digit[3] > 0 && digit[2] == 0) {

			String digit4Word = wordForm.numToWordConverter(digit[3]);

			if (digit[0] > 0) {
				wordNumberThousands = digit4Word + "-thousand and ";
				digitCount += 2;
			} else {
				wordNumberThousands = digit4Word + "-thousand";
				digitCount += 2;
			}
		} else if (digit[3] > 0 && digit[2] > 0) {

			String digit4Word = wordForm.numToWordConverter(digit[3]);
			wordNumberThousands = digit4Word + "-thousand ";
			digitCount++;
		}

		System.out.println(wordNumberThousands + wordNumberHundreds + wordNumberTens);

		String answer = "";

		for (int i = 1; i < digitCount; i++) {
			answer = digit[i] + " and " + answer;

		}

		if (digitCount > 1) {

			return (number + " is made up of " + digitCount + " digits: " + answer + digit[0]);

		} else {

			return (number + " is made up of " + digitCount + " digit: " + digit[0]);

		}
	}

}
