package dafault.trabalhofinal;

import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.JButton;

public class BotaoComHistorico {
	private JButton botao;
	private ArrayList<String> historico;
	//private Consumer consumer;
	public BotaoComHistorico(String nomeAmigo) {
		//consumer=new Consumer();
		botao = new JButton(nomeAmigo);
		//botao.setAlignmentX(CENTER_ALIGNMENT);
		botao.setPreferredSize(new Dimension(170, 25));
		botao.setMaximumSize(new Dimension(170, 25));
		historico=new ArrayList<String>();		
	}
	public JButton GetButton() {
		return botao;
	}
	public ArrayList<String> GetHistorico(){
		return historico;
	}
	/*public Consumer GetConsumer() {
		return consumer;
	}*/
}
