package com.ssafy.ws07.step3;

public interface IBookManager {
	
	public abstract void add(Book book);

	void remove(String isbn); //자동으로 public abstract임
	
	Book[] getList() ;

	Book searchByIsbn(String isbn);

	Book[] searchByTitle(String title) ;

	Magazine[] getMagazines() ;
	
	Book[] getBooks() ;

	int getTotalPrice() ;

	double getPriceAvg();
}
