package assignments;

public class Assignment2 {

	public static void main(String[] args) {
		
		
		
		String [] [] [] Marksheet = 
			
			{//sem1
			{{"Mathematics1","Physics","Chemistry","Computer Programming","Engineer Drawing","Basic Electrical Engineering"},
					{"78","85","91","74","88","79"}},
					
			
			//Sem2
			{{"Mathematics2","Mechanics","Environmental Sci","Basic Electronics","Engineering Physics","Engineering Graphics" },
					{"82","77","93","69","84","90"}},
			
			//Sem3
			{{"Data Structures","Discrete Maths","Digital electronics","Operating systems","Signals & Systems","OOPs" },
					{"88","81","76","92","85","78"}},	
				
			
					
			//Sem4
			{{"Algorithms","Computer Networks","Database Systems","Microprocessors","Communication Eng","Software Engineering" },
					{"91","73","89","80","76","87"}},
									
			
			//Sem5				
							
			{{"Probablity & Stats","Machine Learning","Compiler Design","Theory of Computation","Embedded Systems","Computer Graphics" },
							
					{"86","88","84","95","73","90"}}
			
		
			};
		
		
		System.out.println("----------------------------------------------------------------------");
		
		
		// Print Semester 3 - Subject 4 and Subject 5 Names.
		
		System.out.println("Semester 3 - Subject 4 is "+ Marksheet[2][0][3]);
		System.out.println("Semester 3 - Subject 5 is "+Marksheet[2][0][4]);
		
		
		System.out.println("----------------------------------------------------------------------");
		
		//Print Semester 5 - Subject 3 and Subject 6 marks
		
		System.out.println("Semester 5 - Subject 3 "+Marksheet[4][0][2]+"Mark  is "+Marksheet [4][1][2]);
		System.out.println("Semester 5 - Subject 6 "+Marksheet[4][0][5]+"Mark  is "+Marksheet [4][1][5]);
		
		
		
		
		
		
		
		
// 1. Create a 3D array to represent the following data:
//o Semesters as the first dimension. o Subjects and Marks as the second dimension. o Actual values for Subject Names and Marks as the third dimension.
		
		
//		String [] semester = {"Sem1", "Sem2", "Sem3", "Sem4", "Sem5", "Sem6"};
//		
//		
//		
//		String [] SemMarks = {"Subject1","Subject2","Subject3","Subject4","Subject5","Subject6"};
//				
//				
//		String [] MarksRow = {"Marks","Marks","Marks","Marks","Marks","Marks"};
//		
//		
//		String [] Sem1_Subjects = {"Mathematics1","Physics","Chemistry","Computer Programming","Engineer Drawing","Basic Electrical Engineering"};
//		
//		
//		String [] Sem1_Marks =  {"78","85","91","74","88","79"};
//		
//		
//		String [] Sem2_Subjects = {"Mathematics2","Mechanics","Environmental Sci","Basic Electronics","Engineering Physics","Engineering Graphics" };
//		
//		
//		String [] Sem2_Marks = {"82","77","93","69","84","90"};
//		
//		
//		String [] Sem3_Subjects = {"Data Structures","Discrete Maths","Digital electronics","Operating systems","Signals & Systems","OOPs" };
//		
//		String [] Sem3_Marks = {"88","81","76","92","85","78"};
//		
//		
//		String [] Sem4_Subjects = {"Algorithms","Computer Networks","Database Systems","Microprocessors","Communication Eng","Software Engineering" };
//		
//		String [] Sem4_Marks = {"91","73","89","80","76","87"};
//		
//		
//		
//		String [] Sem5_Subjects = {"Probablity & Stats","Machine Learning","Compiler Design","Theory of Computation","Embedded Systems","Computer Graphics" };
//		
//		String [] Sem5_Marks = {"86","88","84","95","73","90"};
//		
//		
//		String [] [] [] Marksheet = {{{semester},{{SemMarks,MarksRow}},{{Sem1_Subjects,Sem1_Marks},{Sem2_Subjects,Sem2_Marks},{Sem3_Subjects,Sem3_Marks},{Sem4_Subjects,Sem4_Marks},{Sem5_Subjects,Sem5_Marks}}};
//		
//		
//		
//				
				

	}
}

