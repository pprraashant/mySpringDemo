package fooddemo;

public class Meat {
	
	private String myName;

	public String getMyName() {
		return myName;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}

	public Meat()
	{
		
	}
	public Meat(String name)
	{
		setMyName(name);
	}
	public String talkaboutYourself()
	{
		String speech="I am Meat";
		if(myName!=null && myName!="")
			speech=speech+ "My Name :"+myName;
		return speech;
	}

}
