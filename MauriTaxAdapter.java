package taxCalculator;

public class MauriTaxAdapter implements CalcTax {

	MauriTax newMauriTax = new MauriTax();
	
	public double taxAmount(int quantity, float price)
	{
		return newMauriTax.newTaxAmount(quantity, price);
	}
}
