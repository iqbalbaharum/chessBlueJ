
/**
 * Write a description of class Game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game
{
    public int[][] gameBoard;
    public Piece[][] whitePieces;
    public Piece[][] blackPieces;
    
    public boolean isWhiteTurn;
    
    /**
     * Constructor for objects of class Game
     */
    public Game(){
        Board board = new Board();
        gameBoard = board.generator();
        whitePieces = new Piece[gameBoard.length][gameBoard.length];
        blackPieces = new Piece[gameBoard.length][gameBoard.length];
    }
    
    public void newGame() {
        whiteStartPosition();
        blackStartPosition();
        
        isWhiteTurn = true;
    }
    
    /***
     * initialise white pieces position
     */
    private void whiteStartPosition() {
        
        for(int x=0; x < gameBoard.length; x++){
            for(int y=0; y < gameBoard[x].length; y++){
                
                if(x == 1) {
                    whitePieces[x][y] = new PiecePawn();
                }
            }
        }
    }
    
    /***
     * initialise black pieces position
     */
    private void blackStartPosition(){
        
        for(int x=0; x < gameBoard.length; x++){
            for(int y=0; y < gameBoard[x].length; y++){
                
                if(x == (gameBoard.length - 2)) {
                    whitePieces[x][y] = new PiecePawn();
                }
            }
        }
    }
    
    private boolean turn(int[][] currentPos, int[][] newPos) {
        
        if(isWhiteTurn) {
            // What to do
        }
        
        isWhiteTurn = !isWhiteTurn;
        
        return false;
    }
}
