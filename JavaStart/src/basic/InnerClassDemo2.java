package basic;
class Hospital{
	public static String hospital_name = "SMs Hospital";
	public static String location = "jaipur";
	
	private class Doctor {
		String Doctor_name = "Ramjan Gori";
		void ShowDoctorDetail() {
			System.out.println("Doctor Name : " + Doctor_name);
			System.out.println("Hospital : " + hospital_name);
			System.out.println("Location : " + location ) ;
		}
	}
	
	class Employee{
		String name;
		Employee(String name){
			this.name = name;
			
		}
       void showEmployees() {
    	   System.out.println("name :" + this.name);
       }
	}
	
	void showHospitalDetails() {
		System.out.println("Hospital Name :" +hospital_name);
		System.out.println("Location :" + location );
		Doctor d = new Doctor();
	    System.out.println( "Doctor Name :"	+  d.Doctor_name);
	    Employee e = new Employee("Rakesh Sahrma");
	    System.out.println("employee name :" + e.name);
	    
	}
}
public class InnerClassDemo2 {
  public static void main(String[] args) {
		Hospital h = new Hospital();
		h.showHospitalDetails();
}
	

}
