
/**
 * Write a description of interface Piece here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface Piece
{
    public MovementType movement();
    public boolean isOneDirection();
    public boolean isUpgradable();
    public ChessType setType();
}
