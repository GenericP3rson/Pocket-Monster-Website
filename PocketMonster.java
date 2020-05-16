// Shreya
public class PocketMonster 
{
	//1) Create private instance variables:
	// An int for health, an int for level, & an int for xp
	// A String for name, a String for its type
	int health, level, xp;
	String name, type;

	
	//2a) Create a default constructor that takes as parameters name and type
	//  It should set health to 100, level to 1, xp to 0.
	public PocketMonster(String n, String t) {
		health = 100;
		level = 1;
		xp = 0;
		name = n;
		type = t;
	}


	//2b) Create a copy constructor that takes a PocketMonster object as a parameter
	//	then copies all the values from the parameter into this instance
	public PocketMonster(PocketMonster p) {
		health = p.health;
		level = p.level;
		xp = p.xp;
		name = p.name;
		type = p.type;
	}
	
	
	//3) Write accessor methods for name, type & level
	public String getName() {return name;}
	public String getType() {return type;}
	public int getLevel() {return level;}

	public void increaseXp(int x) {xp+=x;}
	
	//4) Write a method called expUp that increases xp by 1000
	//  Also, after the increase, if xp is a multiple of 5000,
	//  increase the level by 1.
	public void expUp() {xp +=1000; if(xp %5000 == 0)++level;}
	
	//5) Write a toString method that returns a String with
	//  the Name, type, level, and current health in a nice format
	public String toString() {
		return name + ": " + type + ", " + level + ", " + health;
	}
	
	
	//6) Write a method called attack that prints to the console:
	//   "It's ______ effective!!" where _______ fills from a String
	//   array you create. It can hold any five adjectives you like.
	public void attack() {
		String[] adj = {"white", "leo-like", "epic", "technical", "rich", "hot", "straight", "asian"};
		System.out.println("It's " + adj[(int)(Math.random()*adj.length)] + " effective!!");
	}
	
}
