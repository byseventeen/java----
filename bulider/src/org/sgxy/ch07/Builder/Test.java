package org.sgxy.ch07.Builder;

public class Test {
	public static void main(String[] args) {
		Director d = new Director();
		Car car = d.createCar(new ApprenticeBuilder());
		System.out.println(car.getBody());
	}
}
