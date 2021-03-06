package egovframework.example.main.service;

import java.util.List;

import egovframework.example.main.vo.MainVo;
import egovframework.example.main.vo.Search;

public interface MainService {
	public List<MainVo> selectClass(Search search) throws Exception;
	 
	public void insertClass(MainVo mainVo) throws Exception;
	 
    public MainVo selectDetail(int classSeq) throws Exception;
 
    public void updateClass(MainVo mainVo) throws Exception;
 
    public void deleteClass(int classSeq) throws Exception;
    
    public int getBoardListCnt(Search search) throws Exception;

}
