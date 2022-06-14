package com.min.edu.model.service;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.min.edu.model.mapper.IJobsMapper;
import com.min.edu.vo.JobsVo;

@Service
public class JobsServiceImpl implements IJobsService{

	private static final Logger log = LoggerFactory.getLogger(JobsServiceImpl.class);
	
	@Autowired
	private IJobsMapper dao;
	
	@Override
	public List<JobsVo> allSelectJob() {
		log.info("JobsServiceImpl : Jobs테이블 전체 조회 allSelectJob");
		return dao.allSelectJob();
	}

	@Override
	public int InsertJob(Map<String, Object> map) {
		log.info("JobsServiceImpl : 입력 InsertJob, 전달 값 : ", map);
		return dao.InsertJob(map);
	}

	@Override
	public int updateJob() {
		log.info("JobsServiceImpl : USEAGE N으로 재입력 updateJob");
		return dao.updateJob();
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	  public int transaction(Map<String, Object> map) {
		log.info("JobsServiceImpl : Transation update 실행");
	    int m = dao.updateJob();  
	    log.info("JobsServiceImpl : Trancation insert 실행");
	    int n = dao.InsertJob(map);
	  return (m>0 || n>0)?1:0;
	}

	
}
