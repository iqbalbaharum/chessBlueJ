<<<<<<< HEAD

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
=======

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
>>>>>>> f6ec29a0ee5f105e5ca38edf2c8ccfc93c816201
