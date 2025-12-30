package Inheritance;
import java.util.Scanner;
public class inheritance1 {

	public static void main(String[] args) {
		
		footBall s = new footBall("yash",21,15,5,"india","india");
		System.out.println(s.get_name());
		System.out.println(s.get_age());
		System.out.println(s.get_manofmatch());
		System.out.println(s.get_bestscore());
		System.out.println(s.get_country());
		System.out.println(s.get_team());
	}

}
class player
{
	String name;
	int age;
	int manofmatch;
	int bestScore;
	String country;
	String team;
	
}

class footBall extends player
{
	Scanner  sc = new Scanner(System.in);
	
	public footBall(String name,int age,int manofmatch,
			int bestScore,String country,String team)
	{
		this.name=name;
		this.age=age;
	    this.manofmatch=manofmatch;
		this.bestScore=bestScore;
		this.country=country;
	     this.team=team;
	}
	
	public String get_name()
	{
		return name;
	}
	public String get_country()
	{
		return country;
	}
	public String get_team()
	{
		return team;
	}
	public int get_age()
	{
		return age;
	}
	public int get_manofmatch()
	{
		return manofmatch;
	}
	public int get_bestscore()
	{
		return bestScore;
	}
	
}
