package com.ict.guestbook.model.service;

import java.util.List;

import com.ict.guestbook.model.vo.GuestbookVO;

public interface GuestbookService {
	// ��ü����
	List<GuestbookVO> gb_list();
	
	
	// �󼼺���
	GuestbookVO gb_OneList(String idx);
	
	
	// ����
	int gb_Delete(String idx);
	
	
	// ����
	int gb_Update(GuestbookVO vo);
	
	
	// ����
	int gb_Insert(GuestbookVO vo);
	
}
