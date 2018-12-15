package fooddemo;

public class Apple extends Fruit {
	
	private String name;
	private String description ="Not Set";
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String talkaboutYourself()
	{
		String result= super.talkaboutYourself();
		if(description!=null) result+=description;
	
		return result;
	}
	public void initMethod()
	{
		System.out.println("initMethod");
	}
	public void destoryMethod()
	{
		System.out.println("destoryMethod");
	}
}
