package Bpg319_Q10;

import java.util.Scanner;

public class DictionaryApp {
	public static void prnInfo(Scanner scanner, Dictionary dictionary) {
		int selectMenu;
		String key, value;
		
		while(true) {
			System.out.print("1. key와 value 저장하기 2.key로 value 찾기 3. 삭제하기 4. 종료하기 5. 길이출력하기 ");
			selectMenu=scanner.nextInt();
			
			if (selectMenu ==1) {
				System.out.print("key와 value를 입력하세요 ");
				key=scanner.next();
				value=scanner.next();
				dictionary.put(key,value);
				
			}else if (selectMenu ==2) {
				System.out.print("key를 입력하세요 :");
				key=scanner.next();
				System.out.println(dictionary.get(key));
				
			}else if(selectMenu ==3) {
				System.out.print("삭제할 key값을 입력하세요: ");
				key=scanner.nextLine();
				dictionary.delete(key);
			}else if (selectMenu==4){
				System.out.println("종료합니다. ");
				break;
			}else if(selectMenu==5){
				System.out.println(dictionary.length()+"입니다.");
				
			}else{
				System.out.println("잘못된 입력입니다. ");
			}
		}
		
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Dictionary dictionary = new Dictionary(); //새로운 객체 만들기
		
		prnInfo(scanner,dictionary);
		scanner.close();
	}

}
