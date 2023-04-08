//Write a Java program to iterate through all elements in a array list
import java.util.*;
class IterateArrayList{
  public static void main(String args[])
  {
    List<String> colors=new ArrayList<String>();
    colors.add("Red");
    colors.add("blue");
    colors.add("violet");
    colors.add("black");
    System.out.println(colors);
    for(String color:colors){
      System.out.println(color);
    }
    }
  }
