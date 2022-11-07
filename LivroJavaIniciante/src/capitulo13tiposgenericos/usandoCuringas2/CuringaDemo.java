package capitulo13tiposgenericos.usandoCuringas2;

public class CuringaDemo {

    @SuppressWarnings("unused")
    public static void main(String[] args) {

        NumericsFns<Integer> iOb = new NumericsFns<Integer>(6);
        NumericsFns<Double> dOb = new NumericsFns<Double>(-6.0);
        NumericsFns<Long> lOb = new NumericsFns<Long>(5l);

        System.out.println("Testing iOb e dOb...");
        if (iOb.absEquals(dOb)) {
            System.out.println("Os valores absolutos sao iguais.");
            System.out.println("Valor: " + iOb.getObj1() + " Valor: " + dOb.getObj1());
        } else {
            System.out.println("Os valores absolutos sao diferente ");
            System.out.println("Valor: " + iOb.getObj1() + " Valor: " + dOb.getObj1());
        }
        System.out.println();

        System.out.println("Testing iOb e lOb");
        if (iOb.absEquals(lOb)) {
            System.out.println("Os valores absolutos sao iguais.");
            System.out.println("Valor: " + iOb.getObj1() + " Valor: " + lOb.getObj1());
        } else {
            System.out.println("Os valores absolutos sao diferente ");
            System.out.println("Valor: " + iOb.getObj1() + " Valor: " + lOb.getObj1());
        }

    }
}
