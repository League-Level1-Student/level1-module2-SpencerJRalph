package _04_tea_maker;

public class TeaMakerRUnner {
public static void main(String[] args) {
	
	Kettle hi = new Kettle();
	hi.getWater();
	hi.boil();
	TeaBag cool = new TeaBag("Green");
	cool.getFlavor();
	Cup hello = new Cup();
	hello.makeTea(cool, hi.getWater());
}
}
