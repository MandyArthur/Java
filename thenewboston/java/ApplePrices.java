package thenewboston.java;



public class ApplePrices {

	public int price;
	public String dollar = "$";
	public String pound = "�";

	public static void main(String []args) {

		ApplePrices ap = new ApplePrices();
		ap.calculatePrice(999, "pounds");

	}

	public String calculatePrice(int price, String currency) {

		this.price = price;
		String result;

		if (currency.equals("pounds")) {
			result = dollar + " " + price;
		} else {
			result = pound + " " + price;
		}
		return result;

	}

}
