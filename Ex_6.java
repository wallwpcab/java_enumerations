enum Beer{
     kf(70),ko(80),rc(90),fo;
	 int price;
	 Beer(int price){
		 this.price = price;
	 }
	 Beer(){
		 this.price = 65;
	 }
	 public int getPrice(){
		 return price;
	 }
}



class EnumTest{
	public static void main(String[] args){
		Beer[] b = Beer.values();
		for(Beer b1:b){
			System.out.println(b1+"......" + b1.getprice());
		}
	}
	
}