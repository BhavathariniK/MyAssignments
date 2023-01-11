package week1.day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "We learn java basics as part of java sessions in java week 1";
		String[] splitvalue = text.split(" ");
		for (int i = 0; i < splitvalue.length; i++) {
			for (int j = i + 1; j < splitvalue.length; j++) {
				if (splitvalue[i].equals(splitvalue[j])) {
					splitvalue[j] = " ";
				}
			}
		}
		for (int k = 0; k < splitvalue.length; k++) {
			if (splitvalue[k] != " ") {
				System.out.print(splitvalue[k] + " ");
			}
		}
	}

}
