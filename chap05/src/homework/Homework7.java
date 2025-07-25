package homework;

import java.util.Arrays;

public class Homework7 {

	public static void main(String[] args) {
		 String[] report = {"Introduction", "Research", "Conclusion"};
		 String[] arr =  Arrays.copyOf(report, report.length);
		 arr[0] = "Team Feedback";
		 
		 System.out.print("원본 보고서 : ");
		 for (int i = 0; i < report.length; i++) {
	        	if (i > 0) System.out.print(", ");
	            System.out.print(report[i]);
	        }
		 
		 System.out.println();
		 
		 System.out.print("복사된 보고서 : ");
		 for (int i = 0; i < arr.length; i++) {
	        	if (i > 0) System.out.print(", ");
	            System.out.print(arr[i]);
	        }
	}

	/* 직접 복사하는 방법
	// 배열 복사 (deep copy)
	String[] copiedReport = new String[report.length];
	for (int i = 0; i < report.length; i++) {
	    copiedReport[i] = report[i];
	}

	// 복사된 배열의 첫 번째 항목 수정
	copiedReport[0] = "Team Feedback";
	*/
}
