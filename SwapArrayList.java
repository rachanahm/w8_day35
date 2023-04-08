//Write a Java program of swap two elements in an array list.
import java.util.*;
class SwapArrayList{
  public static void main(String args[]){
    List<Integer> ls=new ArrayList<Integer>();
    ls.add(12);
    ls.add(45);
    ls.add(34);
    ls.add(21);
    System.out.println(ls);
    Collections.swap(ls,1,2);
    System.out.println(ls);
  }
}