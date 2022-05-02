package Demo;

public class Exercise9Net {
	protected String ID;
	private String password;
	protected String Email;
	
	public Exercise9Net(String Id,String passWord,String Email) {
		this.ID = Id;
		this.password = passWord;
		this.Email = Email;
	}
	public Exercise9Net(String Id,String passWord) {
		this.ID = Id;
		this.password = passWord;
		this.Email = this.ID + "@gameschool.com";
	}
	private void ShowID() {
		System.out.println("ID : " + this.ID + '\n' + "Password: " + this.password +
				'\n' + "Email : " + this.Email);
	}
	public static void main(String args[]) {
		Exercise9Net test = new Exercise9Net("fuchun","12345");
		test.ShowID();
	}

}
