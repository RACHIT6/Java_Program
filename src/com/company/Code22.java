package com.company;
import java.lang.Math.*;

class Cylinder{
    private int radius;
    private int height;

//    Setters
    public void SetRadius(int r){
        radius = r;
    }
    public void SetHeight(int h){
        height = h;
    }

//    Getters
    public int GetRadius(){
        return radius;
    }
    public int GetHeight(){
        return height;
    }

    public float GetSurfaceArea(){
        float A = (float) ((2* Math.PI* GetRadius()* GetHeight()) + (2* Math.PI* Math.pow(GetRadius(), 2)));
        return A;
    }

    public float GetVolume(){
        float Volume = (float) (Math.PI * Math.pow(GetRadius(), 2)* GetHeight());
        return Volume;
    }
}

public class Code22 {
    public static void main(String[] args) {
        Cylinder obj = new Cylinder();

        obj.SetRadius(3);
        obj.SetHeight(5);

        System.out.printf("The height and radius of Cylinder is %d and %d\n", obj.GetHeight(), obj.GetRadius());
        System.out.printf("The area and volume of cylinder is %f and %f", obj.GetSurfaceArea(), obj.GetVolume());
    }
}
