import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class PlannerManager {
	
	static HashMap <String,String> course = new HashMap <String,String>();

	public static void sortCourse(){
	       
	     //TreeMap to store values of Map
	     TreeMap<String, String> time = new TreeMap<>();
	     
	     //Copy all data from Map into TreeMap
	     time.putAll(course);
	     
	      //Display the TreeMap which is naturally sorted
	      time.entrySet().forEach((Map.Entry<String, String> entry) -> {
	            System.out.println("Time: "+ entry.getKey()+", Course's Name: "+ entry.getValue());
	        });
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		PlannerManager planner = new PlannerManager();
		
		LinkedList<Integer> cPosition = new LinkedList<>();
		LinkedList<String> cName = new LinkedList<>();
		LinkedList<String> cCode = new LinkedList<>();
		LinkedList<String> cGroup = new LinkedList<>();
		LinkedList<String> cDept = new LinkedList<>();
		LinkedList<String> cInstructor = new LinkedList<>();
		LinkedList<String> cTime = new LinkedList<>();
		
		System.out.println("Welcome to Student's Course Planner.\n");
		
		System.out.print("Enter your password: ");
		Scanner input = new Scanner(System.in);
					
		String text = "student1234 ";
		String pattern = new String(input.next());
	
		            
		char[] txtArr = text.toCharArray();
		char[] patArr = pattern.toCharArray();

		int tLen = txtArr.length;
		int pLen = patArr.length;

		
		int i=0;

		int charMatchCount = 0;
		       for (int j = 0;  j < pLen; j++) 
		       {
		            // If pattern mismatch, break next searching point.
		           	
		             if (patArr[j] != txtArr[i + j]) 
		             {
		             		break;
		             }
		                     
		             charMatchCount++;  
		        }
		       
		        if (charMatchCount == pLen)
		        	{
		    		int count=1;
		    		while(count==1) {
		    			System.out.println();
		    			System.out.println("(1) Add Course");
		    			System.out.println("(2) Remove Course");
		    			System.out.println("(3) Print Courses in Planner");
		    			System.out.println("(4) Sort by Time");
		    			System.out.println("(5) Quit\n");
		    			System.out.print("Enter a selection: \n");
		    			
		    			int selection = in.nextInt();
		    			
		    			if (selection == 1) {
		    				
		    					System.out.println("Enter position: ");
		    					int coursePosition = in.nextInt();
		    					cPosition.add(coursePosition);
		    					
		    					System.out.println("Enter course name: ");
		    					in.nextLine();
		    					String courseName = in.nextLine();
		    					cName.add(courseName);
		    					
		    					System.out.println("Enter course code: ");
		    					String courseCode = in.nextLine();
		    					cCode.add(courseCode);
		    					
		    					System.out.println("Enter course group: ");
		    					String courseGroup = in.nextLine();
		    					cGroup.add(courseGroup);
		    					
		    					System.out.println("Enter course department: ");
		    					String courseDept = in.nextLine();
		    					cDept.add(courseDept);
		    					
		    					System.out.println("Enter course instructor: ");
		    					String courseInstructor = in.nextLine();
		    					cInstructor.add(courseInstructor);
		    					
		    					System.out.println("Enter time: ");
		    					String courseTime = in.nextLine();
		    					cTime.add(courseTime);
		    					
		    					course.put(courseTime,courseName);
		    			}
		    			
		    			else if (selection == 2) {
		    				System.out.println("Enter course position: ");
		    				in.nextLine();
		    				int position = in.nextInt();
		    				
		    				cPosition.remove(position-1);
		    				cName.remove(position-1);
		    				cCode.remove(position-1);
		    				cGroup.remove(position-1);
		    				cDept.remove(position-1);
		    				cInstructor.remove(position-1);
		    				cTime.remove(position-1);
		    				
		    				System.out.println("No.  Course Name\t\tCode \tGroup\tDepartment  \tInstructor\tTime");
		    				System.out.println("----------------------------------------------------------------------------------------------");
		    				
		    				for (int j=0; j<cPosition.size(); j++) {
		    					System.out.printf(" %-4d%-27s%-8s%-5s\t%-15s\t%-15s%-8s\n",cPosition.get(j), cName.get(j), cCode.get(j), cGroup.get(j), cDept.get(j), cInstructor.get(j), cTime.get(j));
		    				}	
		    			}
		    			
		    			else if (selection == 3) {
		    				System.out.println("No.  Course Name\t\tCode \tGroup\tDepartment  \tInstructor\tTime");
		    				System.out.println("----------------------------------------------------------------------------------------------");
		    				
		    				for (int j=0; j<cPosition.size(); j++) {
		    					System.out.printf(" %-4d%-27s%-8s%-5s\t%-15s\t%-15s%-8s\n",cPosition.get(j), cName.get(j), cCode.get(j), cGroup.get(j), cDept.get(j), cInstructor.get(j), cTime.get(j));
		    				}
		    			}
		    			
		    			else if (selection == 4) {

		    				System.out.println("Sort by Time:");
		                    in.nextLine();
		                    sortCourse();
		    				}
		    			
		    			else if (selection == 5) {
		    				count=0;
		    				System.out.println("You have exit the system.");
		    			}
		    			else {
		    				System.out.println("System terminated successfully.");
		    			}
		    		}
		            	   
		
		        	}
				else
				{
					System.out.println("Login session have been terminated");
	
					return;
				}
		}
}
