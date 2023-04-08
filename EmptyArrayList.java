//Write a Java program to empty an array list.
import java.util.*;
class EmptyArrayList{
  public static void main(String args[]){
    List<String> shape=new ArrayList<String>();
    shape.add("hexagon");
    shape.add("circle");
    shape.add("rectangle");
    shape.add("square");
    System.out.println(shape);
    shape.clear();
    System.out.println(shape);
  }
}