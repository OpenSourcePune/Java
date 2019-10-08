import java.util.Scanner;
class Testing
{


	public static void main(String args[])
	{
		int choice;
		int total = 0;
		int j=0;
		int count=0;
		String a[] = new String[10];
		int q1[] = new int[10];
		int p1[] = new int[10];
		Dish m[] = new Dish[5];

		m[0] = new Dish(1, "Chorizzo",80);
		m[1] = new Dish(2, "Pizza   ",120);
		m[2] = new Dish(3, "Lasagna ",100);
		m[3] = new Dish(4, "Sphegetti",90);
		m[4] = new Dish(5, "Orange Juice",30);

		System.out.println("------------------------------------------------");
		System.out.println("\t##Lets take your order##\t\t");
		System.out.println("------------------------------------------------");
		System.out.println("Sno."+ "\tItem"+  "\t\t\t|Price");
		System.out.println("------------------------------------------------");
		for(int i=0; i<5; i++)
		{
			System.out.println(m[i].number +". \t"+ m[i].name +"\t\t"+m[i].price );
		}

		System.out.println("------------------------------------------------");
		do
		{
			Scanner scan = new Scanner(System.in);

			System.out.print("Enter item number: ");
			int order = scan.nextInt();

			System.out.print("Enter quantity: ");
			int q = scan.nextInt();

			q1[j] = q;
			p1[j] = q*m[order-1].price;
			total = total + (q*m[order-1].price);
			System.out.print("Do you want anything more? \nYes->1 and No->0 : ");
			choice = scan.nextInt();

			a[j] = m[order-1].name;
			j++;
			count++;
			if(choice == 1)
			{continue; }
			else
			{
				System.out.println("------------------------------------------------");
				System.out.println("Here's your bill of order ---");
				System.out.println("------------------------------------------------");
				System.out.println("Item."+ "\t\tQuantity"+  "\tPrice");
				System.out.println("------------------------------------------------");

				for(int k=0; k<count; k++)
				{
					System.out.println(a[k]+" \t"+q1[k]+ "\t\t "+ p1[k]);
				}
				System.out.println("------------------------------------------------");
				System.out.println("\t\tGrand Total "+"\t\t\t\t\t "+total);
				System.out.println("------------------------------------------------");
				break;
			}

		}while(choice != 0);
	}
}
