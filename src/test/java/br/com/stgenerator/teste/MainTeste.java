package br.com.stgenerator.teste;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import br.com.stgenerator.IGenerator;
import br.com.stgenerator.util.ModeloCarta;

public class MainTeste {

	public static void main(String args[]) throws IOException{
		System.out.println("begin test");
		
		IGenerator i = new IGenerator(ModeloCarta.Modelo1);
		
		i.escreveTitulo("Sam� Ni Chan","red", "Times New Roman");
		i.escreveAtributo1("Nivel Capada", "100%", "black", "Times New Roman");
		i.escreveAtributo2("Ano Ingresso", "2010", "black", "Times New Roman");
		i.escreveAtributo3("Nivel Fala��o de Merda", "95%", "black", "Times New Roman");
		i.escreveAtributo4("Nivel Real de intelig�ncia", "15", "black", "Times New Roman");
		i.escreveAtributo5("Nivel Aparente de Intelig�ncia", "10", "black", "Times New Roman");
		i.setNumeracao("black", "1-A");
		
		File principal = new File("c:/sama.jpg");
		BufferedImage imgp = ImageIO.read(principal);
		
		i.setImagemPrincipal(imgp);
		
		ImageIO.write(i.getImg(), "jpg", new File("c:/SamaNiChan.jpg"));
		
		System.out.println("hehe");
		i = new IGenerator(ModeloCarta.Modelo1);
		
		i.escreveTitulo("Sam� Ni Chan San Aprimorado","red", "Times New Roman");
		i.escreveAtributo1("Nivel Capada", "200%", "black", "Times New Roman");
		i.escreveAtributo2("Ano Ingresso", "2000", "black", "Times New Roman");
		i.escreveAtributo3("Nivel Fala��o de Merda", "1000%", "black", "Times New Roman");
		i.escreveAtributo4("Nivel Real de intelig�ncia", "8000+", "black", "Times New Roman");
		i.escreveAtributo5("Nivel Aparente de Intelig�ncia", "500", "black", "Times New Roman");
		i.setNumeracao("black", "2-A");
		
		principal = new File("c:/sama.jpg");
		imgp = ImageIO.read(principal);
		
		i.setImagemPrincipal(imgp);
		
		ImageIO.write(i.getImg(), "jpg", new File("c:/samaAprimorado.jpg"));
		
		System.out.println("Sucesso");
	}
	
}
