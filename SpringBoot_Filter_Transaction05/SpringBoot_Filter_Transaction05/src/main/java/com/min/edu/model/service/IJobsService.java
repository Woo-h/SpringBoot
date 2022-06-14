package com.min.edu.model.service;

import java.util.List;
import java.util.Map;

import com.min.edu.vo.JobsVo;

public interface IJobsService {

	//전체 조회
	public List<JobsVo> allSelectJob();

	//입력
	public int InsertJob(Map<String, Object> map);

	//수정
	public int updateJob();
	
	//Trancation
	public int transaction(Map<String, Object> map);

}
