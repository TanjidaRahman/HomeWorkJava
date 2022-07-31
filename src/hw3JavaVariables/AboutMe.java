package hw3JavaVariables;

public class AboutMe {
	public string myInfo;// here variable is declared by myInfo.
	public String name = "Tanjida Rahman"; // here variable is initialized by assigning the name value Tanjida Rahman.
	public byte myAge = 50;
	public short houseRent = 3000;
	public int mySalary = 2000000000;
	public long myBankBalance = 500000000l;
	public float height = 5.4f;
	public double myGrade = 3.67893;
	public char sex = 'F';
	public boolean usCitizen = false;

	public static void main(String[] args) {
		AboutMe aboutMe = new AboutMe();
		System.out.println(aboutMe.name);
		System.out.println(aboutMe.myAge);
		System.out.println(aboutMe.height);
		System.out.println(aboutMe.sex);
		System.out.println("Myname: " + aboutMe.name + ", Myage: " + aboutMe.myAge + ", Mysex:" + aboutMe.sex);

	}

}
