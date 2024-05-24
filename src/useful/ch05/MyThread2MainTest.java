package useful.ch05;

public class MyThread2MainTest {
	
	// 메인 작업자
	public static void main(String[] args) {
		
		System.out.println("main test");
		
		// 문제 MyThread2 를 메모리에 올리고
		// 그 안에 정의된 run() 메서드를 호출하시오
		// 힌트 --> Thread 문서를 반드시 확인 하시오
		
		
		// 새로운 작업자를 생성해서 위임 시킬때는
		// Thread 안에 있는 start() 메서드를 호출해야 된다
		MyThread2 myThread = new MyThread2();
//		myThread.run();  --> 일반 메서드 호출임!
//		myThread.start();
		
		// 새로운 작업자를 생성해서 위임 시킬때는 Thread 안에 있는 start() 메서드를 호출해야 한다
		Thread thread = new Thread(myThread);
		thread.start();
		
		System.out.println("--- end main thread ---");
		
	}

}
