package com.hh.School.Controller;
/**
* @author hehuan
* @date 2020年5月1日下午1:32:11
*/
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hh.School.entity.Student;
import com.hh.School.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/index")
	public ModelAndView mvcindex() {
		return new ModelAndView("index");
	}

//	//查询所有
//	@RequestMapping("/listStudent")
//	public @ResponseBody List<Student> listStudent(Model model) throws Exception{
//		 List<Student> list=studentService.findAll();
//		// list.get(0).getClasses().getClassname();
//	        model.addAttribute("lists", list);
//	        return list;	
//	}
	
	//查询所有
		@RequestMapping("/listStudent")
		public String listStudent(Model model) throws Exception{
			 List<Student> list=studentService.findAll();
			// list.get(0).getClasses().getClassname();
		        model.addAttribute("lists", list);
		        return "listStudent";	
		}	
		
		//添加学生
		@RequestMapping("/addStudent")
		public String addStudent(Student student) throws Exception{
			studentService.saveStudent(student);
		        return "redirect:listStudent";
		}
		 //删除学生
	    @RequestMapping("/deleteStudent")
	    public String deleteStudent(Student student) throws Exception {
	        studentService.deleteStudent(student);
	        return "redirect:listStudent";
	    }
	    //修改学生
	    @RequestMapping("/updateStudent")
	    public String updateStudent(Student student) throws Exception {
	        studentService.saveStudent(student);
	        return "redirect:listStudent";
	    }
	    //编辑学生
	    @RequestMapping("/editStudent")
	    public String editStudent(int sno,Model model) throws Exception {
	        Student s=studentService.findByIDbyJPA(sno);
	        model.addAttribute("c", s);
	        return "editStudent";
	    }

}
