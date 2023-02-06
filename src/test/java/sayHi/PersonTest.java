package sayHi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonTest
{
	Person p1;
	Person p2;
	Person p3;
	Person p4;
	
	
	@BeforeEach
	void setUp() throws Exception
	{
		p1 = new Person("elvis", "tiec", 13);
		p2 = new Person("nami", "lee", 14);
		p3 = new Person("old", "man", 60);
		p4 = new Person("old", "woman", 59);
	}

	@Test
	void testToString()
	{
		assertEquals("Person: elvis tiec 13", p1.toString());
	}
	
	@Test
	void testPerson()
	{
		assertThrows(UnderageException.class,
				()->{
					p1.makePerson(p2);
				});
		assertThrows(UnderageException.class,
				()->{
					p3.makePerson(p2);
				});
		
		Person child;
		try
		{
			child = p3.makePerson(p4);
			
			assertEquals(p3.getFname(), child.getFname());
			assertEquals(p4.getLname(), child.getLname());
			assertEquals(0, child.getAge());
			
		} catch (UnderageException e)
		{
			e.printStackTrace();
			fail("threw exception");
		}

	}
}
