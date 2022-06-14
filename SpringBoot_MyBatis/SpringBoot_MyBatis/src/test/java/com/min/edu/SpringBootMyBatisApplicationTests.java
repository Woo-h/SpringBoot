package com.min.edu;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.min.edu.model.IEduBoardDao;
import com.min.edu.vo.EduVo;

@SpringBootTest
class SpringBootMyBatisApplicationTests {

	@Autowired
	private IEduBoardDao mapper;
	
	@Test
	void contextLoads() {
		List<EduVo> lists = mapper.selectBoard();
		System.out.println("쿼리 테스트 결과 :"+lists.get(0));
	}

}
