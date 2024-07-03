package org.kh.library.view;

import java.util.ArrayList;
import java.util.Scanner;

import org.kh.library.model.vo.Book;
import org.kh.library.model.vo.Customer;
import org.kh.library.model.vo.Library;

public class LibraryView implements LibraryViewI{

	public Scanner sc = new Scanner(System.in);
	public LibraryView() {};
	
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
				break;
			case 2:
				break;
			case 3:
				// 책 정보 입력받기
				Book book = this.inputBook();
				break;
			case 4:
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
	public void displaySucess(String string) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String inputUserId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String inputBookName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Library insertLibrary() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void dispalyBookList(ArrayList<Book> list) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayMessage(String message) {
		// TODO Auto-generated method stub
		System.out.println(message);
	}

	@Override
	public void displayError(String message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispalyCustomerList(ArrayList<Customer> list) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void diplayCutomerOne(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayBook(Book book) {
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

	@Override
	public int inputBookNo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Book inputBook() {
		// TODO Auto-generated method stub
		return null;
	}

}

























