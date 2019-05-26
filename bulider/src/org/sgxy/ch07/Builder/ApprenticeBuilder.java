package org.sgxy.ch07.Builder;
/*
 * 具体建造者 根据老师傅的要求改车
 */
public class ApprenticeBuilder implements IBuilderCar {
	Car car = null;
	public ApprenticeBuilder(){
		car = new Car();
	}
	public void body() {
		car.setBody("钛合金车体");
	}
	public void faDongJi() {
		car.setFaDongJi("双涡轮增压发动机");
	}
	public void paiQiGuan() {
		car.setPaiQiGuan("高压排气管 4X");
	}
	public void lunTai() {
		car.setLunTai("米其林轮胎");
	}
	public Car createCar(){
		return car;
	}
}
