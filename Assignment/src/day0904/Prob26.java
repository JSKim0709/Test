package day0904;

import java.util.Vector;

public class Prob26 {

	private static Book makeBook(String bookData) {
		String[] list = bookData.split(" : ");
		if (list.length != 3) {
			throw new DataFormatException(list[0] + "å ������ ��ȯ�� �� ���� ������ �����Դϴ�.");
		}

		Book book = new Book();
		book.setTitle(list[0]);
		book.setKind(list[1]);
		book.setRentalPrice(Integer.parseInt(list[2]));

		return book;
	}

	private static void printBookList(Vector bookList) {
		for (Object obj : bookList) {
			System.out.println(obj);
		}
	}

	public static void main(String[] args) {
		Vector bookList = new Vector<>();

		try {
			bookList.add(makeBook("Java Programming ���� : ��ǻ�� : 35000"));
			bookList.add(makeBook("�ʺ��ڸ� ���� SQL : ��ǻ�� : 28000"));
			bookList.add(makeBook("HTML5 API : ��ǻ�� : 58000"));
			bookList.add(makeBook("JDBC Programming ���� : ��ǻ�� : 45000"));
			// bookList.add(makeBook("JDBC Programming ���� : ��ǻ��"));
			bookList.add(makeBook("JSP Programming ��� : ��ǻ�� : 56000"));
			System.out.println("<< å ��� >>");
			printBookList(bookList);
		} catch (DataFormatException e) {
			System.out.println(e.getMessage());
		}

	}

}
