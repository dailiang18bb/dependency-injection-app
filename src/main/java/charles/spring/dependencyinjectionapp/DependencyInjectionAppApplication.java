package charles.spring.dependencyinjectionapp;

import charles.spring.dependencyinjectionapp.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionAppApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DependencyInjectionAppApplication.class, args);

		MyController myController = (MyController)ctx.getBean("myController");

		String greeting = myController.hello();

		System.out.println(greeting);
	}

}
