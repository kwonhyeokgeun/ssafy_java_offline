package com.ssafy.ws08.step3;

public class BookTest {

	public static void main(String[] args) throws Exception{
		
		// 도서 리스트를 유지하고 관리하는 BookManager 객체를 생성한다.
		IBookManager bookManager = BookManagerImpl.getBookManagerImpl();
		// BookManager 객체를 이용해  도서, 잡지 정보를 추가한다.
		bookManager.add(new Book("21424", "Java Pro", "김하나", "jaen.kr", 15000, "Java 기본 문법",10));
		bookManager.add(new Book("21425", "Java Pro2", "김하나", "jaen.kr", 25000, "Java 응용",20));
		bookManager.add(new Book("35355", "분석설계", "소나무", "jaen.kr", 30000, "SW 모델링",30));
		bookManager.add(new Magazine("45678", "월간 알고리즘", "홍길동", "jaen.kr", 10000, "1월 알고리즘", 2021, 1,40));
		
		if(bookManager.getSize()==0) {
			System.out.println("등록된 도서가 없습니다.");
		}else {
			System.out.println("둥록된 도서 목록");
			for(Book book : bookManager.getList()) {
				System.out.println(book);
			}
		}
		/*
		System.out.println("**********************도서 전체 목록**********************");
		for (Book b : bookManager.getList()) {
			System.out.println(b);
		}
		System.out.println("**********************일반 도서 목록**********************");
		for (Book b : bookManager.getBooks()) {
			System.out.println(b);
		}
		System.out.println("**********************잡지 목록**********************");
		for (Magazine b : bookManager.getMagazines()) {
			System.out.println(b);
		}
		System.out.println("**********************도서 제목 포함검색:Java**********************");
		for (Book b : bookManager.searchByTitle("Java")) {
			System.out.println(b);
		}
		System.out.println("도서 가격 총합 : "+bookManager.getTotalPrice());
		System.out.println("도서 가격 평균: "+bookManager.getPriceAvg());	
		
		System.out.println("**********************도서 구매**********************");
		try {
			bookManager.buy("1111", 20);	
		}catch(ISBNNotFoundException e){
			System.out.println(e.getMessage());
		}
		
		try {
			bookManager.sell("21424", 20);	
		}catch( QuantityException | ISBNNotFoundException  e){
			System.out.println(e.getMessage());
		}
		*/
		
		bookManager.saveData();
		
	}
}
