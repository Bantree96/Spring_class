package kr.inhatc.spring.basic;

// �ڵ��� ������ �����ϴ� Ŭ����
public class Car {
	private String name;

	// alt + shift + s ������ ���೪��
	
	// ������, generate construct using fields
	public Car(String name) {
		super();
		this.name = name;
	}
	
	// getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
