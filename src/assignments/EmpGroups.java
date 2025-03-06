package assignments;

public class EmpGroups {

	public static void main(String[] args) {
		
		
		Employees Obj = new Employees();
		
		String [] [] EmpArrays = {{Obj.empname1,Obj.empname2,Obj.empname3},{Obj.empID1,Obj.empID2,Obj.empID3}};
		
		System.out.println("The Employee name "+EmpArrays[0][0]+ " Employee ID = "+EmpArrays[1][0]);
		System.out.println("The Employee name "+EmpArrays[0][1]+ " Employee ID = "+EmpArrays[1][1]);
		System.out.println("The Employee name "+EmpArrays[0][2]+ " Employee ID = "+EmpArrays[1][2]);
		

	}

}
