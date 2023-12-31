package com.EmployeeProject.Employee.Management.System.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.EmployeeProject.Employee.Management.System.Entity.Employee;
import com.EmployeeProject.Employee.Management.System.Service.EmpService;

import org.springframework.ui.Model;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {

	@Autowired
	private EmpService empService;

	@GetMapping("/")
	public String index( Model m) {

		List<Employee> list=empService.getAllEmp();
		
		m.addAttribute("empList",list);
		
		
		return "index";
	}

	@GetMapping("/loadEmpSave")
	public String save() {

		return "emp_save";
	}

	@GetMapping("/EditEmp{id}")
	public String edit(@PathVariable int id,Model m) {

		/* System.out.println(id); */
		
		Employee employee=empService.getEmpbyId(id);
		
		m.addAttribute("emp",employee);
		
		return "edit_emp";
	}

	@PostMapping("/saveEmp")
	public String saveEmp(@ModelAttribute Employee emp, HttpSession session) {

		Employee newEmp = empService.saveEmp(emp);

		if (newEmp != null) {

			/*
			 * session.setAttribute("msg","Registered Successfully");
			 */
			session.setAttribute("msg","Registered Successfully");	
			
		} else {
			/*
			 * session.setAttribute("msg","Something went Wrong");
			 * 
			 * 
			 */
		session.setAttribute("msg","Something went wrong");	
		}

		return "redirect:/loadEmpSave";
	}
	
	@PostMapping("/updateDetails")
	public String updateEmp(@ModelAttribute Employee emp, HttpSession session) {

		Employee updateEmp = empService.saveEmp(emp);

		if (updateEmp != null) {

			/*
			 * session.setAttribute("msg","Registered Successfully");
			 */
			session.setAttribute("msg","Update Successfully");	
			
		} else {
			/*
			 * session.setAttribute("msg","Something went Wrong");
			 * 
			 * 
			 */
		session.setAttribute("msg","Something went wrong");	
		}

		return "redirect:/";
	}
	

	@GetMapping("/deleteEmp/{id}")
		
	public String deleteEmp(@PathVariable int id,HttpSession session) {
		
		boolean f=empService.deleteEmp(id);
		
		if(f) {
		
		session.setAttribute("msg", "Delete successfully");	
		}else {
			session.setAttribute("msg", "Something went wrong");	
		}
		
		return "redirect:/";
	}
	
	
	

}
