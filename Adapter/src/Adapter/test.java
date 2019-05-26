package Adapter;

public class test {
	public static void main(String[] args){
//		RestaurantAdapter adapter=new RestaurantAdapter();
//		adapter.haveFood();
//		adapter.haveDrink();
//		adapter.haveSong();
		
		RestaurantAdapter2 adapter2 = new RestaurantAdapter2(new RestaurantApi());
	    adapter2.haveSong();
	}
}
