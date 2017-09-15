
/**
<<<<<<< HEAD
 * Write a description of class PiecePawn here.
=======
 * Write a description of class PieceKnight here.
>>>>>>> f6ec29a0ee5f105e5ca38edf2c8ccfc93c816201
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PieceKnight implements Piece
{
<<<<<<< HEAD
    public int[][] move() {
        return new int [3][1];
=======
    public MovementType movement() {
        return MovementType.L_SHAPE;
    }
    
    public boolean isOneDirection() {
        return false;
>>>>>>> f6ec29a0ee5f105e5ca38edf2c8ccfc93c816201
    }
    
    public boolean isUpgradable() {
        return true;
    }
    
    public ChessType setType() {
        return ChessType.KNIGHT;
    }
<<<<<<< HEAD
    
=======
>>>>>>> f6ec29a0ee5f105e5ca38edf2c8ccfc93c816201
}
