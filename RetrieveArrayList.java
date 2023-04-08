//Write a Java program to retrieve an element (at a specified index) from a given array list.
import java.util.*;
class RetrieveArrayList{
  public static void main(String args[]){
    List<String> shape=new ArrayList<String>();
    shape.add("hexagon");
    shape.add("circle");
    shape.add("rectangle");
    System.out.println(shape);
    String element=shape.get(1);
    System.out.println(element);
  }
}