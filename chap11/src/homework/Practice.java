package homework;

public class Practice {
	public static String takeState(String str) {
		String[] address = str.split(" ");
		for (String temp : address) {
			char condition = temp.charAt(temp.length() - 1); 
			if (condition == '구') {
				System.out.println(temp);
				return temp;
			}
		}
		System.out.println("null");
		return null;
	}
}
