
public class Person implements Comparable<Person>
{
	private String name;
	private int age;
	
	// Constructors
	public Person()
	{
		this.name = null;
		this.age = 0;
	}
	
	public Person(int age)
	{
		this.name = null;
		this.age = age;
	}
	
	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	// Getters
	public String getName() { return this.name; }
	public int getAge() { return this.age; }
	
	// Setters
	public void setName(String name) { this.name = name; }
	public void setAge(int age) { this.age = age; }
	
	// Interface Methods
	public int compareTo(Person p)
	{
		if(this.age>p.getAge()) return 1;
		else if(this.age<p.getAge()) return -1;
		else return 0;
	}
	
	// toString
	public String toString()
	{
		return this.age + "";
	}
}
