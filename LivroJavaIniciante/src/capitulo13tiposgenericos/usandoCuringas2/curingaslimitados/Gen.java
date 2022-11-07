package capitulo13tiposgenericos.usandoCuringas2.curingaslimitados;

public class Gen<T> {

    T ob;

    Gen(T o) {
        ob = o;
    }

    T getOb() {
        return ob;
    }
}
