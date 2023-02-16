class Person {
    protected String name;
	protected String phonenumber;

	Person(String name,String phonenumber){
		this.name =name;
		this.phonenumber=phonenumber;
	}
	public String getName() {
		return name;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	@Override
	public String toString() {
		return "this person has a name:"+ name+"and a phonenumer:"+phonenumber;
	}
}



