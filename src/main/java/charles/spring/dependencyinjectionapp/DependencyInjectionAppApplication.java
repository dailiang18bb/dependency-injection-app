package charles.spring.dependencyinjectionapp;

import charles.spring.dependencyinjectionapp.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionAppApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DependencyInjectionAppApplication.class, args);

		PetController petController = (PetController)ctx.getBean("petController", PetController.class);
		System.out.println("--- The Best Pet is ---");
		System.out.println(petController.whichPetIsTheBest());


		I18nController i18nController = (I18nController)ctx.getBean("i18nController");

		System.out.println(i18nController.sayHello());


		MyController myController = (MyController)ctx.getBean("myController");

		// String greeting = myController.hello();
		// System.out.println(greeting);
		System.out.println("--------Primary Bean");

		System.out.println(myController.hello());

		System.out.println("--------Property");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController)ctx.getBean("propertyInjectedController");

		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("--------Setter");

		SetterInjectedController setterInjectedController = (SetterInjectedController)ctx.getBean("setterInjectedController");

		System.out.println(setterInjectedController.getGreeting());

		System.out.println("--------Constructor");

		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");

		System.out.println(constructorInjectedController.getGreeting());


		System.out.println("############################");
		System.out.println("Spring Factory Beans Example!!!");
		System.out.println(ctx.getBean(PropertyInjectedController.class).getGreeting());
		System.out.println(ctx.getBean(SetterInjectedController.class).getGreeting());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).getGreeting());

	}

}
