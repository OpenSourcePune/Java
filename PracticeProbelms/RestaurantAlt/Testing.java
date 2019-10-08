import java.util.*;
import java.util.Scanner;
class Testing{
  public static void main(String args[]){
    System.out.println("Here is the menu card -- ");
    System.out.println("--------------------------------------");
    System.out.println("Item Id \tDish Name\tRate");
    System.out.println("--------------------------------------");
    System.out.println("1 \t\tChorizzo\t80");
    System.out.println("2 \t\tPizza   \t120");
    System.out.println("3 \t\tLasagna \t100");
    System.out.println("4 \t\tSphegetti\t90");
    System.out.println("5 \t\tOrange Juice\t30");
    System.out.println("--------------------------------------");
    Scanner sc = new Scanner(System.in);
    Scanner sc1 = new Scanner(System.in);
    System.out.println("Now, let's get your order --");
    System.out.print("Enter number of items you want to order (1-5) : ");
    int NumberOfItems = sc.nextInt();
    //System.out.println(NumberOfItems);
    int[][] itemsAndCodes = new int[NumberOfItems][2];
    int i,j;
    int total = 0;
    for(i=0;i<NumberOfItems;i++){
      for(j=0;j<2;j++){
        System.out.print("Enter Item Id : ");
        itemsAndCodes[i][j++] = sc.nextInt();
        System.out.print("Enter number of these you want to order : ");
        itemsAndCodes[i][j] = sc1.nextInt();
      }
    }
      System.out.println("\n\n\n\n");
    // for(i=0;i<NumberOfItems;i++){
    //   for(j=0;j<2;j++){
    //     System.out.print(itemsAndCodes[i][j++]+" ");
    //     System.out.println(itemsAndCodes[i][j]);
    //   }
    // }
    System.out.println("----------------------------------------------------------");
    System.out.println("Here is your bill of order -- ");
    System.out.println("----------------------------------------------------------");
    System.out.println("Item Id \tDish-Name\tRate \tNumber \t Amount");
    System.out.println("----------------------------------------------------------");
    for(i=0;i<NumberOfItems;i++){
      for(j=0;j<2;j++){
        Dish dish = new Dish(itemsAndCodes[i][j++],itemsAndCodes[i][j]);
        System.out.println(dish.code+"\t\t"+dish.name+"\t "+dish.price+"\t  "+dish.number+"\t  "+(dish.number * dish.price));
        total += (dish.number * dish.price);
      }
    }
    System.out.println("----------------------------------------------------------");
    System.out.println("\t\tGRAND TOTAL FOR "+NumberOfItems+" ITEMS :\t  "+total);
    System.out.println("----------------------------------------------------------");

    // Dish dish = new Dish(4,2);
    // System.out.print(dish.price+"/"+dish.name+"/"+dish.code+"/"+dish.number);
  }
}
