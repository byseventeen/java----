package Adapter;

public class RestaurantAdapter2 implements Bar {
	private Restaurant restuarant;
	public  RestaurantAdapter2(Restaurant restuarant){
		this.restuarant=restuarant;
		this.restuarant.haveFood();
		this.restuarant.haveDrink();
	}
	public void haveSong(){
		System.out.println("Ìá¹©ÁË¾Æ°É×¤³ª");
	}
	
}
