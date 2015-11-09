package day0904;

import java.util.Vector;

public class Prob26 {

	private static Book makeBook(String bookData) {
		String[] list = bookData.split(" : ");
		if (list.length != 3) {
			throw new DataFormatException(list[0] + "책 정보는 변환할 수 없는 데이터 포맷입니다.");
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
			bookList.add(makeBook("Java Programming 기초 : 컴퓨터 : 35000"));
			bookList.add(makeBook("초보자를 위한 SQL : 컴퓨터 : 28000"));
			bookList.add(makeBook("HTML5 API : 컴퓨터 : 58000"));
			bookList.add(makeBook("JDBC Programming 기초 : 컴퓨터 : 45000"));
			// bookList.add(makeBook("JDBC Programming 기초 : 컴퓨터"));
			bookList.add(makeBook("JSP Programming 고급 : 컴퓨터 : 56000"));
			System.out.println("<< 책 목록 >>");
			printBookList(bookList);
		} catch (DataFormatException e) {
			System.out.println(e.getMessage());
		}

	}

}
