package kr.inhatc.spring.basic;

public class BenzMaker implements CarMaker{

	@Override
	public Car sell(Money money) {
		System.out.println("����.sell : �� ����  " + money.getAmount());
		Car car = new Car("E220");
		System.out.println("����.sell : �۾� - " + car.getName());
		System.out.println("����.sell : �Ǹ� - " + car.getName());
		return car;
	}
}
