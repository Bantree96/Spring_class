package kr.inhatc.spring.basic;

public class HyundaiMaker implements CarMaker {
	
	@Override
	public Car sell(Money money) {
		System.out.println("�����ڵ���.sell : �� ����  " + money.getAmount());
		Car car = new Car("�Ÿ");
		System.out.println("�����ڵ���.sell : �۾� - " + car.getName());
		System.out.println("�����ڵ���.sell : �Ǹ� - " + car.getName());
		return car;
	}
}
