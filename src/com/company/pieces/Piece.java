package com.company.pieces;

public class Piece implements Cloneable {
    private boolean isKing  = false;
    private String _imgPath = "";

    private SquareColor              _color;
    private Square<Integer, Integer> _currPosition;

    Piece(int x, int y, SquareColor color) {
        _currPosition = new Square<Integer, Integer>(x, y, color);
        // TODO загрузить пикчу.
    }

    public boolean move(Square<Integer, Integer> newSquare) {
        if (newSquare.color() != _color || newSquare.isBusy()) {
            return false;
        }

        var x = Math.abs(_currPosition.x() - newSquare.x());
        var y = Math.abs(_currPosition.y() - newSquare.y());

        return x + y == 1 || (x + y == -1 && isKing);
    }

    public void setColor(SquareColor color) {
        _color = color;
    }

    public void setImgPath(String imgPath) {
        _imgPath = imgPath;
    }

    public SquareColor getColor() {
        return _color;
    }

    public String getImgPath() {
        return _imgPath;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
