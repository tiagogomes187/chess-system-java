package br.dev.tiagogomes.chess.pieces;

import br.dev.tiagogomes.boardgame.Board;
import br.dev.tiagogomes.chess.ChessPiece;
import br.dev.tiagogomes.chess.Color;

public class King extends ChessPiece {
    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "K";
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
        return mat;
    }
}
