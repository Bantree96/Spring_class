package kr.inhatc.spring.basic;

public class OrderManager {
	
	// private HyundaiMaker maker;
	private CarMaker maker;

	// OrderManager�� ���������
	public OrderManager(CarMaker maker) {
		super();
		// maker = new HyundaiMaker(); 
		this.maker = maker; 
		
	}
	
	public void order() {
		Money money = new Money(1000);
		System.out.println("OrderManager.order : ���� - "+ money.getAmount());
		System.out.println("OrderManager.order : ���� - "+ money.getAmount());

		Car car = maker.sell(money);
		System.out.println("OrderManager.order : �� ���� - " + car.getName());
	}
}
