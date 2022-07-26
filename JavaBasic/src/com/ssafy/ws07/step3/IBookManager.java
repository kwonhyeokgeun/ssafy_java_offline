package com.ssafy.ws07.step3;

public interface IBookManager {
	
	public abstract void add(Book book);

	void remove(String isbn); //�ڵ����� public abstract��
	
	Book[] getList() ;

	Book searchByIsbn(String isbn);

	Book[] searchByTitle(String title) ;

	Magazine[] getMagazines() ;
	
	Book[] getBooks() ;

	int getTotalPrice() ;

	double getPriceAvg();
}
