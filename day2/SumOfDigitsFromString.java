package week1.day2;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// Method 1:

		String text = "Tes12Le79af65";
		int sum = 0;
		String replaceAll = text.replaceAll("\\D", "");
		char[] CharArray = replaceAll.toCharArray();

		for (int i = 0; i < CharArray.length; i++) {
			int value = Character.getNumericValue(CharArray[i]);
			sum = sum + value;

		}

		System.out.println("Method 1 : " +sum);

// Method 2:

		String test = "Tes12Le79af65";
		int sumvalue = 0;

		char[] temp = test.toCharArray();

		for (int i = 0; i < temp.length; i++) {

			if (Character.isDigit(temp[i])) {

				int value = Character.getNumericValue(temp[i]);

				sumvalue = sumvalue + value;

			}
		}

		System.out.println("Method 2 : " +sumvalue);

	}

}
