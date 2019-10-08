class Area{
  double side1 = 2;
  double side2;
  double side3;

  //No parameters
  void calculateArea(){
    System.out.println("Area of the Circle is "+(side1*side1*Math.PI));
  }
  //One parameter
  void calculateArea(double side){
    side1 = side;
    System.out.println("Area of the Square is "+(side1*side1));
  }
  //Two parameter
  void calculateArea(double len, double wid){
    side1 = len;
    side2 = wid;
    System.out.println("Area of the Rectangle is "+(side1*side2));
  }
  //Three parameter
  void calculateArea(double len,double wid,double dep){
    side1 = len;
    side2 = wid;
    side3 = dep;
    System.out.println("Area of the Cuboid is "+(side1*side2 + side2*side3 + side3*side1));
  }


}
