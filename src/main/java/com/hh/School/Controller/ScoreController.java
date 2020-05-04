package com.hh.School.Controller;
/**
* @author hehuan
* @date 2020年5月1日下午6:00:16
*/

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hh.School.entity.Course;
import com.hh.School.entity.Score;
import com.hh.School.entity.ScorePK;
import com.hh.School.entity.Student;
import com.hh.School.service.ScoreService;
@Controller
public class ScoreController {
	@Autowired
	private ScoreService scoreService;
//	//查询所有 @ResponseBody可以将list转换成json字符串
//	@RequestMapping("/listScore")
//	public @ResponseBody List<Score> listScore(Model model) throws Exception{
//		 List<Score> list=scoreService.findAll();
//		// list.get(0).getClasses().getClassname();
//	        model.addAttribute("lists", list);
//	        return list;	
//	}
	
	//查询所有 @ResponseBody可以将list转换成json字符串
		@RequestMapping("/listScore")
		public String listScore(Model model) throws Exception{
			 List<Score> list=scoreService.findAll();
			// list.get(0).getClasses().getClassname();
		        model.addAttribute("lists", list);
		        return "listScore";	
		}
		
		//添加成绩
		@RequestMapping("/addScore")
		public String addScore(Score score) throws Exception{
			scoreService.saveScore(score);
		        return "redirect:listScore";
		}
		 //删除成绩
	    @RequestMapping("/deleteScore")
	    public String deleteScore(Score score) throws Exception {
	    	scoreService.deleteScore(score);
	        return "redirect:listScore";
	    }
	    
	    
	  //修改成绩
	    @RequestMapping("/updateScore")
	    public String updateScore(Score score) throws Exception { 
	    	//System.out.println("成绩："+score.getScore());
	    	scoreService.saveScore(score);
	        return "redirect:listScore";
	    }
	    
	    
//	   
//	    //编辑成绩
//	    @RequestMapping("/editScore")
//	    public String editScore(ScorePK scorePK,Model model) throws Exception {
//	    	System.out.println("name:"+scorePK.getStudent().getSname());
//	        Score s=scoreService.findByIDbyJPA(scorePK);
//	        System.out.println("学生姓名："+s.getScorePK().getStudent().getSname());
//	        System.out.println("课程名称："+s.getScorePK().getCourse().getCoursename());
//	        System.out.println("成绩："+s.getScore());
//	        model.addAttribute("c", s);
//	        return "editScore";
//	    }
	  //编辑成绩
	    @RequestMapping("/editScore")
	    public String editScore(Student student,Course course,Model model) throws Exception {
	    	ScorePK scorePK = new ScorePK(student, course);
	    	//System.out.println("sno:"+scorePK.getStudent().getSno());
	    	//System.out.println("cno:"+scorePK.getCourse().getCno());
	        Score s=scoreService.findByIDbyJPA(scorePK);        
//	        System.out.println("成绩："+s.getScore());
//	        System.out.println("学号:"+s.getScorePK().getStudent().getSno());
//	        System.out.println("课程号:"+s.getScorePK().getCourse().getCno());
	        model.addAttribute("c", s);
	       // System.out.println(model.getAttribute("c").toString());
	        return "editScore";
	    }

}
