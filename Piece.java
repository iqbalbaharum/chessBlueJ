
/**
 * Write a description of interface Piece here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface Piece
{    
    public int[][] move();
    public boolean isUpgradable();
    public ChessType setType();
}
