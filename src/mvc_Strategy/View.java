package mvc_Strategy;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;


public class View extends JFrame {
	JLabel inputLbl = new JLabel("Nhap so nguyen he DEC: ");
	JTextField inputTxf = new JTextField(20);
	JButton convertBinBtn = new JButton("Convert Bin");
	JButton convertOctBtn = new JButton("Convert Oct");
	JButton convertHexBtn = new JButton("Convert Hex");
	JLabel resultLbl = new JLabel("Result: ");
	JTextField resTxf = new JTextField();
	
	public View() {
		setTitle("Demo MVC Observer");
		JPanel mainPane = new JPanel();
		mainPane.setLayout(new BoxLayout(mainPane, BoxLayout.Y_AXIS));
		JPanel topPane = new JPanel();
		topPane.setLayout(new GridLayout(1, 2));
		topPane.add(inputLbl);
		topPane.add(inputTxf);
		topPane.setBorder(new EmptyBorder(0, 0, 10, 0));
		JPanel midPane = new JPanel(new GridBagLayout());
	    GridBagConstraints gbc = new GridBagConstraints();
	    gbc.weightx = 1;
	    gbc.fill = GridBagConstraints.HORIZONTAL;
	    gbc.insets = new Insets(0, 5, 0, 5); 
	    gbc.gridx = 0;
	    midPane.add(convertBinBtn, gbc);
	    gbc.gridx = 1;
	    midPane.add(convertOctBtn, gbc);
	    gbc.gridx = 2;
	    midPane.add(convertHexBtn, gbc);
		midPane.setBorder(new EmptyBorder(0, 0, 10, 0));
	    JPanel botPane = new JPanel(new GridBagLayout());
	    gbc = new GridBagConstraints();
	    gbc.weightx = 0.25; 
	    gbc.fill = GridBagConstraints.NONE;
	    gbc.insets = new Insets(0, 0, 0, 0);
	    gbc.gridx = 0;
	    botPane.add(resultLbl, gbc);
	    gbc.gridx = 1;
	    gbc.weightx = 1;
	    gbc.fill = GridBagConstraints.HORIZONTAL;
	    botPane.add(resTxf, gbc);
		mainPane.add(topPane);
		mainPane.add(midPane);
		mainPane.add(botPane);
		getContentPane().add(mainPane);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setResizable(false);
		setVisible(true);
	}
	public boolean validateInput() {
        if (inputTxf.getText().isEmpty()) {
            return false;
        }
        return true;
    }
	public static void main(String[] args) {
	    View view = new View();
	    Model model = new Model();
	    new Controller(model, view);
	}
}
