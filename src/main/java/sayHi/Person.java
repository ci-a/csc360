package sayHi;

public class Person
{
	String fname;
	String lname;
	int age;
	
	public Person(String fname, String lname, int age)
	{
		this.fname = fname;
		this.lname = lname;
		this.age = age;
		
	}

	/**
	 * @return the fname
	 */
	public String getFname()
	{
		return fname;
	}

	/**
	 * @param fname the fname to set
	 */
	public void setFname(String fname)
	{
		this.fname = fname;
	}

	/**
	 * @return the lname
	 */
	public String getLname()
	{
		return lname;
	}

	/**
	 * @param lname the lname to set
	 */
	public void setLname(String lname)
	{
		this.lname = lname;
	}

	/**
	 * @return the age
	 */
	public int getAge()
	{
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age)
	{
		this.age = age;
	}

	@Override
	public String toString()
	{
		return "Person: " + fname + " " + lname + " " + age;
	}
	
	public Person makePerson(Person that) throws UnderageException
	{
		if (age < 18 || that.age < 18)
		{
			throw new UnderageException();
		}
		Person child = new Person(this.fname, that.lname, 0);
		return child;
	}
	
	public static void main(String[] args)
	{
		Person p = new Person("elvis", "tiec", 19);
		String b = p.toString();
		System.out.println(b);
	}
}
