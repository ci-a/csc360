package sayHi;

public class UnderageException extends Exception
{

	public UnderageException()
	{
		super("parent is too young");

	}

	public UnderageException(String message)
	{
		super(message);

	}


	private static final long serialVersionUID = 7842281854026770423L;

}
