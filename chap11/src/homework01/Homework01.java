package homework01;

public class Homework01 {
	public static void main(String[] args) {
		String str ="김철수,25,동작구,남\n홍길동,27,관악구,남\n이영희,29,강서구,여";	
		String[] people = str.split("\n");
		
		for (String person : people) {
			String[] info = str.split(",");
			Person obj = new Person(info[0], Integer.parseInt(info[1]), info[2],info[3].charAt(0));
			
			System.out.println(obj.toString());
		}
	}
}
