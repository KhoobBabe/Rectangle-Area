package com.khubaib;

public class Rectangle {

    //initial value kept as 1 as asked
    double height = 1;
    double width = 1;

    //the no-arg constructor
    Rectangle() {
    }

    //the construcor which makes the rectangles
    Rectangle(double h, double w){
        height = h;
        width = w;
    }

    //the constructor which gets area
    double getArea(){
        return height * width;
    }

    //the constructor which gets perimeter
    double getPerimeter(){
        return 2*(height+width);
    }
}

class RectangleTesting{

    //main
    public static void main(String[] args) {

        //the rectangles declared and their values provided
        Rectangle rectangle_1 = new Rectangle(40, 4);//resctangle 1
        Rectangle rectangle_2 = new Rectangle(35.9, 3.5);//rectangle 2

        //output which gives the height, width, area and perimeter of the rectangle 1
        System.out.println("FOR RECTANGLE 1\n width: "+rectangle_1.width+"\n height: "+rectangle_1.height+"\n Area: "
                +rectangle_1.getArea()+"\n Perimeter: "+rectangle_1.getPerimeter() );

        System.out.println();

        //output which gives the height, width, area and perimeter of the rectangle 2
        System.out.println("FOR RECTANGLE 2\n width: "+rectangle_2.width+"\n height: "+rectangle_2.height+"\n Area: "
                +rectangle_2.getArea()+"\n Perimeter: "+rectangle_2.getPerimeter() );
    }
}

