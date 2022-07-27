package com.ssafy.ws07.step3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookManagerImpl implements IBookManager {
	private static int MAX_SIZE = 100;
	//private Book[] books = new Book[MAX_SIZE];
	//private int size;
	private List<Book> books = new ArrayList<>();
	
	
	
	private static IBookManager bm= new BookManagerImpl();
	
	private BookManagerImpl() {}
	
	public static IBookManager getBookManagerImpl() {
		return bm;
	}
	
	@Override
	public void add(Book book) {
		if(books.size()<MAX_SIZE) books.add(book); 
	}
	
	/**
	 * ������ȣ�� �ش� ������ ��������Ʈ���� �����Ѵ�.
	 * @param isbn : ������ ������ ������ȣ
	 */
	@Override
	public void remove(String isbn) {
		for (int i =0; i< books.size(); ++i) {
			// ������ ������ ã�Ҵٸ� �ش� ���� ��ġ�� �迭�� ���� ������ ������ ����
			if (books.get(i).getIsbn().equals(isbn)) {
				books.remove(i);	
				break;
			}
		}
	}
	
	/**
	 * ��ϵ� ��������Ʈ�� ��ȯ�Ѵ�.
	 * @return ��ϵ� ��ü ��������Ʈ
	 */
	@Override
	public Book[] getList() {
		Book[] result = new Book[books.size()];
		books.toArray(result);
		return result;
	}
	
	/**
	 * ������ȣ�� �ش� ������ ��ȸ�Ѵ�.
	 * @param isbn : ��ȸ�� ������ ������ȣ
	 * @return ������ȣ�� �ش��ϴ� ����
	 */
	@Override
	public Book searchByIsbn(String isbn) {
		
		for (int i = 0; i < books.size(); ++i) {
			if (books.get(i).getIsbn().equals(isbn)) return books.get(i); 
		}
		return null;
	}
	
	/**
	 * ���� ������ �����ϰ� �ִ� ��������Ʈ�� ��ȯ�Ѵ�.
	 * @param title : ��ȸ�� ������ ����
	 * @return
	 */
	@Override
	public Book[] searchByTitle(String title) {
		ArrayList<Book> temp = new ArrayList<>();
		for(Book book : books) {
			if(book.getTitle().contains(title)) temp.add(book);
		}
		Book[] result = new Book[temp.size()];
		return temp.toArray(result);
	}
	
	/**
	 * ��������Ʈ�� ��ȯ�Ѵ�.
	 * @return ��������Ʈ
	 */
	@Override
	public Magazine[] getMagazines() {
		ArrayList<Magazine> temp = new ArrayList<>();
		for(Book book : books) {
			if(book instanceof Magazine) temp.add((Magazine)book);
		}
		Magazine[] result = new Magazine[temp.size()];
		return temp.toArray(result);
	} 
	
	/**
	 * ������ �ƴ� ��������Ʈ�� ��ȯ�Ѵ�. 
	 * @return ������ �ƴ� ��������Ʈ
	 */
	@Override
	public Book[] getBooks() {
		ArrayList<Book> temp = new ArrayList<>();
		for(Book book : books) {
			if(!(book instanceof Magazine)) temp.add(book);
		}
		Book[] result = new Book[temp.size()];
		return temp.toArray(result);
	}
	
	/**
	 * ��������Ʈ�� ������ ������ ��ȯ�Ѵ�.
	 * @return ��� ���� ������ ����
	 */
	@Override
	public int getTotalPrice() {
		int total = 0;
		for(Book book : books) {
			total+=book.getPrice();
		}
		return total;
	}
	
	/**
	 * ���������� ����� ��ȯ�Ѵ�.
	 * @return ��� ���� ������ ���
	 */
	@Override
	public double getPriceAvg() {
		return (double)getTotalPrice()/ books.size();
	}

	@Override
	public void sell(String isbn, int quantity) throws ISBNNotFoundException, QuantityException{
		Book book = searchByIsbn(isbn);
		if (book == null) throw new ISBNNotFoundException(isbn); //����å
		
		int res = book.getQuantity() - quantity;  //���� ����
		if (res<0) throw new QuantityException();
		
		book.setQuantity(res);
	}

	@Override
	public void buy(String isbn, int quantity) throws ISBNNotFoundException{
		Book book = searchByIsbn(isbn);
		if (book == null) throw new ISBNNotFoundException(isbn); //����å
		
		book.setQuantity(book.getQuantity()+quantity);
	}
}
