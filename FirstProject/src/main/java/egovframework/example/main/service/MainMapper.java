package egovframework.example.main.service;

import java.util.List;

import egovframework.example.main.vo.MainVo;
import egovframework.example.main.vo.Search;

public interface MainMapper {
	List<MainVo> selectClass(Search search) throws Exception;
		 
	public void insertClass(MainVo vo) throws Exception;
	 
    public MainVo selectDetail(int classSeq) throws Exception;
 
    public void updateClass(MainVo vo) throws Exception;
 
    public void deleteClass(int classSeq) throws Exception;    
    
    public int getBoardListCnt(Search search) throws Exception;

}
