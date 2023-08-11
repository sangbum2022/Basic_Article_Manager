import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("==프로그램 시작==");
		
		//스캐너 입력 받기위함
		Scanner sc = new Scanner(System.in);
		
		int lastArticleId = 0;

		while(true) {
			
			System.out.printf("명령어)");
			//입력받음 입력값을 cmd 변수에 담음
			String cmd = sc.nextLine();
			
			if(cmd.length() == 0) {
				System.out.println("명령어를 입력해주세요");
				continue;
			}
			
			if(cmd.equals("exit")) {
				break;
			}else if(cmd.equals("article write")) {
				
				System.out.println("제목:");
				String title = sc.nextLine();
				System.out.println("내용:");
				String body = sc.nextLine();
				
				lastArticleId++;
				
				System.out.printf("%d번 글이 생성되었습니다\n", lastArticleId);
				
			}else if(cmd.equals("article list")) {
				System.out.println("게시글이 없습니다.");
			}else {
				System.out.println("존재하지 않는 명령어 입니다.");
			}
		}
		
		
		//숫자타입
		//int cmd = sc.nextInt();
		
		System.out.println("==프로그램 종료==");
		
		//스캐너 종료
		sc.close();
	}
}
