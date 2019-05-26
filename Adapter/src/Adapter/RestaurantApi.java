package Adapter;

public class RestaurantApi implements Restaurant{
	public void haveFood(){
		System.out.println("提供美食");
	}

	public void haveDrink() {
		System.out.println("提供饮品");
	}
}
