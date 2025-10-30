package week2.homework;

public class Uppercase {

	public static void main(String[] args) {
		String test = "changeme";
        //01234567
        char[] charArray = test.toCharArray();
        
        for (int j = 0; j < charArray.length; j++) {
            if (j % 2 != 0) {
                charArray[j] = Character.toUpperCase(charArray[j]);
            }
        }
       
        String result = new String(charArray);
        System.out.println(result);

	}

}
