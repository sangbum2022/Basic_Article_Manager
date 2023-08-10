import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("==프로그램 시작==");
		
		//스캐너 입력 받기위함
		Scanner sc = new Scanner(System.in);
		
		//입력받음 입력값을 cmd 변수에 담음
		String cmd = sc.nextLine();
		
		//숫자타입
		//int cmd = sc.nextInt();
		
		System.out.println("입력된 명령어 : " + cmd);
		
		System.out.println("==프로그램 종료==");
		
		//스캐너 종료
		sc.close();
	}
}
