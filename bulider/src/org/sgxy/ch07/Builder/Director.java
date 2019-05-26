package org.sgxy.ch07.Builder;
/*
 * 指挥者
 * 用于创建一个复杂对象
 * 作用：
 * 1.隔离了客户与产品的生产过程
 * 2.控制产品的生产过程
 */
public class Director {
	public Car createCar(IBuilderCar car){
		car.body();
		car.faDongJi();
		car.paiQiGuan();
		car.lunTai();
		return car.createCar();
	}
}
