import java.util.*;
class ArrayListDemo4{
  public static void main(String args[]){
    List<String>fruit=new ArrayList<String>();
    fruit.add("apple");
    fruit.add("watermelon");
    fruit.add("pineapple");
    fruit.add("strawberry");
    int count=0,index=0;
    for(String str:fruit){
      if(str.equals("apple")){
        count++;
        index=fruit.indexOf("apple");
        break;
      }
    }
    if(count==1){
        System.out.println("found at the position:"+index); 
      }
      else{
        System.out.println("not found");
      }
    }
    
    
  }
