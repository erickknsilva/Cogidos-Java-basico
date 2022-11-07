package capitulo13tiposgenericos.classesGenericas1;

public class SimpGen {

    @SuppressWarnings("unused")
    public static void main(String[] args) {

        GenTwo<Integer, String> tgObj = new GenTwo<Integer, String>(88, "Generics");

        // exibe os tipos
        tgObj.showType();

        // obtem e exive valores.
        int v = tgObj.getOb1();
        System.out.println("Value: " + v);

        String str = tgObj.getOb2();
        System.out.println("Value: " + str);

        System.out.println();
        GenTwo<String, String> x = new GenTwo<String, String>("Erick ", "Silva");

        x.showType();

        String st1 = x.getOb1();
        System.out.println("Value: " + st1);

        String st2 = x.getOb2();
        System.out.println("Value: " + st2);

    }
}
