package kr.inhatc.spring.basic;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// BenzMaker b = new BenzMaker();
		HyundaiMaker b = new HyundaiMaker();
		
		// setter�� �����ڸ� ������ DI�� ���԰���
		OrderManager manager = new OrderManager(b);
		manager.order();
	}

}
