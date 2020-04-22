package string_api_demo_example;

public class MobileNumberValidation {

	public static void main(String[] args) {
		String s = "+91-1234567890";
		if (s.matches("\\+91-[0-9]{10}")) {
			System.out.println("Valid number");
		} else {
			System.out.println("InValid number");
		}
	}

}
//add escape sequence near special character like +
