package graficos;

// Osman Ferrer. C.I. 28.271.330. 03/06/23. Computacion Grafica.

import java.awt.Toolkit;
import java.awt.Dimension;

import javax.swing.JFrame;

public class CreandoMarcoCentrado {

	public static void main(String[] args) {
		
		MarcoCentrado miMarco = new MarcoCentrado();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		miMarco.setVisible(true);
	}

}

class MarcoCentrado extends JFrame {
	public MarcoCentrado(){
		
		Toolkit miPantalla = Toolkit.getDefaultToolkit();
		
		Dimension tamanoPantalla = miPantalla.getScreenSize();
		
		int alturaPantalla = tamanoPantalla.height;
		
		int anchoPantalla = tamanoPantalla.width;
		
		setSize(anchoPantalla/2, alturaPantalla/2);
		
		setLocation(anchoPantalla/4, alturaPantalla/4);
		
	}
}