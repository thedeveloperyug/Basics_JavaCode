import java.util.Scanner;

class Corona {

	int val1;
	String val2;
	String val3;
	String no;
	private Scanner me;

	void input() {

		me = new Scanner(System.in);
		System.out.println("Enter Your Body Temprature =");
		val1 = me.nextInt();
		me.nextLine();

		System.out.println("Have You any Throat Infection\n Answer in only y or n ?");
		val2 = me.nextLine();

		System.out.println("Are you feeling uncomfortable to breathe\nAnswer in only y or n ?");
		val3 = me.nextLine();
	}

	void calc()

	{
		if (val1 >= 37 && val1 <= 40) {
			System.out.println("safe");

		}

		else {
			System.out.println("You are in Danger.");
		}
	}
}

class Covid19 {
	public static void main(final String[] args)

	{
		final Corona obj = new Corona();
		obj.input();
		obj.calc();

	}
}
