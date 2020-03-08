package taxCalculator;

public class Item {

	private String name;
	private int quantity;
	private float price;
	private CalcTax cto, ctm;
	
	Item (String name,int quantity)
	{
		this.name = name;
		this.quantity = quantity;
		price =30;
		cto = new GST();
		ctm = new MauriTaxAdapter();
	}
	
	public void getDetails()
	{
		double totalo = price * quantity + cto.taxAmount(quantity, price);
		double totalm = price * quantity + 	ctm.taxAmount(quantity, price);	
				
		System.out.println("In other countries\n\nName:"+ name +"\nQuantity:"+ quantity +"\nTotal price:"+ totalo);
		System.out.println("\nIn Mauritius\n\nName:"+ name +"\nQuantity:"+ quantity +"\nTotal price:"+ totalm);
	}
}
