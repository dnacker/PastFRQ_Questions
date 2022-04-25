package Q4;

import java.util.ArrayList;

/**
 * Question 4
 */
public class TileGame {
    /** represents the game board; guaranteed never to be null */
    private ArrayList<NumberTile> board;

    public TileGame() {
        board = new ArrayList<NumberTile>();
    }

    public TileGame(ArrayList<NumberTile> b) {
        board = b;
    }

    /** Determines where to insert tile, in its current orientation, into game board
     * @param tile the tile to be placed on the game board
     * @return the position of tile where tile is to be inserted:
     * 0 if the board is empty;
     * -1 if tile does not fit in front, at end, or between any existing tiles;
     * otherwise, 0 ≤ position returned ≤ board.size()
     */
    public int getIndexForFit(NumberTile tile) {
        if (board.isEmpty() || (board.get(0).getLeft() == tile.getRight())) {
            return 0;
        }
        if (board.get(board.size() - 1).getRight() == tile.getLeft()) {
            return board.size();
        }
        for (int i = 0; i < board.size() - 1; i++) {
            NumberTile left = board.get(i);
            NumberTile right = board.get(i + 1);
            if (left.getRight() == tile.getLeft() && right.getLeft() == tile.getRight()) {
                return i + 1;
            }
        }
        return -1;
    }

    /** Places tile on the game board if it fits (checking all possible tile orientations if necessary).
     * If there are no tiles on the game board, the tile is placed at position 0.
     * The tile should be placed at most 1 time.
     * Precondition: board is not null
     * @param tile the tile to be placed on the game board
     * @return true if tile is placed successfully; false otherwise
     * Postcondition: the orientations of the other tiles on the board are not changed
     * Postcondition: the order of the other tiles on the board relative to each other is not changed
     */
    public boolean insertTile(NumberTile tile) {
        for (int i = 0; i < 4; i++) {
            int indexToAdd = getIndexForFit(tile);
            if (indexToAdd != -1) {
                board.add(indexToAdd, tile);
                return true;
            } else {
                tile.rotate();
            }
        }
        return false;
    }

    //IGNORE CODE BELOW (for testing purposes)
    public String toString() {
        return board.toString();
    }
}
