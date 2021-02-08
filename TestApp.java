package day10A;


 class AgeException extends Exception
{
	String ms;

	public AgeException(String ms) {
		super(ms);
		this.ms= ms;
}

}


class User
{
	void CheckAge(int age) throws AgeException
	{
		if(age<18)
		{
			throw new AgeException("you cannot vote");
		}
		else
		{
			System.out.println("you can vote");
		}
	}
}








public class TestApp {

	public static void main(String[] args) throws AgeException  {
		User user =new User();
		user.CheckAge(17);
	

}
}