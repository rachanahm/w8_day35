import java.util.*;
class ArrayListDemo5{
  public static void main(String args[]){
    List<Integer> list=new ArrayList<Integer>();
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<5;i++){
      list.add(sc.nextInt());
    }
     for(Integer num:list){
       if(num%2==0){
         System.out.println(num);
       }
     }
      }
    }
  