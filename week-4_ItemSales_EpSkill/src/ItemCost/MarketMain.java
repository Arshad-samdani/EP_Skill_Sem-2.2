package ItemCost;

import java.sql.SQLException;
import java.util.Scanner;

import ItemCost.Bean;
import ItemCost.DOA;

public class MarketMain {

	private static Scanner sc;

	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		
		Bean ab = new Bean();
		DOA cd = new DOA();
		sc = new Scanner(System.in);
		String choice = null;
		do
		{
			System.out.println("Market Operations");
			System.out.println("1.Insertion");
			System.out.println("2.Display");
			System.out.println("3.Total Cost");
			System.out.println("Enter an number to perform Operation : ");
			int ch = sc.nextInt();
			switch(ch)
			{
				case 1 :  System.out.println("Insertion");
				 		  System.out.println("Enter itemId : ");
				 		  int id = sc.nextInt();
				 		  ab.setitemId(id);
				 		  System.out.println("Enter itemName : ");
				 		  String name = sc.next();
				 		  ab.setitemName(name);
				 		  System.out.println("Enter itemCost : ");
				 		  int cost = sc.nextInt();
				 		  ab.setitemCost(cost);
				 		  int i = cd.item_Insert(ab);
				 		  if(i>0)
				 		  {
				 			  System.out.println("Your insertion is successfull");
				 		  }
				 		  else
				 		  {
				 			  System.out.println("Your insertion is failed");
				 		  }
				 		  break;
				 		  
				case 2 : System.out.println("Display items");
						 cd.Items_Display();
						 break;
						 
				case 3 : System.out.println("Total Cost of items");
						 cd.items_totalCost();
				  		 break;
				  		 
				default : System.exit(0);
			}
			System.out.println("Enter your choice to repeat the operation [ y/n ] : ");
			choice = sc.next();
		}
		while(choice.equals("y"));
	}
}

