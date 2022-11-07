/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package padro.obersever;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author eric
 */
public class Porteiro {

    private List<ObservadorChegadaAniversariante> observadores
            = new ArrayList<>();

    public void registraObservador(ObservadorChegadaAniversariante observador) {
        observadores.add(observador);
    }

    public void monitorar() {
        Scanner entrada = new Scanner(System.in);
        String valor = "";
        while (!"sair".equalsIgnoreCase(valor)) {
            System.out.print("Aniversariante chegou ? ");
            valor = entrada.nextLine();
            if ("sim".equalsIgnoreCase(valor)) {
                //criando o evento
                EventoChegadaAniversariante evento
                        = new EventoChegadaAniversariante(new Date());
                //notifica os observadores.
                observadores.stream()
                        .forEach(o -> o.chegou(evento));
                valor = "sair";
            } else {
                System.out.println("Alarme falso!");
            }
        }
        entrada.close();
    }
}
