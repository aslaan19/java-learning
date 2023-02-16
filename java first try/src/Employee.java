class Employee extends Person {
private int salary;
private int ID;

Employee(String name ,String phonenumber, int salary, int ID){
	super(name ="aslan",phonenumber="0546");

	this.ID = ID;
	this.salary=999999;

}
public void setID(int iD) {
	ID = iD;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public int getID() {
	return ID;
}
public int getSalary() {
	return salary;
}
@Override
public String toString() {
	return name +"has a salary:"+salary+"and his ID :"+ID;
}

}