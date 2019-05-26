package org.sgxy.ch07.Builder;
/*
 * 抽象建造者 -- 负责定义车的接口标准
 */
public interface IBuilderCar {
	void body();
	void faDongJi();
	void paiQiGuan();
	void lunTai();
	Car createCar();
}
