package oanTuTi;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {
	private int playerWins;
	private int computerWins;
	private int draws;
	public RockPaperScissorsGame() {
		super();
		this.playerWins = 0;
		this.computerWins = 0;
		this.draws = 0;
	}
	private String getPlayerChoice() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Chọn keo, bua, bao: ");
		return sc.nextLine();
	}
	private String getComputerChoice() {
		String[] choices = {"keo", "bua", "bao"};
		Random ran = new Random();
		int index = ran.nextInt(choices.length);
		return choices[index];
	}
	private void determineWinner(String playerChoice, String computerChoice) {
		if (playerChoice.equals(computerChoice)) {
			draws++;
			System.out.println("Hòa");
		}else if((playerChoice.equals("keo")&& computerChoice.equals("bao")) ||
				(playerChoice.equals("bua")&& computerChoice.equals("keo")) ||
				(playerChoice.equals("bao")&& computerChoice.equals("bua"))) {
			playerWins++;
			System.out.println("Người chơi thắng");
		}else {
			computerWins++;
			System.out.println("Máy tính thắng");
		}
	}
	private void displayFinalResult() {
		System.out.println("Kết quả cuối cùng: ");
		System.out.println("Số lần người thắng: " + playerWins);
        System.out.println("Số lần máy thắng: " + computerWins);
        System.out.println("Số lần hòa: " + draws);
        if (playerWins > computerWins) {
            System.out.println("Người chơi thắng ván chơi!");
        } else if (computerWins > playerWins) {
            System.out.println("Máy tính thắng ván chơi!");
        } else {
            System.out.println("Kết quả cuối cùng là hòa!");
        }
	}
	public void playGame(int numOfRows) {
		for (int i = 0; i < numOfRows; i++) {
			String playerChoice = getPlayerChoice();
			String computerChoice = getComputerChoice();
			System.out.println("Người chơi chọn: "+ playerChoice);
			System.out.println("Máy tính chọn: "+ computerChoice);
			determineWinner(playerChoice, computerChoice);
		}
		displayFinalResult();
	}
	public static void main(String[] args) {
		RockPaperScissorsGame game = new RockPaperScissorsGame();
		game.playGame(3);
	}
	
	
}

