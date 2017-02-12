package main.java;

/**
 * Created by tlwheele on 2/12/2017.
 */
public class TriangleTypes {

    // Stores the length of each side of the TriangleTypes object.
    private double side1, side2, side3;

    // Constructor to initialize the sides of the triangle.
    public TriangleTypes(double s1, double s2, double s3) {
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }

    //Check for equilateral triangle.
    public boolean isEquilateral() {
        if ((side1 == side2) && (side1 == side3))
            return true;
        else
            return false;
    }

    //Check for an isosceles triangle.
    public boolean isIsosceles() {
        if (((side1 == side2) && (side1 != side3)) ||
                ((side1 == side3) && (side1 != side2)) ||
                ((side2 == side3) && (side2 != side1)))
            return true;
        else
            return false;
    }

    //Check for a scalene triangle.
    public boolean isScalene() {
        if ((side1 != side2) && (side1 != side3) && (side2 != side3))
            return true;
        else
            return false;
    }

    //Check for triangle inequality
    public boolean isTriangleInequality(){
        if(side1 >= (side2+side3) || side3 >= (side2+side1) || side2 >= (side1+side3)){
            return true;
        }
        return false;
    }
}
