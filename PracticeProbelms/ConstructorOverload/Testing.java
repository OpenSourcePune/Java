class Testing{
  public static void main(String args[]){
    Student s1 = new Student();
    Student s2 = new Student(117,"Sattvik Pandit");
    Student s3 = new Student(s2);
    Student s4 = s3;

    System.out.println("s1/"+s1.name+" "+s1.reg+"/"+s1);
    System.out.println("s2/"+s2.name+" "+s2.reg+"/"+s2);
    System.out.println("s3/"+s3.name+" "+s3.reg+"/"+s3);
    System.out.println("s4/"+s4.name+" "+s4.reg+"/"+s4);
  }
}
