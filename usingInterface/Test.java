package usingInterface;

import java.util.List;
public class Test {
	public static void main(String[] args) {
		//add
//		Mobile m=new Mobile();
//		m.setBrandName("Realme");
//		m.setPrice(1500.00);
//		m.setModelNo("12NBS3");
//		m.setRam("8GB");
//		m.setStorage("64GB");
//		
//		MobileOperationIMPL mimpl=new MobileOperationIMPL();
//		int res=mimpl.addMobile(m);
//		if(res>0) {
//			System.out.println("Mobile added Successfully!");
//		}else {
//			System.out.println("Failed to add!");
//		}
//		view
		MobileOperationIMPL mimpl2=new MobileOperationIMPL();
		List<Mobile> listMobile=mimpl2.viewMobiles();
		for(Mobile mobile : listMobile) {
			System.out.println(mobile);
		}
		
		//update
//		Mobile m1=new Mobile();
//		m1.setId(7);
//		m1.setBrandName("OnePlus");
//		m1.setPrice(30000.00);
//		m1.setModelNo("18NBS4");
//		m1.setRam("12GB");
//		m1.setStorage("256GB");
//		
//		MobileOperationIMPL mimpl3=new MobileOperationIMPL();
//		int res2=mimpl3.updateMobile(m1);
//		if(res2>0) {
//			System.out.println("Mobile Updated Successfully!");
//		}else {
//			System.out.println("Update Failed!");
//		}
		//delete
//		Mobile m2=new Mobile();
//		m2.setId(3);
//		
//		MobileOperationIMPL mimpl4=new MobileOperationIMPL();
//		int res3=mimpl4.deleteMobile(3);
//		if(res3>0) {
//			System.out.println("Mobile Deleted Successfully!");
//		}else {
//			System.out.println("Failed to Delete!");
//		}
	}
}
