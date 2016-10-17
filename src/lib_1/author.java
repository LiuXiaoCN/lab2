package lib_1;

public class author  {
	private String authorid;
	private String name;
	private int age;
	private String country;
	
	public String getauthorid()
	{
		return authorid;
	}
	public String getname()
	{
		return name;
	}
	public int getage()
	{
		return age;
	}
	public String getcountry()
	{
		return country;
	}
	public author(String authorid,String name,int age,String country)
	{
		this.authorid=authorid;
		this.name=name;
		this.age=age;
		this.country=country;
	}

}
