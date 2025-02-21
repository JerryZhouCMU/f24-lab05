package frogger;

/**
 * Refactor Task 1 & 2: Frogger
 *
 * @author Zishen Wen (F22), Deyuan Chen (S22), Duan Liang (F23)
 */
public class Frogger {
    private final Road road;
    private int position;
    private final Records records;
    private final FroggerID froggerID; // Replaces multiple identity fields

    public Frogger(Road road, int position, Records records, FroggerID froggerID) {
        this.road = road;
        this.position = position;
        this.records = records;
        this.froggerID = froggerID;
    }

    /**
     * Moves Frogger.
     *
     * @param forward true to move forward, false to move backward.
     * @return true if move successful, else false.
     */
    public boolean move(boolean forward) {
        int nextPosition = this.position + (forward ? 1 : -1);
        
        // Delegate to Road methods instead of directly accessing the array
        if (!road.isValidPosition(nextPosition) || road.isOccupied(nextPosition)) {
            return false;
        }

        this.position = nextPosition;
        return true;
    }

    /**
     * Records Frogger to the list of records.
     * 
     * @return true if record successful, else false.
     */
    public boolean recordMyself() {
        return records.addRecord(froggerID);
    }
}
