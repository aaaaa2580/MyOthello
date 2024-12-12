package org.Othello;

import org.Othello.Game.ReversiGame;
import org.Othello.GUI.ReversiGUI;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int boardSize = 8;
        ReversiGame game = new ReversiGame(boardSize);
        ReversiGUI gui = new ReversiGUI(boardSize, game);
        gui.setVisible(true);
    }
}
