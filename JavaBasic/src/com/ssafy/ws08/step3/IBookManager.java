package com.ssafy.ws08.step3;

public interface IBookManager {
	
	public abstract void add(Book book);

	void remove(String isbn); //ÀÚµ¿À¸·Î public abstractÀÓ
	
	int getSize();
	
	Book[] getList() ;

	Book searchByIsbn(String isbn);

	Book[] searchByTitle(String title) ;

	Magazine[] getMagazines() ;
	
	Book[] getBooks() ;

	int getTotalPrice() ;

	double getPriceAvg();
	
	void sell(String isbn, int quantity) throws ISBNNotFoundException, QuantityException;
	void buy(String isbn, int quantity) throws ISBNNotFoundException;
	void saveData();
}
