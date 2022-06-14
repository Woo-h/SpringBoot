package com.min.edu.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EduVo {

	private int seq;
	private String id;
	private String title;
	private String content;
	private String delflag;
	private String regdate;
	@Override
	public String toString() {
		return "EduVo [seq=" + seq + ", id=" + id + ", title=" + title + ", content=" + content + ", delflag=" + delflag
				+ ", regdate=" + regdate + "]";
	}
	
	
}
