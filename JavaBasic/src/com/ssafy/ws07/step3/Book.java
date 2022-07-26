package com.ssafy.ws07.step3;

/**
 * 도서 정보를 나타내는 클래스
 */
public class Book {
	/** 고유 번호 */
	private String isbn;		
	/**	제목 */
	private String title;		
	/** 저자 */
	private String author;		
	/** 출판사 */
	private String publisher;	
	/** 가격 */
	private int price;			
	/**	설명 */
	private String desc;	
	private int quantity;

	/** 기본 생성자 */
	public Book() {
	}
	/** 도서 정보를 모두 받아 생성하는 생성자 */
	public Book(String isbn, String title, String author, String publisher, 
			int price, String desc, int quantity){
		// 받은 정보로 객체의 상태를 초기화한다.
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.desc = desc;
		this.quantity=quantity;
	}

	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", author=" + author + ", publisher=" + publisher
				+ ", price=" + price + ", desc=" + desc + ", quantity=" + quantity + "]";
	}


}