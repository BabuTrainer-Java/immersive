package demo121;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import beans.EmpBean;
import java.util.*;

@RestController
public class EmpController {
List <EmpBean> emps;
@GetMapping("/empall")
public List<EmpBean> getEmpBean()
	{
	 emps=new ArrayList();
				
		EmpBean  e1=new EmpBean();
		e1.setEid(101);
		e1.setEname("ravi");
		e1.setEsal(18000);
		
		
		EmpBean  e2=new EmpBean();
		e2.setEid(102);
		e2.setEname("kamal");
		e2.setEsal(19000);
		
		
		EmpBean  e3=new EmpBean();
		e3.setEid(103);
		e3.setEname("suma");
		e3.setEsal(32000);
		
		emps.add(e1);
		emps.add(e2);
		emps.add(e3);
				
		return emps;	
	}

@GetMapping("emp1/{id}")	
public EmpBean getEmpBean(@PathVariable int id)
{
	for(EmpBean e:emps)
	{
	if(e.getEid()==id)
	{
		return e;
	}
	}
return new EmpBean();
}





	
}
