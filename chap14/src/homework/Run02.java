package homework;

public class Run02 {
	public static void main(String[] args) {
		String path1 = "C:/test/sub/나비야1.dat";
		String path2 = "C:/test/sub/나비야2.dat";
		Practice02 p = new Practice02();
		
		System.out.println("method1 실행 소요 시간 : " + p.method1(path1) + "ns");
		System.out.println();
		System.out.println("method2 실행 소요 시간 : " + p.method2(path2) + "ns");
	}
}
