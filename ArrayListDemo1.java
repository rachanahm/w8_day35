import java.util.*;
class ArrayListDemo1{
  public static void main(String args[]){
    List list=new ArrayList();
    Scanner sc=new Scanner(System.in);
    list.add(sc.next());
    list.add(sc.next());
    list.add(sc.next());
    System.out.println(list);
    for(Object obj:list){
      System.out.println(obj);
    }
  }
}