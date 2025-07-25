package homework;

import java.util.Arrays;

public class Homework4 {

	public static void main(String[] args) {
		// 공식화: (int) (Math.random() * (최대값 - 최소값 + 1)) + 최소값;
		int[] lotto = new int[6];
		int num;
		int dup = 0;
		
		for (int i = 0; i < lotto.length; ) {
			num = (int) (Math.random() * 45) + 1;
			dup = 0;
			
			//중복체크
			if (i == 0) lotto[i] = num;			
			else {	
				for (int var : lotto) {
					if (var == num) {
						dup = 1;
						break; // 중복되는 값을 찾은 즉시 빠져나감
					}
				}
			}
			
			// 중복이 아니면 배열에 저장
			if (dup != 1) {
				lotto[i] = num;
				i++;
			} else continue;
		}
		
//		int count = 0;
//		while (count < 6) {
//			num = (int) (Math.random() * 45) + 1;
//			
//			// 중복 체크
//			boolean dupli = false;
//			for (int i = 0; i < count; i++) { // 실제 로또 번호가 들어간 count까지만 체크
//				if (lotto[i] == num) {
//					dupli = true;
//					break; // 중복되는 값을 찾은 즉시 빠져나감
//				}
//			}
//			
//			// 중복이 아니면 배열에 저장
//			if (!dupli) {
//				lotto[count] = num;
//				count++;
//			}
//		}
		
		// 오름차순 정렬
		Arrays.sort(lotto);
		for (int var : lotto) {
			System.out.print(var + " ");
		}
	}

}
