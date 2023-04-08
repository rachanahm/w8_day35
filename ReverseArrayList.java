//Write a Java program to reverse elements in a array list.
import java.util.*;
class ReverseArrayList{
  public static void main(String args[]){
    List<Integer> ls=new ArrayList<Integer>();
    ls.add(12);
    ls.add(45);
    ls.add(34);
    ls.add(21);
    System.out.println(ls);
    Collections.reverse(ls);
    System.out.println(ls);
  }
}