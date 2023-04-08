//Write a Java program to extract a portion of a array list.
import java.util.*;
class ExtractArrayList{
  public static void main(String args[]){
    List<Integer> ls=new ArrayList<Integer>();
    ls.add(12);
    ls.add(45);
    ls.add(34);
    ls.add(21);
    System.out.println(ls);
    List<Integer> subList=new ArrayList<Integer>(ls.subList(1,2));
    System.out.println(subList);
  }
}