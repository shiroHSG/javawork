package _03_ex;

import java.util.ArrayList;
import java.util.Scanner;

public class BookRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		LibraryController lc = new LibraryController(new Member("name", 20, "gender"));
		
		//책 넣기
		lc.inserBook();
		
		//책 목록 출력
		ArrayList<Book> bookList = lc.selectAll();
		for(int i=0; i<bookList.size(); i++) {
			System.out.println(bookList.get(i));
			
		}
		//책 검색
		System.out.print("검색할 책 이름 : ");
		String bookName = input.next();
		Book book = lc.searchBook(bookName);
		System.out.println(book);
		
		input.close();
	}
}
