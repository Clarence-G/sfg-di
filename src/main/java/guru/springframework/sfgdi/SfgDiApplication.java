package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx  = SpringApplication.run(SfgDiApplication.class, args);

		MyController con = (MyController) ctx.getBean("myController");
		String greeting = con.sayHello();
		System.out.println(greeting);
	}

}
