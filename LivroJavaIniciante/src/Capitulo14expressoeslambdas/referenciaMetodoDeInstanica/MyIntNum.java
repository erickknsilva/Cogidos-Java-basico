package Capitulo14expressoeslambdas.referenciaMetodoDeInstanica;

public class MyIntNum {
	private int v;

	MyIntNum(int x) {
		this.v = x;
	}

	int getV() {
		return v;
	}
	
	//retorna ture se n for factor de V.
	public boolean isFactor(int n) {
		return (v % n) == 0;
	}
	
}
