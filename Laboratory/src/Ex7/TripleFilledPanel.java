package Ex7;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class TripleFilledPanel extends JPanel{
	public TripleFilledPanel(int nBorder1, int wBorder1, int sBorder1, int eBorder1, Color fillColor1,
		int nBorder2, int wBorder2, int sBorder2, int eBorder2, Color borderColor2, Color fillColor2) {
		this.setLayout(new BorderLayout());
//		this.setSize(500,500);
		Border emptyBorder = BorderFactory.createEmptyBorder(nBorder1, wBorder1, sBorder1, eBorder1);
		this.setBorder(emptyBorder);
		this.setBackground(fillColor1);
		
		JPanel innerJPanel1 = new JPanel();
		Border emBorder = BorderFactory.createEmptyBorder(nBorder2, wBorder2, sBorder2, eBorder2);
		innerJPanel1.setBackground(borderColor2);
		innerJPanel1.setBorder(emBorder);
		innerJPanel1.setLayout(new BorderLayout());
		
		JPanel innerJPanel2 = new JPanel();
		innerJPanel2.setBackground(fillColor2);
		innerJPanel1.add(innerJPanel2);
		this.add(innerJPanel1);
		
	}

}


