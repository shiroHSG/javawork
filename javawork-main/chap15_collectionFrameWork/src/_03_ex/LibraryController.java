package _03_ex;

import java.util.ArrayList;

public class LibraryController {
	Member member = new Member();
	ArrayList<Book> aList = new ArrayList<>();
	
	public LibraryController(Member member) {
		this.member = member;
	}
	
	void info() {
		System.out.println(member.toString());
	}
	
	void inserBook() {
		aList.add(new Book("title1", "autor1", "publisher1"));
		aList.add(new Book("title2", "autor2", "publisher2"));
		aList.add(new Book("title3", "autor3", "publisher3"));
	}
	
	public ArrayList<Book> selectAll() {
		return aList;
	}
	
	public Book searchBook(String bookTitle) {
		Book book = null;
		for(int i=0; i<aList.size(); i++) {
			if(bookTitle.equals(aList.get(i).getTitle()))
				book = aList.get(i);
		}
		return book;
	}
}