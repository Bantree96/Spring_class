package kr.inhatc.spring.basic;

// ���� �����ϴ� Ŭ����
public class Money {
	private int amount;
	
	// �� ������
	public Money() {
		super(); // super�� ���� �ٽ� �ѹ� ã�ƺ���
	}

	public Money(int amount) {
		super();
		this.amount = amount;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
}
