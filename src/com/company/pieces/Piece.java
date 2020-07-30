package com.company.pieces;

enum SquareColor {
    White,
    Black
}

class Square<F, S> {
    private F _first;
    private S _second;
    private SquareColor _color;

    public Square(F first, S second, SquareColor color) {
        assert first != null;
        assert second != null;

        this._first = first;
        this._second = second;
    }

    public F first()  { return _first; }
    public S second() { return _second; }

    public void set(F first, S second) {
        this._first = first;
        this._second = second;
    }
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

    public boolean move(int newX, int newY, SquareColor newSquareColor) {
        if (newSquareColor == _color) {
            return false;
        }

        return false;
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
