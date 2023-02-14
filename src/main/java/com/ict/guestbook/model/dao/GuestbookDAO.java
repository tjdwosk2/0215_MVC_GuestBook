package com.ict.guestbook.model.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import com.ict.guestbook.model.vo.GuestbookVO;


public class GuestbookDAO {
	private SqlSessionTemplate sqlSessionTemplate;

	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}
	
	public List<GuestbookVO> getList(){
		return sqlSessionTemplate.selectList("gb.list");
	}
	
	public GuestbookVO getOneList(String idx){
		return sqlSessionTemplate.selectOne("gb.onelist", idx);
	}
	
	public int getInsert(GuestbookVO vo){
		return sqlSessionTemplate.insert("gb.insert", vo);
	}
	
	public int getDelete(String idx){
		return sqlSessionTemplate.delete("gb.delete", idx);
	}

	public int getUpdate(GuestbookVO vo){
		return sqlSessionTemplate.update("gb.update", vo);
	}
}
