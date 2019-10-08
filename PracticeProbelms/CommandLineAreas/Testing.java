import java.util.*;

class Testing{
  public static void main(String args[]){
    int i = 0;
    Area a = new Area();
    for(i=0;i<args.length;i++){
      try{
        Double.parseDouble(args[i]);
      }catch(Exception e){
        System.out.println("Wrong Input : "+e);
        System.exit(0);
      }
    }
    if (args.length == 0){

      a.calculateArea();
    }
    else if(args.length == 1){
      double s = Double.parseDouble(args[0]);
      a.calculateArea(s);
    }
    else if(args.length == 2){
      double l = Double.parseDouble(args[0]);
      double b = Double.parseDouble(args[1]);
      a.calculateArea(l,b);
    }
    else if(args.length == 3){
      double l = Double.parseDouble(args[0]);
      double b = Double.parseDouble(args[1]);
      double h = Double.parseDouble(args[2]);
      a.calculateArea(l,b,h);
    }
    else{
      System.out.println("Wrong input!");
    }
  }
}
