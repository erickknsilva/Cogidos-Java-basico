package Capitulo14expressoeslambdas.referenciaDeConstrutor;

public class MyClass {
	private String str;
	
	public MyClass() {
		str = "";
	}
	public MyClass(String s) {
		this.str = s;
	}

	String getStr() {
		return this.str;
	}

}
