import java.util.*;

class Dish{
  int code;
  int number;
  String name;
  int price;

  Dish(int c,int n){
    switch(c){
      case 1 :  name = "Chorizzo    ";
                price = 80;
                code = c;
                number = n;
                break;
      case 2 :  name = "Pizza       ";
                price = 120;
                code = c;
                number = n;
                break;
      case 3 :  name = "Lasagna     ";
                price = 100;
                code = c;
                number = n;
                break;
      case 4 :  name = "Sphegetti   ";
                price = 90;
                code = c;
                number = n;
                break;
      case 5 :  name = "Orange Juice";
                price = 30;
                code = c;
                number = n;
                break;
    }
  }
}
