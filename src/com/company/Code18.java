package com.company;

class Square{
    int side;

    public void SetSide(int side){
        this.side = side;
    }

    public int CalArea(){
        int area = side*side;
        return area;
    }

    public int CalPerimeter(){
        int perimeter = 4*side;
        return perimeter;
    }
}

public class Code18 {
    public static void main(String[] args) {
        Square obj = new Square();

        obj.SetSide(5);
        System.out.println("The area of circle is "+ obj.CalArea());
        System.out.println("and the perimeter is "+ obj.CalPerimeter());
    }
}
