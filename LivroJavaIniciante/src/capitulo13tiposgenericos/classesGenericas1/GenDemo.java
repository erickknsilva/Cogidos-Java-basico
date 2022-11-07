package capitulo13tiposgenericos.classesGenericas1;

public class GenDemo {

    @SuppressWarnings("unused")
    public static void main(String[] args) {

        // Cria uma referencia do objeto da classe gen do tipo integer
        Gen<Integer> iob; // Cria uma referencia a um objeto de tipo Gen<Integer>

        /*
         * Cria um objeto Gen<Integer> e atribui sua referencia a iob. Observe o
         * uso do autoboxing no encapsulamento do valor 88 dentro de um objeto
         * Integer
         */
        iob = new Gen<Integer>(88);

        // exibe o tipo de dado usado por iob
        iob.showType();

        // Obtem o valor de iob. Observe que nenhuma coercao eh necessaria
        int v = iob.getOb();// faz o autoUnboxing
        System.out.println("Value: " + v);

        System.out.println();

        Gen<String> strOb = new Gen<String>("Classe generica teste");

        // exibi o tipo de dado usado por strOb
        strOb.showType();

        String str = strOb.getOb();

        System.out.println("Value: " + str);

        // T eh o nome de um parametro de tipo
    }

}
