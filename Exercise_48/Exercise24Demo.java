package Demo;

public class Exercise24Demo {
	
	public static void showCommonFunction(Exercise24Handset phone) {
		phone.info();
		phone.sendInfo();
		phone.call();
		
	}
	
	public static void showUniqeFunction(Exercise24Handset phone) {
		if(phone instanceof Exercise24CommonHandset){
			((Exercise24CommonHandset)phone).play("Mp3");
		}
		else if(phone instanceof Exercise24AptHandset){
			((Exercise24AptHandset)phone).play("AVI");
			((Exercise24AptHandset)phone).networkConn();
			((Exercise24AptHandset)phone).takePictrues();
		}	
	}
	
	public static void main(String args[]) {
	
		Exercise24Handset functionPhone = new Exercise24CommonHandset("Nokia","N73");
		Exercise24Handset smartPhone = new Exercise24AptHandset("Apple","Iphone");
		
		showCommonFunction(functionPhone);
		showCommonFunction(smartPhone);
		showUniqeFunction(functionPhone);
		showUniqeFunction(smartPhone);
	}
}
