<<<<<<< HEAD

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
=======

/**
 * Write a description of class PiecePawn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PiecePawn implements Piece
{
    public MovementType movement() {
        return MovementType.STRAIGHT;
    }
    
    public boolean isOneDirection() {
        return false;
    }
    
    public boolean isUpgradable() {
        return true;
    }
    
    public ChessType setType() {
        return ChessType.PAWN;
    }
}
>>>>>>> f6ec29a0ee5f105e5ca38edf2c8ccfc93c816201
