package com.koreaIT.java.BAM;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("==프로그램 시작==");
		
		//스캐너 입력 받기위함
		Scanner sc = new Scanner(System.in);
		
		int lastArticleId = 0;
		
		List<Article> articles = new ArrayList<>();

		while(true) {
			
			System.out.printf("명령어)");
			//입력받음 입력값을 cmd 변수에 담음
			String cmd = sc.nextLine().trim();
			
			if(cmd.length() == 0) {
				System.out.println("명령어를 입력해주세요");
				continue;
			}
			
			if(cmd.equals("exit")) {
				break;
			}else if(cmd.equals("article write")) {
				
				int id = lastArticleId +1;
				lastArticleId = id;
				
				System.out.println("제목:");
				String title = sc.nextLine();
				System.out.println("내용:");
				String body = sc.nextLine();
				
				Article article = new Article(id, title, body);
				
				articles.add(article);
				
				System.out.printf("%d번 글이 생성되었습니다\n", id);
				
			}else if(cmd.equals("article list")) {
				
				if(articles.size() == 0) {
					System.out.println("게시글이 없습니다.");
					continue;
				}
				
				System.out.println("번호  |  제목");
				//최신글이 최신순으로 위해 사이즈 기준으로 -- 증감식사용
				for(int i = articles.size() - 1; i >= 0; i--) {
					Article article = articles.get(i);
					System.out.printf("%d  |  %s\n",article.id, article.title);
				}
				
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


//설계도
class Article{
	
	int id;
	String title;
	String body;
	
	Article(int id, String title, String body){
		this.id=id;
		this.title=title;
		this.body=body;
	}
	
}