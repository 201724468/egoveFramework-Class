package egovframework.example.main.controller;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import egovframework.example.main.service.MainService;
import egovframework.example.main.vo.MainVo;
import egovframework.example.main.vo.Search;

@Controller
public class MainController {

	private final String PagePath = "class/";
	
	@Autowired
	private MainService service;
	
	@RequestMapping(value="/class/classList.do")
	public String classListDo(HttpServletRequest request, MainVo vo, Model model
			,@RequestParam(required=false,defaultValue="1")int page
            ,@RequestParam(required=false,defaultValue="1")int range
            ,@RequestParam(required=false,defaultValue="className")String searchType
            ,@RequestParam(required=false)String keyword
            ,@ModelAttribute("search")Search search)throws NullPointerException, IOException, SQLException, Exception{

		String pgMode = vo.getPgMode();

		if("create".equals(pgMode)) {
			return classRegister();
			
		}else if("edit".equals(pgMode)){
			return viewForm(model, request);
			
		}else {
			model.addAttribute("search", search);
	        search.setSearchType(searchType);
	        search.setKeyword(keyword);
	        
	        //전체 개시글 개수
	        int listCnt = service.getBoardListCnt(search);

	        //검색 후 페이지
	        search.pageInfo(page, range, listCnt);
	        //페이징
	        model.addAttribute("pagination", search);
	        //게시글 화면 출력
	        model.addAttribute("list", service.selectClass(search));

//			model.addAttribute("list", service.selectClass(vo));
			return PagePath + "classList";
		}
	}
	
	//수업 상세페이지
    @RequestMapping(value="/class/classDetail.do")
    public String viewForm(Model model, HttpServletRequest request) throws NullPointerException, IOException, SQLException, Exception{
        int classSeq = Integer.parseInt(request.getParameter("classSeq"));
        
        MainVo vo = service.selectDetail(classSeq);
        model.addAttribute("vo", vo);
        vo.setPgMode("edit");
        
        return PagePath + "classDetail";
    }
    
    //수업작성페이지
    @RequestMapping(value="/class/classRegister.do")
    public String classRegister()throws NullPointerException, IOException, SQLException, Exception{
        return PagePath + "classRegister";
    }
    
    //수업쓰기
    @RequestMapping(value="/insertClass.do")
    public String insertClass(@ModelAttribute("MainVo") MainVo vo) throws NullPointerException, IOException, SQLException, Exception {
        service.insertClass(vo);
        return "redirect:"+ PagePath + "classList.do";
    }
    
    //수업수정
    @RequestMapping(value="/updateClass.do")
    public String updateClass(@ModelAttribute("MainVo") MainVo vo) throws NullPointerException, IOException, SQLException, Exception {
        service.updateClass(vo);
        return "redirect:"+ PagePath + "classList.do";
    }
    
    //수업삭제
    @RequestMapping(value="/deleteClass.do")
    public String deleteClass(HttpServletRequest request) throws NullPointerException, IOException, SQLException, Exception {
        int classSeq = Integer.parseInt(request.getParameter("classSeq"));
        service.deleteClass(classSeq);
        return "redirect:"+ PagePath + "classList.do";
    }

}
