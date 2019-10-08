class Testing{
  public static void main(String args[]){
    Student s1 = new Student();
    s1.setData();

    Student s2 = new Student();
    s2.setData(119,"Rajat Pillai");

    Student s3 = new Student();
    s3.setData(s2);

    Student s4 = new Student();
    s4.setData(117,"Joshua Helix");

    Student s5 = new Student();
    s5 = s4;

    System.out.println("s1/"+s1.name+" "+s1.reg+"/"+s1);
    System.out.println("s2/"+s2.name+" "+s2.reg+"/"+s2);
    System.out.println("s3/"+s3.name+" "+s3.reg+"/"+s3);
    System.out.println("s4/"+s4.name+" "+s4.reg+"/"+s4);
    System.out.println("s5/"+s5.name+" "+s5.reg+"/"+s5);

    /*
    Points to observe --
    Although s2 and s3 have the same contents they have
    different addresses making them different objects
    s4 and s5 have the exact same contents and addresses
    making s5 something like a reference to s4
    s5 does not have any ownership, it simply refers
    to s4
    */
  }
}
