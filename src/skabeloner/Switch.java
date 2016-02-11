package skabeloner;

public class Switch {

	public static void main(String[] args) 
	{
// Klassisk eksempel på en switch sætning
		// Definerer nogle variable jeg vil bruge i min sætning
		int fieldrent = 0;
		int count = 0;
		
		int RENT_1 = 500;
		int RENT_2 = 1000;
		int RENT_3 = 2000;
		int RENT_4 = 4000;
		
		switch (count) 
		{
        case 1: fieldrent = RENT_1; break;
        case 2: fieldrent = RENT_2; break;
        case 3: fieldrent = RENT_3; break;
        case 4: fieldrent = RENT_4; break;    
		}
		
		
	}

}
