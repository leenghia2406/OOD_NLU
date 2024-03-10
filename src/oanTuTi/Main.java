package oanTuTi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {

    private RockPaperScissorsGame game;

    public Main() {
        super("Rock Paper Scissors Game");

        game = new RockPaperScissorsGame();

        JButton playButton = new JButton("Chơi");
        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startGame();
            }
        });

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(playButton, BorderLayout.CENTER);

        add(panel);

        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void startGame() {
        String input = JOptionPane.showInputDialog("Nhập số lần muốn chơi:");
        try {
            int numOfRounds = Integer.parseInt(input);
            game.playGame(numOfRounds);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập một số nguyên.");
        }
    }

    public static void main(String[] args) {
    	Main ma = new Main();
    	ma.setVisible(true);
    }
}

