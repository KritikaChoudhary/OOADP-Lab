package taxCalculator;

public class GST implements CalcTax {

	public double taxAmount(int quantity, float price)
	{
		return price*0.05*quantity;
	}
}
