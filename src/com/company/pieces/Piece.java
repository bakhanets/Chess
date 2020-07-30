package com.company.pieces;

enum SquareColor {
    White,
    Black
}

class Square<F, S> {
    private F           _first;
    private S           _second;
    private SquareColor _color;
    private boolean     _isBusy;

    public Square(F first, S second, SquareColor color) {
        assert first  != null;
        assert second != null;

        _first  = first;
        _second = second;
        _color  = color;
        _isBusy = false;
    }

    public F x()               { return _first; }
    public S y()               { return _second; }
    public boolean isBusy()    { return _isBusy; }
    public SquareColor color() { return _color; }

    public void set(F first, S second) {
        _first  = first;
        _second = second;
    }

    public void set(F first, S second, SquareColor color, boolean isBusy) {
        _first  = first;
        _second = second;
        _color  = color;
        _isBusy = isBusy;
    }

    public void setBusy(boolean busy)       { _isBusy = busy; }
    public void setColor(SquareColor color) { _color = color; }
}

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
