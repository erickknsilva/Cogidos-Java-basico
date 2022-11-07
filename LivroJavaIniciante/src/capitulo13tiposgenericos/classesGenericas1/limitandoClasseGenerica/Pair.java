package capitulo13tiposgenericos.classesGenericas1.limitandoClasseGenerica;

public class Pair<T, V extends T> {

    T first;
    V second;

    Pair(T a, V b) {
        this.first = a;
        this.second = b;
    }

    public T getFirts() {
        return this.first;
    }

    V getSecond() {
        return this.second;
    }

}
