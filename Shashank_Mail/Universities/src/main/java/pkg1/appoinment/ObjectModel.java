package pkg1.appoinment;

public class ObjectModel {
	String name,salary,location,date1,email;
	ObjectModel(String name,String salary,String location,String date1,String email){
		this.name=name;
		this.salary=salary;
		this.location=location;
		this.date1=date1;
		this.email=email;
	}
	public String[] getData() {
		String[] arr1 = new String[5];
		arr1[0]=name;
		arr1[1]=salary;
		arr1[2]=location;
		arr1[3]=date1;
		arr1[4]=email;
		return arr1;
		}
	}
