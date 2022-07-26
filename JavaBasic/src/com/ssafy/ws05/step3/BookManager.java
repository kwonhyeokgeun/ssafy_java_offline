package com.ssafy.ws05.step3;

import java.util.Arrays;

/**
 * ��������Ʈ�� �迭�� �����ϸ� �����ϴ� Ŭ����
 */
public class BookManager {

	private static int MAX_SIZE = 100;

	private Book[] books = new Book[MAX_SIZE];

	private int size;
		
	/**
	 * ������ ��������Ʈ�� �߰��Ѵ�.
	 * @param book : �߰��� ����
	 */
	public void add(Book book) {
		if(size<MAX_SIZE) books[size++] = book;
	}
	
	/**
	 * ������ȣ�� �ش� ������ ��������Ʈ���� �����Ѵ�.
	 * @param isbn : ������ ������ ������ȣ
	 */
	public void remove(String isbn) {
		for (int i = 0; i < size; ++i) {
			// ������ ������ ã�Ҵٸ� �ش� ���� ��ġ�� �迭�� ���� ������ ������ ����
			if (books[i].getIsbn().equals(isbn)) {
				books[i] = books[size-1];
				books[size-1]=null;			// ������ ���� ��ġ null ó��
				--size;						// ��ϵ� ���� �� ����
				break;
			}
		}
	}
	
	/**
	 * ��ϵ� ��������Ʈ�� ��ȯ�Ѵ�.
	 * @return ��ϵ� ��ü ��������Ʈ
	 */
	public Book[] getList() {
		return Arrays.copyOfRange(books, 0, size);
	}
	
	/**
	 * ������ȣ�� �ش� ������ ��ȸ�Ѵ�.
	 * @param isbn : ��ȸ�� ������ ������ȣ
	 * @return ������ȣ�� �ش��ϴ� ����
	 */
	public Book searchByIsbn(String isbn) {
		for (int i = 0; i < size; ++i) {
			if (books[i].getIsbn().equals(isbn)) return books[i]; 
		}
		return null;
	}
	
	/**
	 * ���� ������ �����ϰ� �ִ� ��������Ʈ�� ��ȯ�Ѵ�.
	 * @param title : ��ȸ�� ������ ����
	 * @return
	 */
	public Book[] searchByTitle(String title) {
		int count = 0; 
		for (int i = 0; i < size; ++i) {	// ���� ������ �����ϴ� ������ ���� ī��Ʈ
			if (books[i].getTitle().contains(title)) ++count;
		}
		Book[] result = new Book[count];	// ��� ī��Ʈ��ŭ �迭 ����
		int idx = 0;
		for (int i = 0; i < size; ++i) {
			if (books[i].getTitle().contains(title)) { // ���� ������ �����ϴ� ������ �迭�� ���
				result[idx++] = books[i];
			}
		}
		return result; 
	}
	
	/**
	 * ��������Ʈ�� ��ȯ�Ѵ�.
	 * @return ��������Ʈ
	 */
	public Magazine[] getMagazines() {
		int count = 0;
		for (int i = 0; i < size; ++i) {	// ���� ���� ī��Ʈ
			if (books[i] instanceof Magazine) ++count;
		}
		Magazine[] result = new Magazine[count];	// ��� ī��Ʈ��ŭ �迭 ����
		int idx = 0;
		for (int i = 0; i < size; ++i) {
			if (books[i] instanceof Magazine) {	// ������ �迭�� ���
				result[idx++] = (Magazine)books[i];
			}
		}
		return result;
	} 
	
	/**
	 * ������ �ƴ� ��������Ʈ�� ��ȯ�Ѵ�. 
	 * @return ������ �ƴ� ��������Ʈ
	 */
	public Book[] getBooks() {
		int count = 0; 
		for (int i = 0; i < size; ++i) {
			if (!(books[i] instanceof Magazine)) ++count;
		}
		
		Book[] result = new Book[count];
		int idx = 0;
		for (int i = 0; i < size; ++i) {
			if (!(books[i] instanceof Magazine)) {
				result[idx++] = books[i];
			}
		}
		return result;
	}
	
	/**
	 * ��������Ʈ�� ������ ������ ��ȯ�Ѵ�.
	 * @return ��� ���� ������ ����
	 */
	public int getTotalPrice() {
		int total = 0;
		for (int i = 0; i < size; ++i) {
			total += books[i].getPrice();
		}
		return total;
	}
	
	/**
	 * ���������� ����� ��ȯ�Ѵ�.
	 * @return ��� ���� ������ ���
	 */
	public double getPriceAvg() {
		return (double)getTotalPrice()/ size;
	}
}