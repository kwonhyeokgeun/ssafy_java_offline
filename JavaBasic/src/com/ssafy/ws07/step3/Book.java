package com.ssafy.ws07.step3;

/**
 * ���� ������ ��Ÿ���� Ŭ����
 */
public class Book {
	/** ���� ��ȣ */
	private String isbn;		
	/**	���� */
	private String title;		
	/** ���� */
	private String author;		
	/** ���ǻ� */
	private String publisher;	
	/** ���� */
	private int price;			
	/**	���� */
	private String desc;	
	private int quantity;

	/** �⺻ ������ */
	public Book() {
	}
	/** ���� ������ ��� �޾� �����ϴ� ������ */
	public Book(String isbn, String title, String author, String publisher, 
			int price, String desc, int quantity){
		// ���� ������ ��ü�� ���¸� �ʱ�ȭ�Ѵ�.
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