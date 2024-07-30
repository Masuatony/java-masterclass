package org.java.springsecurity;

import org.java.springsecurity.masterclas.SwitchClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSecurityApplication {
	@Autowired
	SwitchClass switchClass;

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityApplication.class, args);
		System.out.println("application running successful port: 3200");
//		System.out.println("method being called" );
	}

//	public void selectVal() {
//		switchClass.getMonth("Jan");
//		System.out.println(switchClass.getMonth("Jan"));
//	}
//	@CommandLineRunne

}
