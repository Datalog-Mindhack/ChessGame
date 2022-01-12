public abstract class Square{

    int squareCoordinate;
    
    Square(int squareCoordinate){
        this.squareCoordinate = squareCoordinate;
    }
    public abstract boolean issquareOccupied();
    
    public abstract Piece getPiece();

    public static final class EmptySquare extends Square{
       EmptySquare(int coordinate){
           super(coordinate);
       }
       @Override
       public boolean issquareOccupied(){
           return false;
       }
       @Override
       public Piece getPiece(){
           return null;
       }
    }
    public static final class OccupiedSquare extends Square {
        Piece pieceonSquare;
        OccupiedSquare(int squareCoordinate, Piece pieceonSquare){
            super(squareCoordinate);
            this.pieceonSquare = pieceonSquare;
        }
        @Override
        public boolean issquareOccupied(){
            return true;
        }
        @Override
        public Piece getPiece(){
            return null;
        }
    }
}