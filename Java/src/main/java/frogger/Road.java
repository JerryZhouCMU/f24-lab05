package frogger;

/**
 * Refactor Task 1.
 *
 * @author Zishen Wen (F22), Deyuan Chen (S22)
 */
public class Road {
    private final boolean[] occupied;

    public Road(boolean[] occupied) {
        this.occupied = occupied;
    }

    // Encapsulate access to occupied positions
    public boolean isOccupied(int position) {
        return position >= 0 && position < occupied.length && occupied[position];
    }

    // Encapsulate validation logic
    public boolean isValidPosition(int position) {
        return position >= 0 && position < occupied.length;
    }
}
