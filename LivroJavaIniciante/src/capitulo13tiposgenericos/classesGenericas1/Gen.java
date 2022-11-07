package capitulo13tiposgenericos.classesGenericas1;

//Classe generica simples.
//Aqui, T � um parametro de tipo que
//ser� substituido pelo tipo real quando
//um objeto de tipo Gen for criado

public class Gen<T> { // declara um tipo de classe Generica

	T ob;// declara um objeto de tipo T

	Gen(T o) {// recebe como parametro um objeto de tipo T
		this.ob = o;
	}

	T getOb() { // retorna ob
		return ob;
	}

	void showType() {
		System.out.println("O tipo de T eh " + ob.getClass().getName());
	}

//
//	T ob; // declara um objeto do tipo T
//
//	// passa para o construtor uma referencia do tipo T
//	Gen(T o) {
//		ob = o;
//	}
//
//	// retorna ob
//	T getOb() {
//		return ob;
//	}
//
//	// exibe o tipo de de T
//	void showType() {
//		System.out.println("O tipo de T é " + ob.getClass().getName());
//	}

}
