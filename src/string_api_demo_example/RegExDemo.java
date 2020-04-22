package string_api_demo_example;

public class RegExDemo {

	public static void main(String[] args) {
		/*
		 * Regular Expression follows a pattern matching algorithm [] - expression {} -
		 * length [a-z]{5} - any word of lowercase of length 5 [A-Za-z]{3,6} - any word
		 * of min length 3 and max length 6 [0-9]{2,} - minimum 2 digits and max no
		 * limit ^ -not [^a-zA-z] - apart from alphabets () * ? +
		 */
		String s = "AWSDE7881A";
		if (s.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}")) {
			System.out.println("Valid PAN");
		} else {
			System.out.println("Invalid PAN");
		}
		String s1="Hel198989   ))@! J i A Ak9";
		System.out.println(s1.replaceAll("[^A-Za-z]", "").length());
		System.out.println(s1.replaceAll("[a-zA-Z0-9]", ""));
		
	}

}
