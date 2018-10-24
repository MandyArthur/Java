class ChessPiece {
    String color;
    int startingPosition;
}
class Pawn extends ChessPiece {
    int forwardMovement = 1;
    int sideMovement = 0;
}
class Knight extends ChessPiece {
    int forwardMovement;
    int sideMovement;
}
class Rook extends ChessPiece {
    int forwardMovement;
    int sideMovement;
}
class Bishop extends ChessPiece {
    int forwardMovement;
    int sideMovement;
}
class Queen extends ChessPiece {
    int forwardMovement;
    int sideMovement;
}
class King extends ChessPiece {
    int forwardMovement = 1;
    int sideMovement = 1;
}
