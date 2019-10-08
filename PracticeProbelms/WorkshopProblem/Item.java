class Item{
  int item_id;
  String name;
  int price;
  int qty;

  String names[] = {"Muffler    ","BrakePads","LED Lamps","Sparkplug","Engine Oil"};
  int prices[] = {300,125,800,450,110};
  int qtys[] = {4,8,5,10,20};

  Item items[] = new Item[];
  int i = 0;
  for(Item item:items[]){
    item = new Item(i++);
  }

  Item(){
  }

  Item(int item_id){
    this.item_id = item_id;
    this.name = names[item_id];
    this.price = prices[item_id];
    this.qty = qtys[item_id];
  }

  void sell(int item_id,int qty){
    items[item_id].qty -= qty;
  }

  void buy(int item_id,int qty){
    items[item_id].qty += qty;
  }

  void displayAvailability(){
    System.out.println("Code of Part, Parts, Prices and Availability:");
    for(int i=0;i<5;i++){
      System.out.println(i+"\t"+items[i].name+"\t"+items[i].price+"\t"+items[i].qty);
    }
  }
}
