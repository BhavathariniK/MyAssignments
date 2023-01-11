package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test = "I am a software tester";
		String[] splitvalue = test.split(" ");

		for (int i = 0; i < splitvalue.length; i++) {
			 if (i % 2 == 0)
			 {
				 System.out.print(" ");
				 System.out.print(splitvalue[i]);
			}
			 else
			 {
				 char[] CharArray = splitvalue[i].toCharArray();
				 System.out.print(" ");
				 for (int j=CharArray.length-1;j>=0;j--)
				 {
					
					 System.out.print(CharArray[j]);
				 }
				
			 }
		}

	}
}