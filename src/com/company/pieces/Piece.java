package com.company.pieces;

class Pair<F, S> {
    private F first;
    private S second;

    public Pair(F first, S second) {
        assert first != null;
        assert second != null;

        this.first = first;
        this.second = second;
    }

    public F first() { return first; }
    public S second() { return second; }

    public void set(F first, S second) {
        this.first = first;
        this.second = second;
    }
}

public abstract class Piece implements Cloneable {
    Piece(int x, int y) {
        _currPosition = new Pair<Integer, Integer>(x, y);
    }

    public boolean move(int x, int y) {
        // TODO: move logic

        return false;
    }

    public void setColor(int color) {
        _color = color;
    }

    public void setImgPath(String imgPath) {
        _imgPath = imgPath;
    }

    public int getColor() {
        return _color;
    }

    public String getImgPath() {
        return _imgPath;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    private int _color = 0;
    private String _imgPath = "";
    private Pair<Integer, Integer> _currPosition;
    private boolean isKing = false;
}

