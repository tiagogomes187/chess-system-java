package br.dev.tiagogomes.chess.pieces;

import br.dev.tiagogomes.boardgame.Board;
import br.dev.tiagogomes.chess.ChessPiece;
import br.dev.tiagogomes.chess.Color;

public class Rook extends ChessPiece {
    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "R";
    }
}
