package com.ict.guestbook.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ict.guestbook.model.service.GuestbookServiceImpl;
import com.ict.guestbook.model.vo.GuestbookVO;


@Controller
public class GuestBookController {
	@Autowired
	private GuestbookServiceImpl guestbookServiceImpl;
	
	private static final Logger logger = LoggerFactory.getLogger(GuestBookController.class);
	
	@RequestMapping(value="list.do", method = RequestMethod.GET)
	public ModelAndView getList() {
		ModelAndView mv = new ModelAndView("list");
		List<GuestbookVO> list = guestbookServiceImpl.gb_list();
		mv.addObject("list", list);
		return mv;
	}
	
	@RequestMapping(value="onelist.do", method = RequestMethod.GET)
	public ModelAndView getOneList(String idx) {
		// logger.info("getList() µµÂø");
		ModelAndView mv = new ModelAndView("onelist");
		GuestbookVO gvo = guestbookServiceImpl.gb_OneList(idx);
		mv.addObject("gvo", gvo);
		return mv;
	}
	
	// »ðÀÔ
	@RequestMapping(value="insert.do", method = RequestMethod.POST)
	public ModelAndView getInsert(GuestbookVO vo) {
		ModelAndView mv = new ModelAndView("index");
		int result  = guestbookServiceImpl.gb_Insert(vo);
		if(result > 0) {
			return mv;
		}else {
			return new ModelAndView("error");
		}
	}
	
	// »èÁ¦
	@RequestMapping(value="delete.do", method = RequestMethod.GET)
	public ModelAndView getDelete(@RequestParam("idx") String idx) {
		ModelAndView mv = new ModelAndView("redirect:list.do");
		int result  = guestbookServiceImpl.gb_Delete(idx);
		if(result > 0) {
			return mv;
		}else {
			return new ModelAndView("error");
		}
	}
	
	// ¼öÁ¤
	@RequestMapping(value="update.do", method = RequestMethod.POST)
	public ModelAndView getDelete(GuestbookVO vo) {
		ModelAndView mv = new ModelAndView("index");
		int result  = guestbookServiceImpl.gb_Update(vo);
		if(result > 0) {
			return mv;
		}else {
			return new ModelAndView("error");
		}
	}
	
	@RequestMapping(value="write.do", method = RequestMethod.GET)
	public ModelAndView getWrite() {
		ModelAndView mv = new ModelAndView("write");
		return mv;
	}
	
	@RequestMapping(value="up.do", method = RequestMethod.POST)
	public ModelAndView getUp(String idx) {
		ModelAndView mv = new ModelAndView("up");
		GuestbookVO gvo = guestbookServiceImpl.gb_OneList(idx);
		mv.addObject("gvo", gvo);
		return mv;
	}
}
