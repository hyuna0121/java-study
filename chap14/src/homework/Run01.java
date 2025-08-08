package homework;

public class Run01 {
	public static void main(String[] args) {
		String song = "나비야, 나비야 이리 날아오너라"
				+ "\n노랑나비, 흰 나비 춤을 추며 오너라"
				+"\n봄바람에 꽃잎도 방긋방긋 웃으며"
				+ "\n참새도 짹짹짹 노래하며 춤춘다";
		Practice01 p = new Practice01();
		
		long start = System.nanoTime();
		p.method1(song);
		long end = System.nanoTime();
		System.out.println("method1 실행 소요 시간 : " + (end - start) + "ns");
		
		start = System.nanoTime();
		p.method2(song);
		end = System.nanoTime();
		System.out.println("method2 실행 소요 시간 : " + (end - start) + "ns");
	}
}
