package homework01;

public class Homework02 {
	public static void main(String[] args) {
		String[] array = {"서울특별시 금천구 구로디지털2로 95", "서울특별시 서대문구 연희로 248", "울산광역시 남구 돋질로 233", "경상북도 구미시 송정대로 55"};
		
		for (String address : array) {
			Practice.takeState(address);
		}
	}
}
