public class Hello
{
	public static void main(String[] args)
	{
		System.out.println("Hello from " + System.getenv("RESIN_DEVICE_NAME_AT_INIT"));
	}
}
