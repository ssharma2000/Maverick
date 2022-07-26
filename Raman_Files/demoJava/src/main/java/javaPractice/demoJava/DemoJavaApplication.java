package javaPractice.demoJava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class DemoJavaApplication {

	public static void main(String[] args) {
		System.out.println("new practice ");

		int a=90;
		System.out.println(String.valueOf(a)+500);
		System.out.println(Integer.toString(a)+500);
		System.out.println(String.format("%d",a)+500+"\n");

		String n="200";
		String name="r";
		System.out.println(Integer.parseInt(n)+500);
		System.out.println(Integer.valueOf(n)+500);
	//todo:	System.out.println(Integer.parseInt(name));
/*		If you don't have numbers in string literal,
		calling Integer.parseInt() or Integer.valueOf()
		methods throw NumberFormatException */


		testSwitchStatement();
		testSwitchStatementExhaustive("raman");
		testSwitchStatementExhaustive(100);
	}
	public static int testSwitchStatement(){
		enum Day { SUNDAY, MONDAY, TUESDAY,
			WEDNESDAY, THURSDAY, FRIDAY, SATURDAY; }

		Day day = Day.FRIDAY;
		int numLetters = switch (day) {
			case MONDAY ,FRIDAY, SUNDAY -> {
				System.out.println(6);
				yield 6;
//				return 12;
			}
			case TUESDAY -> {
				System.out.println(7);
				yield 7;
			}
			case THURSDAY, SATURDAY-> {
				System.out.println(8);
				yield 8;
			}
			case WEDNESDAY -> {
				System.out.println(9);
				yield 9;
			}
			default-> throw new IllegalStateException("Invalid day: " + day);
		};
		System.out.println(numLetters);
		return 0;
	}
	static void testSwitchStatementExhaustive(Object obj) {
		switch (obj) {
			case String s:
				System.out.println(s);
				break;
			case Integer i:
				System.out.println(i);
				break;
			default:
				break;
		}
	}

}
