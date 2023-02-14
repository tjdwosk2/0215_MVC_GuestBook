package com.ict.guestbook.model.service;

import java.util.List;

import com.ict.guestbook.model.vo.GuestbookVO;

public interface GuestbookService {
	// 전체보기
	List<GuestbookVO> gb_list();
	
	
	// 상세보기
	GuestbookVO gb_OneList(String idx);
	
	
	// 삭제
	int gb_Delete(String idx);
	
	
	// 수정
	int gb_Update(GuestbookVO vo);
	
	
	// 삽입
	int gb_Insert(GuestbookVO vo);
	
}
