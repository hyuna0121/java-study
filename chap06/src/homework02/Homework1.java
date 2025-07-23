package homework02;

public class Homework1 {

	public static void main(String[] args) {
		Calculator myCal = new Calculator();
		String str1 = "A";
		String str2 = "B";
		
		System.out.println(myCal.concat(str1, str2));
				
		System.out.println(myCal.mul(5, 3));
		
		System.out.println(myCal.mul(3, 5));
		
		System.out.println(myCal.equals(str1, str1));
		
		System.out.println(myCal.equals(str1, str2));	
	}

}
