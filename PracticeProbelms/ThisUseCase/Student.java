class Student{

  String uni_name = "MUJ";
  int reg = 100;
  String name;

  Student(){
    reg = 100;
    name = "Default Student";
  }

  Student(String uni_name){
    this.uni_name = uni_name;
  }

  Student(String uni_name, String name){
    this(uni_name);
    this.name = name;
  }

  Student(String uni_name,String name,int reg){
    this(uni_name,name);
    this.reg = reg;
  }
}
