package fooddemo;

public class Dairy {
	
	private String myName;

	public String getMyName() {
		return myName;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}

	public Dairy()
	{
		
	}
	public Dairy(String name)
	{
		setMyName(name);
	}
	public String talkaboutYourself()
	{
		String speech="I am Dairy";
		if(myName!=null && myName!="")
			speech=speech+ "My Name :"+myName;
		return speech;
	}

}
