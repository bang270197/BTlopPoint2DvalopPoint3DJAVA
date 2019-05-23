package com.company;

import javax.print.DocFlavor;

public class Point3D extends Point2D {
    private float z;

    public Point3D() {

    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        setX(x);
        setY(y);
        this.z = z;
    }

    public float[] getXYZ() {
        float[] arr_xyz = new float[3];
        arr_xyz[0] = super.getX();
        arr_xyz[1] = super.getY();
        arr_xyz[2] = this.z;
        return arr_xyz;
    }
    @Override
    public String toString(){
        return "x:"+getXYZ()[0]+"\n"+
                "y: "+getXYZ()[1]+"\n"+
                "z: "+getXYZ()[2];
    }

}
