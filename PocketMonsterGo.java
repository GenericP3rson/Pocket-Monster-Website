// Shreya
public class PocketMonsterGo {

	public static void main(String[] args) 
	{
		String names[] = {"Liza", "Shreya", "Zofia", "Elle"};
		
		//8) Establish an array of Strings that holds four pocket monster types
		String[] types = {"Shreya", "Liza", "Uh", "Fighting"};
		
		//9) Establish an array of four PocketMonster objects called pocketIndex that is empty
		PocketMonster[] pocketIndex = new PocketMonster[4];
		
		//10) Write a loop that fills each spot in pocketIndex with the names/types
		//    you established in 7 & 8.
		for (int i = 0; i < names.length; ++i) {
			pocketIndex[i] = new PocketMonster(names[i], types[i]);
		}

		
		
		//11) Use a loop and PocketMonster's toString() to print element of your pocketIndex
		for (PocketMonster a : pocketIndex) {
			System.out.println(a);
		}

		
		//12) Make the first element of pocketIndex expUp five times and then print it out.
		pocketIndex[0].expUp();
		System.out.println(pocketIndex[0]);


		//13) Make the second element of pocketIndex attack twice
		pocketIndex[1].attack();
		pocketIndex[1].attack();
		
		//14) Make the third element of pocketIndex a new PocketMonster
		//    named Sean of type Ground. Print it, expUp twice, then make it attack 
		pocketIndex[2] = new PocketMonster("Sean", "Ground");
		System.out.println(pocketIndex[2]);
		pocketIndex[2].expUp();
		pocketIndex[2].expUp();
		pocketIndex[2].attack();

		//15) Make the fourth element of pocketIndex a copy of the third element, then print it out.
		pocketIndex[3] = new PocketMonster(pocketIndex[2]);
		System.out.println(pocketIndex[3]);
	}

}
