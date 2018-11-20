package it.marconicivitavecchia.as2018_19.c5Binf.verifica;

import javax.swing.*;

public class Main extends JFrame {
	
	public Main() {
		super("Formula 1 Passion");
		super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		// TODO Inserire la size in accordo con il wireframe (valori approssimati)
		super.setSize(300,500);
		
		// TODO Usare StringBuilder per costruire la stringa HTML
		StringBuilder sb= new StringBuilder();
		sb.append("<html>");
		
		//titolo
		sb.append("<h1>Live the Company</h1>");
		
		// TODO Creare la stringa HTML per il wireframe
		sb.append("<table><tr>");//creazione della tabella
		sb.append("<th><h3>Evento</h3></th><th><h3>Data</h3></th><th><h3>Vado?</h3></th></tr>");
		sb.append("<tr><td>Cocktail party</td><td>7 dic</td><td>Sì</td></tr>");		
		sb.append("<tr><td>Colazione sociale</td><td>12 dic</td><td>Sì</td></tr>");
		sb.append("<tr><td>Saluti di Natale</td><td>23 dic</td><td>No</td></tr>");	
		sb.append("</table>");
		
		// TODO Convertire lo StringBuilder in String+
		String htmlText=sb.toString();
		
		// TODO Assegnare correttamente la stringa create a JLabel
		super.add(new JLabel(htmlText));
		super.setVisible(true);
		 
		System.out.println("Verifica Swing-GitHub");
		
		
	}
	
	public static void main (String[] args) {
		new Main();
	}
}

