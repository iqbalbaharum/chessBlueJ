
/**
 * Write a description of class PiecePawn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PieceKnight implements Piece
{
    public int[][] move() {
        return new int [3][1];
    }
    
    public boolean isUpgradable() {
        return true;
    }
    
    public ChessType setType() {
        return ChessType.KNIGHT;
    }
    
}
