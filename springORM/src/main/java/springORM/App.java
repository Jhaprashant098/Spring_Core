package springORM;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");

		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

//    Student student=new Student(24,"anurag sharma","gwalior");
//    int r=studentDao.insert(student);
//    
//   System.out.println("done"+r);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean go = true;
		while (go) {

			System.out.println("press 1 for add new student");
			System.out.println("press 2 for display all student");
			System.out.println("press 3 for get details for single student");
			System.out.println("press 4 for delete student");
			System.out.println("press 5 for update student");
			System.out.println("press 6 for exit student");
			try {
				int input = Integer.parseInt(br.readLine());
				switch (input) {
				case 1:
					// add student
					System.out.println("enter student id");
					int uId = Integer.parseInt(br.readLine());
					System.out.println("enter student name");
					String uName = br.readLine();
					System.out.println("enter student city");
					String uCity = br.readLine();

					Student s = new Student();
					s.setStudentId(uId);
					s.setStudentName(uName);
					s.setStudentCity(uCity);

					int r = studentDao.insert(s);
					System.out.println(r + "student added");
					break;
				case 2:
					// display all student

					System.out.println("------------------------------");
					List<Student> allStudent = studentDao.getAllStudent();
					for (Student st : allStudent) {
						System.out.println("student Id=" + st.getStudentId());
						System.out.println("student Name=" + st.getStudentName());
						System.out.println("student City=" + st.getStudentCity());
						System.out.println("----------------------------------------");

					}
					break;

				case 3:
					// get single student
					System.out.println("enter student id");
					int usId = Integer.parseInt(br.readLine());
					Student student = studentDao.getStudent(usId);
					System.out.println("student Id=" + student.getStudentId());
					System.out.println("student Name=" + student.getStudentName());
					System.out.println("student City=" + student.getStudentCity());
					System.out.println("----------------------------------------");

					break;

				case 4:
					// delete student
					System.out.println("enter student id");
					int ustId = Integer.parseInt(br.readLine());
					studentDao.deleteStudent(ustId);
					System.out.println("student deleted");
					
					break;

				case 5:
//					System.out.println("enter student name");
//					String Name = br.readLine();
//					System.out.println("enter student id");
//					int Id = Integer.parseInt(br.readLine());
//					System.out.println("enter student city");
//					String City = br.readLine();
//
//					Student st = new Student();
//					st.setStudentId(Id);
//					st.setStudentName(Name);
//					st.setStudentCity(City);
//					studentDao.updateStudent(st);
//				//	System.out.println(rt + "student update-------");
					break;

				case 6:

					// exit
					go = false;

					break;

				}
			} catch (Exception e) {

				System.out.println("invailid input try with another one ||");
			}
		}
		System.out.println("thank you using my application");
		System.out.println("see you soon||");

	}
}
