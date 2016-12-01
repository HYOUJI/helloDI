package kr.ac.hansung.spring.aop;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class PetOwner {
	
	//@Autowired // wiring by type
	//@Qualifier(value="qf_dog") // qualifier로 animal.xml도 추가해주면 nullpointexception발생 안됨.
	@Resource(name="dog") // wiring by name
	private AnimalType animal;
	
	public void play() {
		animal.sound();
	}

}
