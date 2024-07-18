public class Interfaces {
    public static void main(String args[]) {
        Queen q = new Queen();
        q.moves();

    }
    
}

interface ChessPlayer {
    void moves();//abstraction was implemented as the moves were not defined in the main interface but by each class itself
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("left, right, forward, backward, diagonal(in all 4 directions)");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("left, right, forward, backward");
    }

}

class King implements ChessPlayer {
    public void moves() {
        System.out.println("left, right, forward, backward, diagonal(by 1 step)");
    }

}

