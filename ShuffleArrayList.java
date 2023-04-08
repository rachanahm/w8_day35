//Write a Java program to shuffle elements in a array list
import java.util.*;
class ShuffleArrayList{
  public static void main(String args[])
  {
    List<String> colors=new ArrayList<String>();
    colors.add("Red");
    colors.add("blue");
    colors.add("violet");
    colors.add("black");
    System.out.println(colors);
    Collections.shuffle(colors);
    System.out.println(colors);
    }
  }