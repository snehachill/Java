public class Interfaces {
    public static void main(String[] args) {
        Queen q=new Queen();
        q.move();

        Rook r=new Rook();
        r.move();
    }
    
}
interface chessPlayer{
    void move();
}

class Queen implements chessPlayer{
    public void move(){
        System.out.println("Queen can move in any direction");
    }
}

class Rook implements chessPlayer{
    public void move(){
        System.out.println("Rook can move in straight lines");
    }
}

class Bishop implements chessPlayer{
    public void move(){
        System.out.println("Bishop can move diagonally");
    }
}
