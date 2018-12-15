package fooddemo;

import java.util.List;
import java.util.Map;

public class Fruit {
	
	private String definition="Not Set";
	public String getDefinition() {
		return definition;
	}

	public void setDefinition(String definition) {
		this.definition = definition;
	}

	private String myName;
	private List<String> myFruitNameList;
	private Map<String,String> myFruitNameMap;
	
	public Map<String, String> getMyFruitNameMap() {
		return myFruitNameMap;
	}

	public void setMyFruitNameMap(Map<String, String> myFruitNameMap) {
		this.myFruitNameMap = myFruitNameMap;
	}

	public List<String> getMyFruitNameList() {
		return myFruitNameList;
	}

	public void setMyFruitNameList(List<String> myFruitNameList) {
		this.myFruitNameList = myFruitNameList;
	}

	public String getMyName() {
		return myName;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}

	public Fruit(String name)
	{
		setMyName(name);
	}
	public Fruit()
	{
		
	}
	
	public String talkaboutYourself()
	{
		String speech="";
		if(this.definition.equals("Not Set"))
		speech="I am fruit";
		else
		speech=definition;	
		if(myName!=null && myName!="")
			speech=speech+ "My Name :"+myName;
		
		if(myFruitNameList!=null && myFruitNameList.size() > 0)
		{
			speech +="\nList :";
			for(int i=0;i<myFruitNameList.size();i++)
			{
				speech +="\n "+myFruitNameList.get(i);
			}
		}
		if(myFruitNameMap!=null && myFruitNameMap.size() > 0)
		{
			speech +="\nMap :";
			for(Map.Entry<String, String> fruitName : myFruitNameMap.entrySet())
			{
				speech +="\n Key is:"+fruitName.getKey()+fruitName.getValue();
			}
		}
		return speech;
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
