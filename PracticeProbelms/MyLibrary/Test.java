import java.util.*;

class Test{
  public static void main(String args[]){
    Library lib[] = new Library[5];
    lib[0] = new Library(5,new Book(100,"Theory of Evolution "));
    lib[1] = new Library(5,new Book(101,"Theory of Machines  "));
    lib[2] = new Library(5,new Book(102,"Information Tech    "));
    lib[3] = new Library(5,new Book(103,"First Man Standing  "));
    lib[4] = new Library(5,new Book(104,"Deep Learning Basics"));
    Student stu[] = new Student[3];
    stu[0] = new Student(500,"Darpan");
    stu[1] = new Student(501,"Akrita");
    stu[2] = new Student(502,"Janhvi");
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your roll number:");
    int rn = sc.nextInt();
    Student ss = stu[rn-500];
    System.out.println("Welcome to the library : ");
    int ch;
    do{
      System.out.println("Pick an option : 0. Check catalogue 1.Borrow 2.Return 3.Display Student info : ");
      ch = sc.nextInt();
      switch(ch){
        case 0:{
                for(Library l:lib){
                  l.displayContent();
                }
                break;
                }
        case 1:{
                if(ss.qty!=0){
                  System.out.println("Return previous book first");
                  break;
                }
                System.out.print("Enter the code of the book you want to borrow : ");
                int ch1 = sc.nextInt();
                ch1-=100;
                ss.qty+=1;
                ss.book = lib[ch1].book;
                lib[ch1].reduceBook();
                break;
                }
        case 2:{
                if(ss.qty==0){
                  System.out.println("You have no books to return!");
                  break;
                }
                int returncode = ss.book.bookCode-100;
                lib[returncode].increaseBook();
                ss.book=null;
                break;
                }
        case 3:{
                ss.displayStudentInfo();
                break;
                }
        case 4:{
                System.out.println("Visit again!");
                System.exit(0);
                break;
                }
        default:{
                System.out.println("Incorrect prompt!");
                }

      }
    }while(true);
  }
}
