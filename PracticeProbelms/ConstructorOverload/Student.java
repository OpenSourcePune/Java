class Student{
  int reg;
  String name;
  Student s = new Student();
  //Default constructor
  Student(){
    reg = 100;
    name = "Default Student";
  }
//Parametrised constructor
  Student(int r,String n){
    reg = r;
    name = n;
  }
//Copy constructor
  Student(Student s){
    reg = s.reg;
    name = s.name;
  }

}
