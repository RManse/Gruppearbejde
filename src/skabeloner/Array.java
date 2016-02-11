package skabeloner;

import skabeloner.Metode;

public class Array 
{
	private static Metode[] list;
	public static void main(String[] args) 
	{
		list = new Metode [5]; // Arrays starter ved 0, derfor det er 5, på trods af at jeg kun har lavet 4.
		list [1] = new Metode ("Indsæt tekst her", 2000);
		list [2] = new Metode ("Indsæt tekst her", 0);
		list [3] = new Metode ("Indsæt tekst her", -2000);
		list [4] = new Metode ("Indsæt tekst her", 500);
	}

}
