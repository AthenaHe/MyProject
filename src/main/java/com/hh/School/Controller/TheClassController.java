package com.hh.School.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.hh.School.entity.TheClass;
import com.hh.School.service.TheClassService;

/**
* @author hehuan
* @date 2020年5月1日下午4:10:42
*/
@Controller
public class TheClassController {
	@Autowired
	private TheClassService theClassService;

//	//查询所有
//	@RequestMapping("/listClass")
//	public String listClass(Model model) throws Exception{
//		 List<TheClass> list=theClassService.findAll();
//	        model.addAttribute("lists", list);
//	        return "listClass";	
//	}
		
//		//添加班级
//		@RequestMapping("/addClass")
//		public String addClass(TheClass theClass) throws Exception{
//			theClassService.saveTheClass(theClass);
//		        return "redirect:listClass";
//		}
	
	//查询所有hbuilder
		@RequestMapping("/listClass")
		public String listClass(Model model) throws Exception{
			 List<TheClass> list=theClassService.findAll();
		        model.addAttribute("lists", list);
		        return "listClass";	
		}
	//添加班级hbuilder
			@PostMapping("/addClass")
			public TheClass addClass(TheClass theClass) throws Exception{
				System.out.println("ok");
				return theClassService.saveTheClass(theClass);
			      
			}
		 //删除班级
	    @RequestMapping("/deleteClass")
	    public String deleteClass(TheClass theClass) throws Exception {
	    	theClassService.deleteTheClass(theClass);
	        return "redirect:listClass";
	    }
	    //修改班级
	    @RequestMapping("/updateClass")
	    public String updateClass(TheClass theClass) throws Exception {
	    	theClassService.saveTheClass(theClass);
	        return "redirect:listClass";
	    }
	    //编辑班级
	    @RequestMapping("/editClass")
	    public String editClass(int classid,Model model) throws Exception {
	        TheClass s=theClassService.findByIDbyJPA(classid);
	        model.addAttribute("c", s);
	        return "editClass";
	    }

}
