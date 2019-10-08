import java.util.*;

class Student{
  int reg;
  String name;

  //Student s = new Student();

  void setData(){
    reg = 101;
    name = "Default Student";
  }

  void setData(int r, String n){
    reg = r;
    name = n;
  }

  void setData(Student s){
    reg = s.reg;
    name = s.name;
  }
}
