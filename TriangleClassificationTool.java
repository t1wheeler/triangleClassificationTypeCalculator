package main.java;

/**
 * Created by tlwheele on 2/12/2017.
 */
public class TriangleClassificationTool {

      public static String getTriangleClassification(String s1, String s2, String s3) {

        double side1 = Double.parseDouble(s1);
        double side2 = Double.parseDouble(s2);
        double side3 = Double.parseDouble(s3);

        TriangleTypes tri = new TriangleTypes(side1, side2, side3);

        // Determine what kind of triangle it is.
        if (tri.isEquilateral()) return "equilateral";
        else if (tri.isIsosceles()) return "isosceles";
        else if (tri.isScalene()) return "scalene";
        else if (tri.isTriangleInequality()) return "not a triangle";
        else return "None of the above";
    }

}
