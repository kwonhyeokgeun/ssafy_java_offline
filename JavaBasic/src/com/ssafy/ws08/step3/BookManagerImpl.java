package com.ssafy.ws08.step3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
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
	public int getSize() {
		return books.size();
	}
	
	private void loadData() {
	    // book.dat
	    File f = new File("book.dat");
	    // 파일이 존재하면 => 객체직렬화를 이용해서 파일 -> ArrayList<Book>
	    if( f.exists() ) {
	        try(
	            ObjectInputStream ois = new ObjectInputStream( new FileInputStream(f))
	        ){
	            this.books = (ArrayList<Book>) ois.readObject();
	            System.out.println("파일로부터 자료를 입력받았습니다.");
	        }catch(Exception e) {
	            e.printStackTrace();
	        }
	    }else {// 파일이 존재하지 않으면 ArrayList<Book> 을 새로 만든다.
	        this.books = new ArrayList<Book>();
	    }
	    
	}
	
	@Override
	public void saveData() {
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("book.dat"))){
			oos.writeObject(this.books);
			System.out.println("파일로에 자료를 저장했습니다.");
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void add(Book book) {
		if(books.size()<MAX_SIZE) books.add(book); 
	}
	
	/**
	 * 고유번호로 해당 도서를 도서리스트에서 삭제한다.
	 * @param isbn : 삭제할 도서의 고유번호
	 */
	@Override
	public void remove(String isbn) {
		for (int i =0; i< books.size(); ++i) {
			// 삭제할 도서를 찾았다면 해당 도서 위치에 배열의 제일 마지막 도서를 복사
			if (books.get(i).getIsbn().equals(isbn)) {
				books.remove(i);	
				break;
			}
		}
	}
	
	/**
	 * 등록된 도서리스트를 반환한다.
	 * @return 등록된 전체 도서리스트
	 */
	@Override
	public Book[] getList() {
		Book[] result = new Book[books.size()];
		books.toArray(result);
		return result;
	}
	
	/**
	 * 고유번호로 해당 도서를 조회한다.
	 * @param isbn : 조회할 도서의 고유번호
	 * @return 고유번호에 해당하는 도서
	 */
	@Override
	public Book searchByIsbn(String isbn) {
		
		for (int i = 0; i < books.size(); ++i) {
			if (books.get(i).getIsbn().equals(isbn)) return books.get(i); 
		}
		return null;
	}
	
	/**
	 * 도서 제목을 포함하고 있는 도서리스트를 반환한다.
	 * @param title : 조회할 도서의 제목
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
	 * 잡지리스트를 반환한다.
	 * @return 잡지리스트
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
	 * 잡지가 아닌 도서리스트를 반환한다. 
	 * @return 잡지가 아닌 도서리스트
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
	 * 도서리스트의 가격의 총합을 반환한다.
	 * @return 모든 도서 가격의 총합
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
	 * 도서가격의 평균을 반환한다.
	 * @return 모든 도서 가격의 평균
	 */
	@Override
	public double getPriceAvg() {
		return (double)getTotalPrice()/ books.size();
	}

	@Override
	public void sell(String isbn, int quantity) throws ISBNNotFoundException, QuantityException{
		Book book = searchByIsbn(isbn);
		if (book == null) throw new ISBNNotFoundException(isbn); //없는책
		
		int res = book.getQuantity() - quantity;  //양이 부족
		if (res<0) throw new QuantityException();
		
		book.setQuantity(res);
	}

	@Override
	public void buy(String isbn, int quantity) throws ISBNNotFoundException{
		Book book = searchByIsbn(isbn);
		if (book == null) throw new ISBNNotFoundException(isbn); //없는책
		
		book.setQuantity(book.getQuantity()+quantity);
	}

	
}
