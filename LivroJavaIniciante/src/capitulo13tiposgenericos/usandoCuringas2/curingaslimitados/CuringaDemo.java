package capitulo13tiposgenericos.usandoCuringas2.curingaslimitados;

public class CuringaDemo {

	static void test(Gen<? extends A> obj) {
		System.out.println("Value: " + obj.getClass().toGenericString());
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		A a = new A(); // intancia um objeto da classe A
		B b = new B(); // instancia um objeto da classe B
		C c = new C(); // instancia um objeto da classe C
		D d = new D(); // instancia um objeto da classe D

		Gen<A> w = new Gen<A>(a);
		Gen<B> w2 = new Gen<B>(b);
		Gen<C> w3 = new Gen<C>(c);
		Gen<D> w4 = new Gen<D>(d);

		test(w); // essas chamadas sao validas pq
		test(w2);// W, W2 e w3 sao subclasse de A
		test(w3);

//		Nao pode chamar test() com w4 pq ele 
//		nao eh um objeto de um classe que herde A
//		test(w4);

	}
}
