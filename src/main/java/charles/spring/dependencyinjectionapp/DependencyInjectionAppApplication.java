package charles.spring.dependencyinjectionapp;

import charles.spring.dependencyinjectionapp.controllers.ConstructorInjectedController;
import charles.spring.dependencyinjectionapp.controllers.MyController;
import charles.spring.dependencyinjectionapp.controllers.PropertyInjectedController;
import charles.spring.dependencyinjectionapp.controllers.SetterInjectedController;
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

		System.out.println("--------Property");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController)ctx.getBean("propertyInjectedController");

		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("--------Setter");

		SetterInjectedController setterInjectedController = (SetterInjectedController)ctx.getBean("setterInjectedController");

		System.out.println(setterInjectedController.getGreeting());

		System.out.println("--------Constructor");

		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");

		System.out.println(constructorInjectedController.getGreeting());

	}

}
