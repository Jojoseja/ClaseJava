package tictactoe;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	
	static void menu() {
		boolean menuB = true;
		do {
			System.out.println("Selecciona una opción");
			int input = sc.nextInt();	
			switch (input) {
			case 1:
				menuB = false;
				System.out.println("Bye");
				break;
			default:
				System.out.println("Nada");
			}
		} while (menuB);
	}
	
	static String[][] invArray(String[][] gameStatus) {
		String[][] gameStatus2 = Arrays.copyOf(gameStatus, gameStatus.length);

		for (int j = 0; j < gameStatus.length; j++) {
			for(int k = 0; k < gameStatus.length; k++) {
				gameStatus2[k][j] = gameStatus[j][k];
			}
		}
		return gameStatus2;
		
	}
	private static boolean winnerCheck(String[][] gameStatus) {
		boolean result = false;
		String[] valid1 = {"X","X","X"};
		String[] valid2 = {"O","O","O"};
		String[][] gameSta1 = gameStatus;
		for (String[] i : gameSta1) {
			if (Arrays.equals(i, valid1) || Arrays.equals(i, valid2)) {
				result = true;
			}
		}
		return result;
	}
	
	private static boolean checkValid(int input, String[][]gameStat) {
		String[][] gameStatus = gameStat;
		boolean result = true;
		switch(input) {
		case 1:
			if (gameStatus[0][0] == "X" || gameStatus[0][0] == "O") {
				result = false;
			}
			break;
		case 2:
			if (gameStatus[0][1] == "X" || gameStatus[0][1] == "O") {
				result = false;
			}
			break;
		case 3:
			if (gameStatus[0][2] == "X" || gameStatus[0][2] == "O") {
				result = false;
			}
			break;
		case 4:
			if (gameStatus[1][0] == "X" || gameStatus[1][0] == "O") {
				result = false;
			}
		case 5:
			if (gameStatus[1][1] == "X" || gameStatus[1][1] == "O") {
				result = false;
			}
			break;
		case 6:
			if (gameStatus[1][2] == "X" || gameStatus[1][2] == "O") {
				result = false;
			}
			break;
		case 7:
			if (gameStatus[2][0] == "X" || gameStatus[2][0] == "O") {
				result = false;
			}
			break;
		case 8:
			if (gameStatus[2][1] == "X" || gameStatus[2][1] == "O") {
				result = false;
			}
			break;
		case 9:
			if (gameStatus[2][2] == "X" || gameStatus[2][2] == "O") {
				result = false;
			}
			break;
		default:
			result = false;
			break;
		}
		return result;
		}
		
	static String[][] gameCreator(){
		String[][] a = {{"1","2","3"},{"4","5","6"},{"7","8","9"}};
		return a;
	}	
	static void gameStart() {
		String[][] game = gameCreator();
		int turn = 0;
		String wri;
		int input;
		boolean winner = true;
		if (!winnerCheck(game) || !winnerCheck(invArray(game))) {
			winner = false;
		}
			
		do {
			
			if (turn == 0) {
				System.out.println("Turno Player 1");
				wri = "X";
				turn = 1;
			} else {
				System.out.println("Turno Player 2");
				wri = "O";
				turn = 0;
			}
			do {
				System.out.println("Escribe donde quieres poner el:" + wri);
				pantalla(game);
				input = sc.nextInt();
				 }
			while (!checkValid(input,game));
			
			
			switch(input) {
			case 1:
				game[0][0] = wri;
				break;
			case 2:
				game[0][1] = wri;
				break;
			case 3:
				game[0][2] = wri;
				break;
			case 4:
				game[1][0] = wri;
				break;
			case 5:
				game[1][1] = wri;
				break;
			case 6:
				game[1][2] = wri;
				break;
			case 7:
				game[2][0] = wri;
				break;
			case 8:
				game[2][1] = wri;
				break;
			case 9:
				game[2][2] = wri;
				break;
			default:
				break;
				
			}
			
			}
		while(!winner);
		
	}
	
	static void pantalla(String[][] gamelist) {
		
		System.out.println("| " + gamelist[0][0] + " | " + gamelist[0][1] + " | " + gamelist[0][2] + " |");
		System.out.println("------------");
		System.out.println("| " + gamelist[1][0] + " | " + gamelist[1][1] + " | " + gamelist[1][2] + " |");
		System.out.println("------------");
		System.out.println("| " + gamelist[2][0] + " | " + gamelist[2][1] + " | " + gamelist[2][2] + " |");
	}
	
	
	public static void main(String[] args) {
		gameStart();
		System.out.println("Hello");
		//String [][] b  = {{"1","2","3"},{"4","5","6"},{"7","8","9"}}; 
		//String[][]a = invArray(b);
	}
}
