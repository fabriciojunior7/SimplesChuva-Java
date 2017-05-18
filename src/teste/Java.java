package teste;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class Java extends JComponent implements ActionListener, MouseListener{
	
	protected static int largura = 600;
	protected static int altura = 600;
	protected static int mouseX = 0, mouseY = 0;
	protected Bola b = new Bola(15, 15, 5, 10);
	protected static ArrayList<Bola> bolas = new ArrayList();
	
	
	public static void main(String[] args){
		
		int numGotas = 1000;
		for(int i=0; i<numGotas; i++){
			bolas.add(new Bola(0, altura, 5, 10));
		}
		
		Java teste = new Java();
		JFrame tela = new JFrame("Fabricio Junior");
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setSize(largura, altura);
		tela.setVisible(true);
		tela.setResizable(false);
		tela.setLocationRelativeTo(null);
		
		tela.add(teste);
		tela.addMouseListener(teste);
		
	}
	
	@Override
	public void paintComponent(Graphics g){
		g.setColor(new Color(0, 0, 0));
		g.fillRect(0, 0, largura, altura);
		
		mouseX = MouseInfo.getPointerInfo().getLocation().x;
		mouseY = MouseInfo.getPointerInfo().getLocation().y;
		
		for(int i=0; i<bolas.size(); i++){
			Bola b = bolas.get(i);
			g.setColor(b.getCor());
			g.fillOval(b.getX(), b.getY(), b.getLargura(), b.getAltura());
			b.cair(largura, altura);
		}
		//g.fillRect(mouseX-300, mouseY-300, 50, 50);
		//g.fillOval(mouseX-370, mouseY-240, 50, 50);
		
		//rodar();
		repaint();
	}
	
	public void rodar(){
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
