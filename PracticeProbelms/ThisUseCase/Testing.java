class Testing{
  public static void main(String args[]){
    Student s1 = new Student();
    Student s2 = new Student("PVSM","Akshay Trivedi");
    Student s3 = new Student("MUJ","Gautam Buddha",117);
    Student s4 = new Student("GUI","Theo Maxim",121);
    Student s5 = new Student("JUQ","Jabralis Xavier",127);
    s5 = s3;
    System.out.println("s1/"+s1.uni_name+"/"+s1.reg+"/"+s1.name+"/"+s1);
    System.out.println("s2/"+s2.uni_name+"/"+s2.reg+"/"+s2.name+"/"+s2);
    System.out.println("s3/"+s3.uni_name+"/"+s3.reg+"/"+s3.name+"/"+s3);
    System.out.println("s4/"+s4.uni_name+"/"+s4.reg+"/"+s4.name+"/"+s4);
    System.out.println("s5/"+s5.uni_name+"/"+s5.reg+"/"+s5.name+"/"+s5);
  }
}
