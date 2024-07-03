package org.kh.library.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.kh.library.controller.BookController;
import org.kh.library.model.vo.Book;
import org.kh.library.model.vo.Customer;
import org.kh.library.model.vo.Library;

public class LibraryView implements LibraryViewI{

	public Scanner sc = new Scanner(System.in);
	private BookController bController;
	
	public LibraryView() {
		bController = new BookController();
	};
	
	public void startLibrary() {
		finish :
		while(true) {
			int choice = mainMenu();
			switch(choice) {
			case 1:
				bookMenu();
				//System.out.println("1번");
				break;
			case 2:
				this.customerMenu();
				//System.out.println("2번");
				break;
			case 3:
				this.libraryMenu();
				//System.out.println("3번");
				break;
			case 0 :
				displayMessage("프로그램을 종료합니다.");
				break finish;
			}
		}
	}
	
	@Override
	public void displaySucess(String msg) {
		// TODO Auto-generated method stub
		System.out.println("[서비스 성공] : " + msg);
	}

	@Override
	public void displayMessage(String message) {
		// TODO Auto-generated method stub
		System.out.println("[안내] : " + message);
	}

	@Override
	public void displayError(String message) {
		// TODO Auto-generated method stub
		System.out.println("[서비스 에러] : " + message);
	}

	@Override
	public int mainMenu() {
		// TODO Auto-generated method stub
		System.out.println("메인메뉴");
		System.out.println("1. 책 관리");
		System.out.println("2. 회원 관리");
		System.out.println("3. 대여 관리");
		System.out.println("0. 프로그램 종료");		
		System.out.print("메뉴 선택 : ");
		return sc.nextInt();
	}
	@Override
	public void bookMenu() {
		// TODO Auto-generated method stub
		
		while(true) {
			System.out.println("책관리 서브메뉴");
			System.out.println("1. 전체 책 조회");
			System.out.println("2. 책 코드로 조회");
			System.out.println("3. 책 추가하기");
			System.out.println("4. 책 삭제하기");
			System.out.println("5. 메인 메뉴로 이동");
			System.out.print("메뉴 선택 : ");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				List<Book> bList = bController.selectAllBook();
//				if(bList != null) {
//				if(!bList.isEmpty()) {
				if(bList.size() > 0) {
					this.displayBookList(bList);
				}else {
					this.displayError("존재하지 않는 정보입니다.");
				}
				break;
			case 2:
				int bookNo = this.inputBookNo();
				Book book = bController.selectBookOne(bookNo);
				if(book != null) {
					this.displayBook(book);
				}else {
					this.displayError("존재하지 않는 정보입니다.");
				}
				break;
			case 3:
				// 책 정보 입력받기
				book = this.inputBook();
				// 책 정보 전달 - 컨트롤러
				int result = bController.insertBook(book);
				if(result > 0) {
					this.displaySucess("책 등록 완료!");
				}else {
					this.displayError("책 등록이 완료되지 않았습니다.");
				}
				break;
			case 4:
				bookNo = this.inputBookNo();
				book = bController.selectBookOne(bookNo);
				if(book != null) {
					result = bController.deleteBook(bookNo);
					if(result > 0) {
						this.displaySucess("책 삭제 완료");
					}
				}else {
					this.displayError("존재하지 않는 정보입니다.");
				}
				break;
			case 5:
				return;
			}
		}
		
	}

	@Override
	public void customerMenu() {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("회원관리 서브메뉴");
			System.out.println("1. 전체 회원 조회");
			System.out.println("2. 회원 이름으로 조회");
			System.out.println("3. 회원 아이디로 조회");
			System.out.println("4. 회원 가입");
			System.out.println("5. 회원 정보수정");
			System.out.println("6. 회원 탈퇴");
			System.out.println("7. 메인 메뉴로 이동");
			System.out.print("메뉴 선택 : ");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				return;
			}
		}
	}

	@Override
	public void libraryMenu() {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("대여관리 서브메뉴");
			System.out.println("1. 전체 대여 조회");
			System.out.println("2. 대여 아이디로 조회");
			System.out.println("3. 대여 책이름으로 조회");
			System.out.println("4. 대여정보 추가");
			System.out.println("5. 메인 메뉴로 이동");
			System.out.print("메뉴 선택 : ");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				return;
			}
		}
	}

	@Override
	public void displayLibraryList(ArrayList<Library> list) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayLibraryList(Library library) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String inputUserId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book inputBook() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 책 정보 등록 ======");
		System.out.print("책 이름 : ");
		String bookName = sc.nextLine();
		System.out.print("책 저자 : ");
		String bookWriter = sc.nextLine();
		System.out.print("책 가격 : ");
		int    bookPrice = sc.nextInt();
		sc.nextLine();
		System.out.print("출판사 : ");
		String publisher = sc.nextLine();
		System.out.print("장르 : ");
		String genre     = sc.nextLine();
		Book book = new Book();
		book.setBookName(bookName);
		book.setBookWriter(bookWriter);
		book.setBookPrice(bookPrice);
		book.setPublisher(publisher);
		book.setGenre(genre);
		return book;
	}

	@Override
	public String inputBookName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int inputBookNo() {
		Scanner sc = new Scanner(System.in);
		System.out.print("책 번호 입력 : ");
		int bookNo = sc.nextInt();
		return bookNo;
	}

	@Override
	public Library insertLibrary() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void displayBookList(List<Book> list) {
		// TODO Auto-generated method stub
		System.out.println("====== 전체 책 정보 조회 ======");
		System.out.println("------------------------------------------------------------------------------------------------------------------");
		System.out.printf("| %-4s | %-30s | %-15s | %-10s | %-20s | %-15s |\n", "번호", "제목", "저자", "가격", "출판사", "장르");
		System.out.println("------------------------------------------------------------------------------------------------------------------");
		for(Book book : list) {
		    System.out.printf("| %-4d | %-25s | %-15s | %,10d원 | %-20.20s | %-15.15s |\n",
		            book.getBookNo(),
		            book.getBookName(),
		            book.getBookWriter(),
		            book.getBookPrice(),
		            book.getPublisher(),
		            book.getGenre());
		}
		System.out.println("------------------------------------------------------------------------------------------------------------------");
	}

	@Override
	public void displayBook(Book book) {
		System.out.println("------------------------------------------------------------------------------------------------------------------");
		System.out.printf("| %-4s | %-30s | %-15s | %-10s | %-20s | %-15s |\n", "번호", "제목", "저자", "가격", "출판사", "장르");
		System.out.println("------------------------------------------------------------------------------------------------------------------");
		System.out.printf("| %-4d | %-25s | %-15s | %,10d원 | %-20.20s | %-15.15s |\n",
	            book.getBookNo(),
	            book.getBookName(),
	            book.getBookWriter(),
	            book.getBookPrice(),
	            book.getPublisher(),
	            book.getGenre());
		System.out.println("------------------------------------------------------------------------------------------------------------------");
		
	}

	@Override
	public void displayCustomerList(ArrayList<Customer> list) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void diplayCutomerOne(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String inputCName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String inputCId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer inputCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer modifyCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

}

























