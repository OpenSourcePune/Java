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
    Scanner sc2 = new Scanner(System.in);
    System.out.println("Now, let's get your order --");

    int[][] itemsAndCodes = new int[20][2];
    int i=0,j=0,NumberOfItems=0;
    int flag;
    int total = 0;

    do{
      System.out.print("Enter Item Id : ");
      itemsAndCodes[i][j++] = sc.nextInt();
      System.out.print("Enter number of these you want to order : ");
      itemsAndCodes[i++][j] = sc1.nextInt();
      System.out.println("Do you want to order anything more?");
      System.out.print("1=YES 0=NO : ");
      flag = sc2.nextInt();
      NumberOfItems++;
      j=0;
    }while(flag==1);
    //System.out.println("k"+k);
    System.out.println("\n\n\n\n");
    System.out.println("----------------------------------------------------------");
    System.out.println("Here is your bill of order -- ");
    System.out.println("----------------------------------------------------------");
    System.out.println("Item Id \tDish-Name\tRate \tNumber \t Amount");
    System.out.println("----------------------------------------------------------");
    for(i=0;i<NumberOfItems;i++){
        Dish dish = new Dish(itemsAndCodes[i][j++],itemsAndCodes[i][j]);
        System.out.println(dish.code+"\t\t"+dish.name+"\t "+dish.price+"\t  "+dish.number+"\t  "+(dish.number * dish.price));
        total += (dish.number * dish.price);
        j--;
    }
    System.out.println("----------------------------------------------------------");
    System.out.println("\t\tGRAND TOTAL FOR "+NumberOfItems+" ITEMS :\t  "+total);
    System.out.println("----------------------------------------------------------");

    // Dish dish = new Dish(4,2);
    // System.out.print(dish.price+"/"+dish.name+"/"+dish.code+"/"+dish.number);
  }
}
