//Write a Java program to join two array lists.
import java.util.*;
class TwoArrayList{
  public static void main(String args[]){
    List<Integer> ls1=new ArrayList<Integer>();
    ls1.add(12);
    ls1.add(45);
    ls1.add(34);
    ls1.add(21);
     System.out.println(ls1);
    List<Integer> ls2=new ArrayList<Integer>();
    ls2.add(23);
    ls2.add(57);
    ls2.add(25);
    ls2.add(32);
     System.out.println(ls2);
    List<Integer> twols=new ArrayList<Integer>(ls1);
    twols.addAll(ls2);
    System.out.println(twols);
  }
}