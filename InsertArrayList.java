//Write a Java program to insert an element into the array list at the first position
import java.util.*;
class InsertArrayList{
  public static void main(String args[]){
    List<String> shape=new ArrayList<String>();
    shape.add("hexagon");
    shape.add("circle");
    shape.add("rectangle");
    System.out.println(shape);
    shape.set(1,"pentagon");
    System.out.println(shape);
  }
}