package ClasseMetodos.exercicio;

public class teste {

    public static void main(String[] args) {

        double[] notas1 = {4.9, 6.3, 3.8, 6.3};

        double nf = 0, media =0;

        for (double notas : notas1) { // passando a array nota1 para notas no laco forEach
            nf += notas; // para somar as notas a cada repeticao
            System.out.println("Soma das notas = " + nf); // imprimir as somas da notas a cada interacao
        }
        media = nf / notas1.length; // calcular e imprimir a media das nota
        System.out.println();
       
        
        if(media < 0 || media > 10) //condicao para nota ser invalida
             System.out.println("Nota inv�lida\n");
        else if(media < 5) // condicao para aluno reprovado
            System.out.printf("M�dia %.2f Reperovado\n", media);
        else if(media < 6) // condicao para aluno em recuperacao
             System.out.printf("M�dia %.2f Recuperacao\n", media);
        else if(media > 6) // condicao para aluno aprovado
             System.out.printf("M�dia %.2f Aprovado \n", media);
        
        
    }

}
