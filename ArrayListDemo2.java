import java.util.*;
class ArrayListDemo2{
  public static void main(String args[]){
    List<Integer> list=new ArrayList<Integer>();
    Scanner s=new Scanner(System.in);
    list.add(12);
    list.add(22);
    list.add(14);
    System.out.println(list);
    for(Integer i:list){
      System.out.println(i);
    }
  }
}
    