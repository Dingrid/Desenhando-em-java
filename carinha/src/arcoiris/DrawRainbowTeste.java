package arcoiris;

import javax.swing.JFrame;

public class DrawRainbowTeste {

	public static void main (String[] args)
	{
		DrawRaibow panel = new DrawRaibow();
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(400,250);
		application.setVisible(true);
	} //fim de main
}//fim da classe DrawRainbowTest
