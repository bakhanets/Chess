package com.company.pieces;

public abstract class Piece implements Cloneable {
    public void move(int x, int y) {
        // TODO: move logic
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

    private int _color;
    private String _imgPath;
}

