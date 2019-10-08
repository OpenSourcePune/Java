class Testing{
    public static void main(String args[]) {
    int l=args.length;
    int c=l/3;
    int j=0;
    Student obj[]=new Student[c];
    for (int i=0;i<c;i++){
      obj[i]=new Student();
      obj[i].init(Integer.parseInt(args[j++]),args[j++],Integer.parseInt(args[j++]));
      System.out.println("\nStudent "+(i+1)+" : \n");
      System.out.println (obj[i].reg);
      System.out.println (obj[i].name);
      System.out.println (obj[i].year);
    }
  }
}
