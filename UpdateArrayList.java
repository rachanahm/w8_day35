//Write a Java program to update specific array element by given element
import java.util.*;
class UpdateArrayList{
  public static void main(String args[]){
    List<String> bird=new ArrayList<String>();
    bird.add("sparrow");
    bird.add("peacock");
    bird.add("owl");
    System.out.println(bird);
    String newName="parrot";
    bird.set(2,newName);
    for(String b:bird){
      System.out.println(b);
    }
    Collections.sort(bird);
    System.out.println(bird);
  }
  }
