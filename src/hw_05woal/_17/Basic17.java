package hw_05woal._17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Basic17 {
	public static void main(String[] args) {
		
		List<Integer> intLst = new ArrayList<>();
		
		for(int i = 0; i < 10; i++) {
			intLst.add((int) ((Math.random()*10)+1));
		}
		
		Stream<Integer> newStream = intLst.stream();
		newStream.map(var -> var * 3).forEach(num -> System.out.println(num));
		
		
		System.out.println("=============================");

		
		Scanner sc = new Scanner(System.in);
//		
//		List<String> strLst = new ArrayList<>();
//		
//		for(int i = 0; i < 10; i++) {
//			strLst.add(sc.nextLine());
//		}
//		
//		strLst.stream().filter(str -> str.length() >= 5).forEach(num -> System.out.println(num));
//		
//		
//		System.out.println("=============================");
		
		List<String> strList = new ArrayList<>();
		for(int i = 0; i < 5; i++) {
			strList.add(sc.nextLine());
		}
		
		strList.stream().filter(str -> str.matches(".*[a-zA-Z]+.*")).forEach(System.out::println);
	
	}
}

/* 1. List<Integer> intList를 생성하고 10개의 랜덤값(1~10)을 저장합니다.
 * intList를 Stream으로 만들어서 각 요소에 곱하기 3을 한 요소로 새로운 스트림을 만들어서 출력하세요.
 * 
 * 
 * 2. 사용자가 입력한 문자열 10개를 저장한 문자열 리스트를 이용하여 문자열의 길이가 5이상인 문자열만 출력하세요.
 * 
 * 
 * 3. 사용자가 입력한 문자열 10개를 저장하는 List<String> strList를 만들고
 * 스트림을 이용해서 문자열에 영문자가 포함된 문자열만 뽑아서 스트림을 만들고 출력하세요.
 */