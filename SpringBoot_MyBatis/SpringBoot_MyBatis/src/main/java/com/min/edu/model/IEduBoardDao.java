package com.min.edu.model;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.min.edu.vo.EduVo;

@Mapper
public interface IEduBoardDao {

	public List<EduVo> selectBoard();
	
}
