package com.min.edu.model.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.min.edu.vo.JobsVo;

@Mapper
public interface IJobsMapper {
	
	//전체 조회
	public List<JobsVo> allSelectJob();
	
	//입력
	public int InsertJob(Map<String, Object> map);
	
	//수정
	public int updateJob();
	
}
