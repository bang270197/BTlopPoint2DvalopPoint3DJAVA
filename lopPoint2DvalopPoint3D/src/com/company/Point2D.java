package com.company;

public class Point2D {
    private float x;
    private float y;

    public Point2D() {

    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setxy(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getxy() {
        float[] arr_xy = new float[2];
        arr_xy[0] = x;
        arr_xy[1] = y;
        return arr_xy;
    }
    @Override
    public String toString(){
        return "x: "+getxy()[0]+"\n"+
                "y: "+getxy()[1]+"\n\n";
    }
}
