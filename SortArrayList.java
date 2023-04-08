//Write a Java program to sort a given array list
import java.util.*;
class SortArrayList{
  public static void main(String args[]){
    List<Integer> ls=new ArrayList<Integer>();
    ls.add(12);
    ls.add(45);
    ls.add(34);
    ls.add(21);
    Collections.sort(ls);
    System.out.println(ls);
  }
}