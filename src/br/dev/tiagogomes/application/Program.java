package br.dev.tiagogomes.application;

import br.dev.tiagogomes.boardgame.Board;
import br.dev.tiagogomes.boardgame.Position;
import br.dev.tiagogomes.chess.ChessMatch;

public class Program {
    public static void main(String[] args) {

        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
    }
}
