enum Beer{
	kf , ko, rc, fo;
}
class EnumTest {
	public static void main(String[] args)
	{
		Beer b = Beer.KF;
		switch(b)
		{
			case KF:
			System.out.println("It is children's brand");
			break;
			
			case KO:
			System.out.println("It is too lite");
			break;
			
			case RC:
			System.out.println("It is children's brand");
			break;
			
			case FO:
			System.out.println("It is children's brand");
			break;
			
		    default:
			System.out.println("Other Systems are not recommended");
			break;
			
		}
	}
}
