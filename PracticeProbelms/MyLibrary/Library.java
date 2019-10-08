class Library{
  int qty;
  Book book;
  Library(int qty, Book book){
    this.qty = qty;
    this.book = book;
  }

  void displayContent(){
    System.out.println(this.qty+" "+this.book.bookCode+" "+this.book.bookName);
  }

  void reduceBook(){
    this.qty -= 1;
  }

  void increaseBook(){
    this.qty += 1;
  }
}
