class Student{
  int reg_no;
  String name;
  int qty;
  Book book;
  Student(int reg_no,String name){
    this.reg_no = reg_no;
    this.name = name;
  }

  Student(int reg_no,String name,int qty, Book book){
    this.reg_no = reg_no;
    this.name = name;
    this.qty = qty;
    this.book = book;
  }

  void displayStudentInfo(){
    System.out.println("Reg no : "+reg_no);
    System.out.println("Name : "+name);
    try{
    System.out.println("Book Name : "+book.bookName);
  }catch(Exception e){
      System.out.println("No books yet.");
    }
  }
}
