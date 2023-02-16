class Student extends Person {
	private int ID;
	private double GPA;
	
	Student(String name,String phonenumber, int ID, double GPA){
		super(name, phonenumber);
		this.GPA = GPA;
		this.ID =ID;
	}
	public void setGPA(double gPA) {
		GPA = gPA;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public double getGPA() {
		return GPA;
	}
	public int getID() {
		return ID;
	}
	@Override
	public String toString() {
		return name+" has a GPA :"+GPA;
	}
	
}