import java.util.*;
class ArrayListDemo{
  public static void main(String args[]){
    List list=new ArrayList();
    list.add("rachana");
    list.add("ec");
    list.add(18);
    System.out.println(list);
    for(Object obj:list){
      System.out.println(obj);
    }
  }
  
}