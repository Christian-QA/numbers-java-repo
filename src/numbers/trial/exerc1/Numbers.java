package numbers.trial.exerc1;

	public class Numbers {
		
		public String numToWordConverter(int number) {
			
			String wordForm = "";
			
			if (number == 1) {
				wordForm = "one";
			} else if (number == 2) {
				wordForm = "two";
			} else if (number == 3) {
				wordForm = "three";
			} else if (number == 4) {
				wordForm = "four";
			} else if (number == 5) {
				wordForm = "five";
			} else if (number == 6) {
				wordForm = "six";
			} else if (number == 7) {
				wordForm = "seven";
			} else if (number == 8) {
				wordForm = "eight";
			} else if (number == 9) {
				wordForm = "nine";
			} else if (number == 10) {
				wordForm = "ten";
			} else if (number == 11) {
				wordForm = "eleven";
			} else if (number == 12) {
				wordForm = "twelve";
			} else if (number == 13) {
				wordForm = "thirteen";
			} else if (number == 14) {
				wordForm = "fourteen";
			} else if (number == 15) {
				wordForm = "fifteen";
			} else if (number == 16) {
				wordForm = "sixteen";
			} else if (number == 17) {
				wordForm = "seventeen";
			} else if (number == 18) {
				wordForm = "eighteen";
			} else if (number == 19) {
				wordForm = "ninteen";
			} else if (number >= 20 && number < 30) {
				wordForm = "twenty";
			} else if (number >= 30 && number < 40) {
				wordForm = "thirty";
			} else if (number >= 40 && number < 50) {
				wordForm = "forty";
			} else if (number >= 50 && number < 60) {
				wordForm = "fifty";
			} else if (number >= 60 && number < 70) {
				wordForm = "sixty";
			} else if (number >= 70 && number < 80) {
				wordForm = "seventy";
			} else if (number >= 80 && number < 90) {
				wordForm = "eighty";
			} else if (number >= 90 && number < 100) {
				wordForm = "ninety";
			} 			
			return wordForm;
			
		}
		
		public String input(int number) {
						
			String answer = "";	
					
				if (number < 10) {
					
					int digit1 = number % 10;  /// Finds last digit from modulus
					answer = number + " is made up of one digits: " + digit1;
					
					Numbers wordForm = new Numbers();
					String digit1Word = wordForm.numToWordConverter(number); 
					System.out.println(digit1Word);
					
				} else if (number < 100) {
					
					int digit1 = number % 10;  /// Finds last digit from modulus
					int digit2 = (number/10) % 10;	/// Finds second last digit by taking away 
					answer = number + " is made up of two digits: " + digit2 + " and " + digit1;	
					
					if (digit2 >= 1 && digit2 < 2) {
						Numbers wordForm = new Numbers();
						String digit1Word = wordForm.numToWordConverter(number); 
						System.out.println(digit1Word); 
					} else {					
						Numbers wordForm = new Numbers();
						String digit1Word = wordForm.numToWordConverter(digit1); 
						String digit2Word = wordForm.numToWordConverter(digit2*10); 
						System.out.println(digit2Word + "-" + digit1Word);
					}
					
				} 
					
			return (answer);
			
		}
			
	}