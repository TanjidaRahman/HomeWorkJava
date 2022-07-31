package hw4JavaVariables;

public class AboutMe {

	public String name; //Variable declared
	public byte myAge;
	public short houseRent;
	public int mySalary;
	public long myBankBalance;
	public float height;
	public double myGrade;
	public char sex;
	public boolean usCitizen;

	public AboutMe() { // Constructor declared
		System.out.println("This is all about us:");

	}
	//Method implemented
	public void aboutMe() {
		System.out.println("\nMy name is: " + name + "\nMy Age: " + myAge + "\nMy House rent: " + houseRent
				+ "\nMy Yearly salary: " + mySalary + "\nMy bank balance: " + myBankBalance + "\nMy height: " + height
				+ "\nMy grade: " + myGrade + "\nMy sex: " + sex + "\nAm I US citizen: " + usCitizen);
	}

}
