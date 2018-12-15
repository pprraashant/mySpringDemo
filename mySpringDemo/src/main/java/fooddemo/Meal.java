package fooddemo;

public class Meal {
	
	public Fruit getFruit() {
		return fruit;
	}
	public void setFruit(Fruit fruit) {
		this.fruit = fruit;
	}
	public Dairy getDairy() {
		return dairy;
	}
	public void setDairy(Dairy dairy) {
		this.dairy = dairy;
	}
	public Meat getMeat() {
		return meat;
	}
	public void setMeat(Meat meat) {
		this.meat = meat;
	}
	public Vegatable getVeg() {
		return veg;
	}
	public void setVeg(Vegatable veg) {
		this.veg = veg;
	}
	private Fruit	fruit;
	private Dairy	dairy;
	private Meat	meat;
	private Vegatable veg;
	
	public String whatsInThisMeal()
	{
		String answer= "This meal contains: ";
		if(fruit!=null) answer +="Some fruit: "+fruit.talkaboutYourself();
		if(dairy!=null) answer +="Some dairy: ";
		if(meat!=null) answer +="Some meat: ";
		if(veg!=null) answer +="Some vegatables: ";
		return answer;
	}
	
	public Meal()
	{
		
	}
	public Meal(Fruit f,Dairy d,Meat m,Vegatable v)
	{
		this.fruit=f;
		this.dairy=d;
		this.meat=m;
		this.veg=v;
	}

}
