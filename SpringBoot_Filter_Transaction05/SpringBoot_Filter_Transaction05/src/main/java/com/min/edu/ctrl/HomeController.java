package com.min.edu.ctrl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.min.edu.model.service.IJobsService;
import com.min.edu.vo.JobsVo;

@Controller
public class HomeController {

	private static final Logger log = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private IJobsService service;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcomePage(Model model) {
		log.info("HomeController welcomePage");
		return "intro";
	}
	
	@RequestMapping(value = "/selectJobs.do", method = RequestMethod.GET)
	public String select(Model model) {
		log.info("HomeController 전체조회 Select");
		List<JobsVo> lists = service.allSelectJob();
		model.addAttribute("selectResult", lists);
		return "result";
	}
	
	
	@RequestMapping(value = "/insertJobs.do", method = RequestMethod.POST)
	public String insert(@RequestParam Map<String, Object> map, Model model) {
		log.info("HomeController 입력 insert ,  form 값 : {}", map);
		int cnt = service.InsertJob(map);
		model.addAttribute("insertResult", cnt);
		return "result";
	}
	
	@RequestMapping(value = "/updateJobs.do", method = RequestMethod.GET)
	public String update(Model model) {
		log.info("HomeController 수정 update");
		int cnt = service.updateJob();
		model.addAttribute("updateResult", cnt);
		return "result";
	}
	
	@RequestMapping(value = "/transaction.do", method = RequestMethod.GET)
	public String trancation(Model model) {
		log.info("HomeController 수정 trancation");
		int cnt = service.transaction(new HashMap<String, Object>());
		model.addAttribute("trancation", cnt);
		return "result";
	}
	
	
}



