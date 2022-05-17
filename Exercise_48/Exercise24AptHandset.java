package Demo;

public class Exercise24AptHandset extends Exercise24Handset implements PlayWiring,TakePictrue,Network{
	
	public Exercise24AptHandset(String brand,String type) {
		this.brand = brand;
		this.type = type;
	}
	
	public void play(String content) {
		System.out.println(this.type + " start playing video " + content + ".");
	}
	
	public void networkConn() {
		System.out.println(this.type + " start network connecting...");
		}
	
	public void takePictrues() {
		System.out.println(this.type + " start network taking pictrue...");
	}
}
