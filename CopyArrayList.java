//Write a Java program to copy one array list into another
import java.util.*;
class CopyArrayList{
  public static void main(String args[]){
    List<Float> num=new ArrayList<Float>();
    num.add(12.3f);
    num.add(32.4f);
    num.add(45.6f);
    System.out.println(num);
    List<Float> Cnum=new ArrayList<Float>(num);
    System.out.println(Cnum);
  }
}