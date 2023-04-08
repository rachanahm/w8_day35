//Write a Java program to search an element in a array list.
import java.util.*;
class SearchArrayList{
  public static void main(String args[]){
    List<Integer> ls=new ArrayList<Integer>();
    ls.add(12);
    ls.add(45);
    ls.add(34);
    ls.add(21);
    for(Integer i:ls){
      System.out.println(i);
    }
    boolean found=ls.contains(34);
    if(found){
      System.out.println("element is found");
    }
    else{
      System.out.println("not found");
    }
  }
}