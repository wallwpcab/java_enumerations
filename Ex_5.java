enum wallie{
	kf, foo;
	public static void main(String[] args) {
		System.out.println("this will print this,, Enum main method ");
	}
}

enum wallie{
	w, foo;
	wallie(){
		System.out.println("This is constructor");
	}
}
class enumtest{

	public static void main(String[] args) {
		wallie.b = wallie.foo;
		System.out.println("Hello");
		
	}
}