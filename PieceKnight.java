
/**
 * Write a description of class PieceKnight here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PieceKnight implements Piece
{
    public MovementType movement() {
        return MovementType.L_SHAPE;
    }
    
    public boolean isOneDirection() {
        return false;
    }
    
    public boolean isUpgradable() {
        return true;
    }
    
    public ChessType setType() {
        return ChessType.KNIGHT;
    }
}
