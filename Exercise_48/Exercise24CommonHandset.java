package Demo;

public class Exercise24CommonHandset extends Exercise24Handset implements PlayWiring{
	
	public Exercise24CommonHandset(String brand,String type) {
		this.brand = brand;
		this.type = type;
	}
	
	public void play(String content) {
		System.out.println(this.type + " start playing audio " + content + ".");
	}
	
}
