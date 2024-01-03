package br.dev.tiagogomes.chess;

import br.dev.tiagogomes.boardgame.Board;
import br.dev.tiagogomes.boardgame.Piece;

public class ChessPiece extends Piece {

    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
