package Adapter;

public class RestaurantAdapter extends RestaurantApi implements Bar{

	public void haveSong() {
		System.out.println("提供酒吧驻唱服务");
	}
}
