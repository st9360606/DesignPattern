package com.example.pattern.responsibilitychain;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//創建一個請求
		PurchaseRequest purchaseRequest = new PurchaseRequest(1, 31000, 1);
		
		//創建相關的審批人
		DepartmentApprover departmentApprover = new DepartmentApprover("張主任");
		CollegeApprover collegeApprover = new CollegeApprover("李院長");
		ViceSchoolMasterApprover viceSchoolMasterApprover = new ViceSchoolMasterApprover("王副校長");
		SchoolMasterApprover schoolMasterApprover = new SchoolMasterApprover("吳校長");

		//需要將各個審批級別的下一個人設置好( 審批人要構成一個環形的鍊模式 )
		departmentApprover.setApprover(collegeApprover);  //主任級別
		collegeApprover.setApprover(viceSchoolMasterApprover); //院長級別
		viceSchoolMasterApprover.setApprover(schoolMasterApprover); //副校長級別
		schoolMasterApprover.setApprover(departmentApprover); //校長級別


		departmentApprover.processRequest(purchaseRequest);
		viceSchoolMasterApprover.processRequest(purchaseRequest);
	}
}
