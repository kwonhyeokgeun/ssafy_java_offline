package com.ssafy.ws05.step3;

/**
 * BookManager Ŭ������ �̿��Ͽ� ���� ��ü �߰�,����,��ȸ�ϴ� Ŭ����
 */
public class BookTest {

	public static void main(String[] args) {
		
		// ���� ����Ʈ�� �����ϰ� �����ϴ� BookManager ��ü�� �����Ѵ�.
		IBookManager bookManager = BookManagerImpl.getBookManagerImpl();
		// BookManager ��ü�� �̿���  ����, ���� ������ �߰��Ѵ�.
		bookManager.add(new Book("21424", "Java Pro", "���ϳ�", "jaen.kr", 15000, "Java �⺻ ����"));
		bookManager.add(new Book("21425", "Java Pro2", "���ϳ�", "jaen.kr", 25000, "Java ����"));
		bookManager.add(new Book("35355", "�м�����", "�ҳ���", "jaen.kr", 30000, "SW �𵨸�"));
		bookManager.add(new Magazine("45678", "���� �˰���", "ȫ�浿", "jaen.kr", 10000, "1�� �˰���", 2021, 1));

		System.out.println("**********************���� ��ü ���**********************");
		for (Book b : bookManager.getList()) {
			System.out.println(b);
		}
		System.out.println("**********************�Ϲ� ���� ���**********************");
		for (Book b : bookManager.getBooks()) {
			System.out.println(b);
		}
		System.out.println("**********************���� ���**********************");
		for (Magazine b : bookManager.getMagazines()) {
			System.out.println(b);
		}
		System.out.println("**********************���� ���� ���԰˻�:Java**********************");
		for (Book b : bookManager.searchByTitle("Java")) {
			System.out.println(b);
		}
		System.out.println("���� ���� ���� : "+bookManager.getTotalPrice());
		System.out.println("���� ���� ���: "+bookManager.getPriceAvg());	
	}
}