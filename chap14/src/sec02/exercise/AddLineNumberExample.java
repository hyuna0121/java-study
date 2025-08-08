package sec02.exercise;

import java.io.BufferedReader;
import java.io.FileReader;

public class AddLineNumberExample {
	public static void main(String[] args) throws Exception {
		String filePath = "src/sec02/exercise/AddLineNumberExample.java";
		FileReader fileReader = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fileReader);
		
		String data;
		int count = 0;
		
		while ((data = br.readLine()) != null) {
			System.out.println(++count + ": " + data);
		}
		
		br.close();
	}
}
