class Test{
  public static void main(String args[]){
    Item item = new Item();
    Purchase purchase = new Purchase();
    Sales sales = new Sales();

    item.displayAvailability();
    purchase.buy(4,3);
    item.displayAvailability();
  }
}
