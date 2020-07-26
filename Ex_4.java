enum Beer 
{
	kf, ko, rc, fo;
}
class EnumTest{
	public static void main(String[] args ){
		Beer[] b = Beer.values();
		for(Beer bl:b){
			System.out.println(bl + ".... " + bl.ordinal());

		}
	}
}