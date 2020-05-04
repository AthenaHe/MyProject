package com.hh.School.Controller;
/**
* @author hehuan
* @date 2020年5月1日下午5:09:31
*/

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hh.School.entity.Course;
import com.hh.School.service.CourseService;

@Controller
public class CourseController {
	@Autowired
	private CourseService courseService;
	//查询所有
		@RequestMapping("/listCourse")
		public String listStudent(Model model) throws Exception{
			 List<Course> list=courseService.findAll();
			// list.get(0).getClasses().getClassname();
		        model.addAttribute("lists", list);
		        return "listCourse";	
		}
	//添加课程
	@RequestMapping("/addCourse")
	public String addCourse(Course course) throws Exception{
		courseService.saveCourse(course);
	    return "redirect:listCourse";
	}
	//删除课程
    @RequestMapping("/deleteCourse")
    public String deleteCourse(Course course) throws Exception {
    	courseService.deleteCourse(course);
        return "redirect:listCourse";
    }
    //修改课程
    @RequestMapping("/updateCourse")
    public String updateCourse(Course course) throws Exception {
    	courseService.saveCourse(course);
        return "redirect:listCourse";
    }
    //编辑课程
    @RequestMapping("/editCourse")
    public String editCourse(int cno,Model model) throws Exception {
        Course s=courseService.findByIDbyJPA(cno);
        model.addAttribute("c", s);
        return "editCourse";
    }

}
