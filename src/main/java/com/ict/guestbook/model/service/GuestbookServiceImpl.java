package com.ict.guestbook.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ict.guestbook.model.dao.GuestbookDAO;
import com.ict.guestbook.model.vo.GuestbookVO;

@Service
public class GuestbookServiceImpl implements GuestbookService{
	@Autowired
	GuestbookDAO dao;
	
	@Override
	public List<GuestbookVO> gb_list() {
		return dao.getList();
	}
	
	@Override
	public GuestbookVO gb_OneList(String idx) {
		return dao.getOneList(idx);
	}
	
	@Override
	public int gb_Delete(String idx) {
		return dao.getDelete(idx);
	}
	
	@Override
	public int gb_Update(GuestbookVO vo) {
		return dao.getUpdate(vo);
	}
	
	@Override
	public int gb_Insert(GuestbookVO vo) {
		return dao.getInsert(vo);
	}
}
