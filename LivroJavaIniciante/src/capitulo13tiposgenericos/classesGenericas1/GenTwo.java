package capitulo13tiposgenericos.classesGenericas1;

public class GenTwo<T, V> {// Usa dois parametro de tipos

    T ob1; // declara um objeto de tipo T
    V ob2; // declara um objeto de tipo V

    /* Passa para o contrutor referencias a objetos de tipo T e V */
    GenTwo(T o1, V o2) {
        this.ob1 = o1;
        this.ob2 = o2;
    }

    // exibe os tipos de T e V
    void showType() {
        System.out.println("O tipo de T é " + ob1.getClass().getName());

        System.out.println("O tipo de V é " + ob2.getClass().getName());
    }

    T getOb1() {
        return ob1;
    }

    V getOb2() {
        return ob2;
    }

}
