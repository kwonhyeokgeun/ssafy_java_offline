package com.ssafy.ws07.step3;

public class ISBNNotFoundException extends Exception{
	private static final long serialVersionUID = 1L;
	
	private String isbn;
	
	public ISBNNotFoundException(String isbn) {
		super(isbn +" 도서가 존재하지 않습니다.");
		this.isbn = isbn;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public String getIsbn() {
		return isbn;
	}

}
