package _03_smurf;

public class SmurfRunner {
public static void main(String[] args) {
	Smurf hi = new Smurf("Handy");
	hi.eat();
	System.out.println(hi.getName());
	Smurf papa = new Smurf("papa smurf");
	System.out.println(papa.getHatColor());
	System.out.println(papa.isGirlOrBoy());
	Smurf smurfette = new Smurf("smurfette");
	System.out.println(smurfette.getHatColor());
	System.out.println(smurfette.isGirlOrBoy());
}
}
