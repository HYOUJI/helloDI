package kr.ac.hansung.spring.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {
		// Spring Container 만들기
		// xml 파일 지정해주기. 이러한 설정파일을 바탕으로 하여 spring container 저장.
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("kr/ac/hansung/spring/di/beans/animal.xml");
		
		// id=petOwner bean 얻어오기.
		PetOwner person = (PetOwner) context.getBean("petOwner");
		person.play();
		
		context.close();
		
	}
}