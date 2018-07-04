public class Hello
{
	public static void main(String[] args) throws Exception
	{
    for (;;) {
		  System.out.println("Hello from " + System.getenv("RESIN_DEVICE_NAME_AT_INIT") + "!");
      Thread.sleep(5000);
    }
	}
}
