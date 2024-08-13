class P5{
	int id;
	String ename;
	int sal;
	int age;
	String dname;

public Const(){
	this.id=0;
	this.ename="Unknown";
	this.sal=0;
	this.age=0;
	this.dname="Unknown";
}

public Const(int id){
	this.id=id;
	this.ename="Unknown";
	this.sal=0;
	this.age=0;
	this.dname="Unknown";
}
public Const(int id,String ename){
	this.id=id;
	this.ename=ename;
	this.sal=0;
	this.age=0;
	this.dname="Unknown";
}
public Const(int id,String ename,int sal){
	this.id=id;
	this.ename=ename;
	this.sal=sal;
	this.age=0;
	this.dname="Unknown";
}
public Const(int id,String ename,int sal,int age){
	this.id=id;
	this.ename=ename;
	this.sal=sal;
	this.age=age;
	this.dname="Unknown";
}
public Const(int id,String ename,int sal,int age,String dname){
	this.id=id;
	this.ename=ename;
	this.sal=sal;
	this.age=age;
	this.dname=dname;
}
public void display(){
	System.out.println("ID: "+id);
	System.out.println("Name: "+ename);
	System.out.println("Salary: "+sal);
	System.out.println("Age: "+age);
	System.out.println("Dept-name: "+dname);
}
public static void main(String[] args){
	
	Const obj1 = new Const();
	Const obj2 = new Const(1);
	Const obj3 = new Const(2,"neha");
	Const obj4 = new Const(3,"kashish",20000);
	Const obj5 = new Const(4,"anjali",50000,20);
	Const obj6 = new Const(5,"boby",80000,22,"java");

	obj1.display();
	obj2.display();
	obj3.display();
	obj4.display();
	obj5.display();
	obj6.display();

}
}