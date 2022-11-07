/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Applet.java to edit this template
 */
package capitulo15appletsEventoTopicos.appletSimples1;

import java.applet.*;
import java.awt.*;


/*
<applet code= "EsqueletoDoApplet" width= 300 height = 100 </applet>
 */
@SuppressWarnings("serial")
public class EsqueletoDoApplet extends Applet {

    /**
     * O método init( ) é o primeiro a ser chamado. Em init( ), seu applet
     * inicializará variáveis e executará qualquer outra atividade de
     * inicialização.O método start( ) é chamado após init( ). Também é chamado
     * para reiniciar um applet após ele ter sido interrompido, como quando o
     * usuário retorna a uma pá-gina Web já exibida que contém um applet. Logo,
     * start( ) pode ser chamado mais de uma vez durante o ciclo de vida de um
     * applet.O método paint( ) já foi descrito e é chamado sempre que a saída
     * de um applet baseado em AWT tem que ser exibida novamente.Quando a página
     * que contém o applet é abandonada, o método stop( ) é cha-mado. Você usará
     * stop( ) para suspender qualquer thread filha criada pelo applet e
     * executar outras atividades necessárias à inserção do applet em um estado
     * ocioso seguro. Lembre-se, uma chamada a stop( ) não significa que o
     * applet será encerra-do, porque ele pode ser reiniciado com uma chamada a
     * start( ) se o usuário voltar à página.O método destroy( ) é chamado
     * quando o applet não é mais necessário. Ele é usado para executar qualquer
     * operação de encerramento requerida pelo applet
     */
    
    // primerio applet chamado
    @Override
    public void init() {
        // inicializacao
    }

    /*
	 * Segundo a ser chamado apos init(). Tambem eh chamado sempre que o applet eh
	 * reiniciado
     */
    @Override
    public void start() {
        // inicia ou retoma a execucao
    }

    // chamado quando um applet eh interrompido
    @Override
    public void stop() {
        // suspende a execucao
    }

    /*
	 * Chamado quando o applet eh encerrado. Este eh o ultimo metodo a ser executado
     */
    @Override
    public void destroy() {
        // executa a atividade de encerramento
    }

    // chamado quando a janela de um applet baseado em awt deve ser restaurada.
    @Override
    public void paint(Graphics g) {
        // volta a exibir o conteudo da janela
    }

}
