package Capitulo14expressoeslambdas.referenciaDeConstrutor;

public class ReferenciaDeConstrutor {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		/**
		 * Cria uma referencia ao construtor de MyClass. já que o metodo func() de
		 * myFunc recebe um argumento, new referencia o construtor parametrizado de
		 * MyClass e nao o construtor padrao.
		 */

		// cria uma instancia de uma interface e recebe uma referencia de construtor
		// parametrizado
		MyFunc myClassCons = MyClass::new;// new referencia o construtor parametrizado de MyClass

		// cria uma instancia de MyClass usando essa referencia de construtor
		// parametrizado recebida
		MyClass mc = myClassCons.func("Teste");

		System.out.println("str in mc eh " + mc.getStr());

	}
}
