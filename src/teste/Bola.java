package teste;

import java.awt.Color;
import java.util.Random;

public class Bola {
	//Atributos
	private int x, y, largura, altura, gravidade, 
	velocidadeX, velocidadeY, aceleracao;
	private Color cor;
	
	//Construo
	public Bola(int x, int y, int largura, int altura){
		this.x = x;
		this.y = y;
		this.largura = largura;
		this.altura = altura;
		this.gravidade = 1;
		this.aceleracao = 0;
		this.velocidadeX = 0;
		this.velocidadeY = 1;
		this.cor = new Color(50, 50, 255);
	}
	
	//METODOS
	public void cair(int largura, int altura){
		this.y += this.velocidadeY;
		this.x += this.velocidadeX;
		if(this.y > altura){
			this.y = -this.altura;
			this.mudar(largura);
		}
	}
	
	public void mudar(int largura){
		Random rr = new Random();
		int xx = rr.nextInt(largura);
		int vv = rr.nextInt(8);
		int cc = rr.nextInt(200);
		
		this.x = xx;
		if(vv <= 0){
			vv = 1;
		}
		this.velocidadeY = vv;
		this.cor = new Color(cc, cc, 255);
	}

	//Metodos Especiais
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getLargura() {
		return largura;
	}

	public void setLargura(int largura) {
		this.largura = largura;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public Color getCor() {
		return cor;
	}

	public void setCor(Color cor) {
		this.cor = cor;
	}
	
	

}
