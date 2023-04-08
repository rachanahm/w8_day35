//Write a Java program to remove the third element from a array list
import java.util.*;
class RemoveArrayList{
  public static void main(String args[]){
    List<String> shape=new ArrayList<String>();
    shape.add("hexagon");
    shape.add("circle");
    shape.add("rectangle");
    shape.add("square");
    System.out.println(shape);
    shape.remove(3);
    System.out.println(shape);
  }
}