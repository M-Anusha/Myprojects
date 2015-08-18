package beans;

public class Employee {
private int code;
private String name;
private Address addr;

public Employee(int code,String name){
	this.code = code;
	this.name = name;
}
public int getCode() {
	return code;
}

public void setCode(int code) {
	this.code = code;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Address getAddr() {
	return addr;
}
public void setAddr(Address addr) {
	this.addr = addr;
}

}
