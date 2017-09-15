
/**
 * Write a description of class PiecePawn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PiecePawn implements Piece
{
    public int[][] move() {
        return new int [1][1];
    }
    
    public boolean isUpgradable() {
        return true;
    }
    
    public ChessType setType() {
        return ChessType.PAWN;
    }
    
}
