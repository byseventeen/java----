package org.sgxy.ch07.Builder;
/*
 * ָ����
 * ���ڴ���һ�����Ӷ���
 * ���ã�
 * 1.�����˿ͻ����Ʒ����������
 * 2.���Ʋ�Ʒ����������
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
