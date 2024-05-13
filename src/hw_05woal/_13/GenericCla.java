package hw_05woal._13;

import java.util.Collections;
import java.util.List;
import java.util.Map;

//1. 멤버변수로 private T t를 가지면서 getT(), setT() 메소드를 갖는 제네릭클래스 GenericCla를 생성하세요.
public class GenericCla<T> {
	private T t;

	public T getT() {
		return this.t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	//2. public static <T> String add(T t1, T t2) 제네릭 메소드를 정의하고 
	//매개변수로 어떤 값이 들어오던 문자열 결합연산이 돼서 스트링값으로 리턴하도록 만드세요.
	public static <T> String add(T t1, T t2) {
		return (String)t1+(String)t2;
	}
	
	//3. public static Integer sum(List<?> list)  리스트의 총합을 구하는 메소드를 구현하세요.
	public static Integer sum(List<Integer> list) {
		int sum = 0;
		for(Integer i : list) {
			sum += i;
		}
		return sum;
	}
	
	//4. 어떤 배열이던지 받아서 인덱스가 3의 배수인 요소만 출력하는 메소드 void printArr을 구현하세요.(와일드 카드 사용)
	public static <T> void printArr(List<?> arr) {
		for(int i = 1; i <= arr.size(); i++) {
			if(i%3 == 0) {
				System.out.println(arr.get(i));
			}
			
		}
	}
	
	//5. Number를 상속받은 클래스타입의 배열만 받아서 배열의 최소값을 구해서 리턴하는 메소드 getMin을 구현하세요.
	public static <T extends Number> T getMin(List<? extends Number> arr) {
		Integer min = (Integer)arr.get(0);
		int index = 0;
		for(int i = 1; i < arr.size(); i++) {
			if((Integer)arr.get(i) <= min) {
				min = (Integer)arr.get(i);
				index = i;
			}
		}
//		return Collections.min(arr);
		return (T) arr.get(index);
	}
	
	//6. Map을 어떤형태로든 받아서 value를 String으로 변경했을 때 길이가 10이상되는 key를 출력하는 메소드 void printOverTen을 구현하세요.
	public static void  printOverTen(Map<?, ?> map) {
//		for(int i = 0; i < map.size()-1; i++) {
//			if(map.get(i).toString().length() >= 10) {
//				System.out.println(map);
//			}
//		}
		for (Object value : map.values()) {
	        if (value.toString().length() >= 10) {
	            System.out.println(value);
	        }
		}
	
	}
	
}
