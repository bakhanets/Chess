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
