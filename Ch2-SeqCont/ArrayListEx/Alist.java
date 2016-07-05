import java.util.ArrayList;

public class Alist {
	public static void main(String[] args) {
		ArrayList<Integer> grades = new ArrayList<Integer>();
		grades.add(100);grades.add(90);grades.add(80);
		grades.add(70);grades.add(60);grades.add(50);
		int total=0;
		/*
		for(int i=0;i<grades.size();i++)
			total+=grades.get(i);
		*/
		for(Integer grade : grades)
			total+=grade;
		double avg = total/grades.size();
		System.out.println("Size of grades : "+grades.size());
		System.out.println("Average : "+avg);
		grades.remove(4);
		grades.remove(0);
		System.out.println("New size : "+grades.size());
		for(Integer grade : grades)
			System.out.println(grade);
	}
}
