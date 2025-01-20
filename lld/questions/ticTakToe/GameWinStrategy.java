package Practice.lld.questions.ticTakToe;

public interface GameWinStrategy {
    public boolean isWin(Cell current, Cell[][] board);
}

class DefaultWinStrategy implements GameWinStrategy {

    public boolean isWin(Cell current, Cell[][] board) {
        return isRowSame(current, board) || isColSame(current, board) || isDiagonalSame(current, board)
                || isAntiDiagonalSame(current, board);
    }

    private boolean isAntiDiagonalSame(Cell current, Cell[][] board) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isAntiDiagonalSame'");
    }

    private boolean isColSame(Cell current, Cell[][] board) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isColSame'");
    }

    private boolean isRowSame(Cell current, Cell[][] board) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isRowSame'");
    }

    private boolean isDiagonalSame(Cell current, Cell[][] board) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isDiagonalSame'");
    }
}