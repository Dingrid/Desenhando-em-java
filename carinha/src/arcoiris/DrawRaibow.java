package arcoiris;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawRaibow extends JPanel 
{
	//define as cores indigo e violeta
	private final static Color VIOLET = new Color(128,0,128); 
	private final static Color INDIGO = new Color(75,0,130);
	
	//a utilizar no arco iris, iniciando a parte mais interna
	//as duas entradas em branco resultam em um arco vazio no centro
	private Color[] colors = 
		{Color.WHITE, Color.WHITE, VIOLET, INDIGO, Color.BLUE,
		 Color.GREEN, Color.YELLOW, Color.ORANGE, Color.RED};
		
	//construtor
	public DrawRaibow()
	{
		setBackground( Color.WHITE); //configura o fundo como branco	
	} //fim do construtor DrawRainbow
	
	//desenha um arco-iris utilizando arcos concêntricos
	public  void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		int radius = 20; //raio de um arco
	
	//desenha o arco-iris perto da parte central inferior
	int centerX = getWidth() / 2;
	int centerY = getHeight() - 10;
	
	//desenha arcors preenchidos com o mais externo
	for (int counter = colors.length; counter > 0; counter-- )
	{
		//configura a cor para o arco atual
		g.setColor(colors[ counter - 1]);
		
		//preenche o arco de 0 a 180 graus
		g.fillArc(centerX - counter * radius, 
				centerY - counter * radius,
				counter * radius *2, counter * radius*2,0,180);
	}//fim do for
} //fim do método paintComponent
} //fim da classe DrawRainbow
