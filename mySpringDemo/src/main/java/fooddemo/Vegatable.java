package fooddemo;

public class Vegatable {
	
	private String myName;

	public String getMyName() {
		return myName;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}

	public Vegatable()
	{
		
	}
	public Vegatable(String name)
	{
		setMyName(name);
	}
	public String talkaboutYourself()
	{
		String speech="I am Vegatable";
		if(myName!=null && myName!="")
			speech=speech+ "My Name :"+myName;
		return speech;
	}

}
