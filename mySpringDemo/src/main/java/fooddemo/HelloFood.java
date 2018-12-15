package fooddemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class HelloFood {

	public static void main(String[] args) {
		
		
//		Fruit f = new Fruit();
//		Vegatable v= new Vegatable();
//
		ApplicationContext appContextUsingClassPath = new ClassPathXmlApplicationContext("myTestPackage/appContext.xml");
		ApplicationContext appContext = new FileSystemXmlApplicationContext("appContext.xml");
		Fruit f= appContext.getBean("fruit",Fruit.class);
		
		Fruit f1= appContext.getBean("fruitwithName",Fruit.class);
		
		Vegatable v= (Vegatable) appContext.getBean("Vegatable");
		
		Vegatable v1= (Vegatable) appContext.getBean("VegatableWithName");
		
		Fruit f2= appContext.getBean("fruitWithNameListandMap", Fruit.class);
		
		Vegatable v2= (Vegatable) appContext.getBean("VegatableWithNameUsingP-namespace");
		
		
		System.out.println(f.talkaboutYourself());
		System.out.println(v.talkaboutYourself());
		System.out.println(f1.talkaboutYourself());
		System.out.println(v1.talkaboutYourself());
		System.out.println(f2.talkaboutYourself());
		System.out.println(v2.talkaboutYourself());
		
		Meal myNormalMeal= new Meal();
		Meal mySpringMeal= (Meal) appContextUsingClassPath.getBean("meal");
		Meal mySpringMeal1= (Meal) appContextUsingClassPath.getBean("mealWithContructorArg");
		Meal mySpringMeal2= (Meal) appContextUsingClassPath.getBean("mealWithContructorArgWithName");
		Meal mySpringMeal3= (Meal) appContext.getBean("mealOuterBean");
		//Fruit f3 = appContextUsingClassPath.getBean("fruitsUsingExternalProperty",Fruit.class);
		Fruit f3 = appContext.getBean("fruitsUsingExternalProperty",Fruit.class);
		System.out.println("Normal Meal :"+myNormalMeal.whatsInThisMeal());
		System.out.println("Spring Meal :"+mySpringMeal.whatsInThisMeal());
		System.out.println("Spring Meal :"+mySpringMeal1.whatsInThisMeal());
		System.out.println("Spring Meal :"+mySpringMeal2.whatsInThisMeal());
		
		System.out.println(f3.talkaboutYourself());
		
		System.out.println("Spring Meal :"+mySpringMeal3.whatsInThisMeal());
		
		Meal autoWiredMeal= appContextUsingClassPath.getBean("autoWiredMeal",Meal.class);		
		System.out.println(autoWiredMeal.whatsInThisMeal());
		
		Meal autoWiredMealByName= appContextUsingClassPath.getBean("autoWiredMealByName",Meal.class);
		System.out.println(autoWiredMealByName.whatsInThisMeal());
	
		Meal autoWiredMealByConstructor= appContextUsingClassPath.getBean("autoWiredMealConstructor",Meal.class);
		System.out.println(autoWiredMealByConstructor.whatsInThisMeal());
		
		Meal autoWiredMealDefault= appContextUsingClassPath.getBean("autoWiredMealDefault",Meal.class);
		System.out.println(autoWiredMealDefault.whatsInThisMeal());
		
		((FileSystemXmlApplicationContext)appContext).close();
		((ClassPathXmlApplicationContext)appContextUsingClassPath).close();
	}

}
