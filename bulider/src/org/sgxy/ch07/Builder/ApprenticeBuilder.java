package org.sgxy.ch07.Builder;
/*
 * ���彨���� ������ʦ����Ҫ��ĳ�
 */
public class ApprenticeBuilder implements IBuilderCar {
	Car car = null;
	public ApprenticeBuilder(){
		car = new Car();
	}
	public void body() {
		car.setBody("�ѺϽ���");
	}
	public void faDongJi() {
		car.setFaDongJi("˫������ѹ������");
	}
	public void paiQiGuan() {
		car.setPaiQiGuan("��ѹ������ 4X");
	}
	public void lunTai() {
		car.setLunTai("��������̥");
	}
	public Car createCar(){
		return car;
	}
}
