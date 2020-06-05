package customer;

import java.util.List;
import java.util.Scanner;

public class EmpManager {

	public static void main(String[] args) {
		IEmpDAO dao = new EmpDAO();

		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int EmployeeId = 0;
		try {
			while (run) {
				System.out.println("-------------------------------");
				System.out.println("1.입력  | 2.수정 | 3.삭제 | 4.조회  |5.종료");
				System.out.println("-------------------------------");
				System.out.print("입력 > ");
				int menu = sc.nextInt();
				sc.nextLine();
				switch (menu) {
				case 1:
					EmpVO emp = new EmpVO();

					EmployeeId = dao.selectLastEmp();
					System.out.println(EmployeeId);
					emp.setEmployeeId(EmployeeId);

					System.out.println("사원의 FirstName을 입력하세요.");
					String FirstName = sc.nextLine();
					emp.setFirstName(FirstName);

					System.out.println("사원의 LastName을 입력하세요.");
					String LastName = sc.nextLine();
					emp.setLastName(LastName);

					System.out.println("사원의 Email을 입력하세요.");
					String Email = sc.nextLine();
					emp.setEmail(Email);

					System.out.println("사원의 PhoneNumber을 입력하세요.");
					String PhoneNumber = sc.nextLine();
					emp.setPhoneNumber(PhoneNumber);

					emp.setHireDate(new java.sql.Date(new java.util.Date().getTime()));

					emp.setJobId("IT_PROG");

//					System.out.println("사원의 JobId을 입력하세요.");
//					String JobId= sc.nextLine();
//					emp.setJobId(JobId);
//					
					System.out.println("사원의 Salary을 입력하세요.");
					int Salary = sc.nextInt();
					emp.setSalary(Salary);

					emp.setCommissionPct(0.8);
					emp.setManagerId(100);
					emp.setDepartmentId(60);

//					System.out.println("사원의 ManagerId을 입력하세요.");
//					int ManagerId= sc.nextInt();
//					emp.setManagerId(ManagerId);
//					
//					System.out.println("사원의 DepartmentId을 입력하세요.");
//					int DepartmentId= sc.nextInt();
//					emp.setDepartmentId(DepartmentId);

					dao.insertEmp(emp);
					System.out.println("입력 성공");
					break;

				case 2:

					System.out.println(
							"id | firstName | lastName | email | phoneNumber | hireDate | jobid | salary | commissionPct | managerId | departmentId");
					List<EmpVO> empList = dao.selectAllEmp();
					for (EmpVO vo : empList) {
						System.out.println(vo);
					}
					System.out.println("수정할 사원 EmployeeId를 입력하세요.");
					EmployeeId = sc.nextInt();
					sc.nextLine();

					emp = new EmpVO();
					emp = dao.selectEmp(EmployeeId);

					System.out.println("사원의 Email을 입력하세요.");
					Email = sc.nextLine();
					emp.setEmail(Email);

					System.out.println("사원의 Salary을 입력하세요.");
					Salary = sc.nextInt();
					emp.setSalary(Salary);

					dao.updateEmp(emp);
					System.out.println("수정 성공");
					break;
				case 3:
					System.out.println(
							"id | firstName | lastName | email | phoneNumber | hireDate | jobid | salary | commissionPct | managerId | departmentId");
					empList = dao.selectAllEmp();
					for (EmpVO vo : empList) {
						System.out.println(vo);
					}
					System.out.println("삭제할 사원 EmployeeId를 입력하세요.");
					EmployeeId = sc.nextInt();
					sc.nextLine();

					dao.deleteEmp(EmployeeId);
					System.out.println("삭제성공");
					break;
				case 4:
					System.out.println(
							"id | firstName | lastName | email | phoneNumber | hireDate | jobid | salary | commissionPct | managerId | departmentId");
					empList = dao.selectAllEmp();
					for (EmpVO vo : empList) {
						System.out.println(vo);
					}
					break;
				case 5:
					run = false;
					break;
				}
			}
//			dao.insertEmp(emp);
//			System.out.println("입력 성공!!!");
//			dao.updateEmp(emp);
//			System.out.println("수정 성공");
//			dao.deleteEmp(401);
//			System.out.println("삭제 성공");
//			EmpVO emp1 = dao.selectEmp(103);
//			System.out.println(emp1);
//			List<EmpVO> empList1 = dao.selectEmpByDeptno(60);
//			List<EmpVO> empList = dao.selectAllEmp();
//			for (EmpVO vo : empList) {
//				System.out.println(vo);
//			}
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
	}
}