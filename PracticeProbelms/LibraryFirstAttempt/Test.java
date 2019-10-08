import java.util.Scanner;
class Test{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int choice;
		int sum = 0;
		int j=0;
		int count=0;
		int q1[]= new int[10];
		String a[] = new String[10];
		Book b[] = new Book[5];
		String s[] = new String[10];
		Student stu = new Student();

		b[0] = new Book(1, "Java");
		b[1] = new Book(2, "Machine Learning");
		b[2] = new Book(3, "App Development");
		b[3] = new Book(4, "Web Developemnt");
		b[4] = new Book(5, "Data Structures");

		s[0] = "100";
		s[1] = "101";
		s[2] = "102";
		s[3] = "103";
		s[3] = "104";
		for(int i=0; i<5; i++){
			System.out.println(b[i].number +". \t"+ b[i].name);
		}

		System.out.println("------------------------------------------------");

		System.out.println("Enter your registration number: ");
		String rag = scan.next();
		for(int f=0; f<s.length; f++){
			if(rag.compareTo(s[f])==0){
				do{
					System.out.println("Enter item number: ");
					int c = scan.nextInt();

					System.out.println("Enter quantity: ");
					int q = scan.nextInt();

					q1[j] = q;
					stu.quen = stu.quen+q;
					System.out.println("Do you want to issue more? \nYes->1 and No->0\n");
					choice = scan.nextInt();

					a[j] = b[c-1].name;
					j++;
					count++;
					if(choice == 1){continue; }
					else{
						for(int k=0; k<count; k++){
							System.out.println(b[k].name+" "+q1[k]);
						}

					}

				}while(choice != 0);
			break;}
		}
		System.out.println("Do you want to search? ");
		int se = scan.nextInt();
		if(se == 1){
			System.out.println("Enter registration number: ");
			int rega = scan.nextInt();
			System.out.println("Total Books issued: "+" "+stu.quen);
		}
	}
}
