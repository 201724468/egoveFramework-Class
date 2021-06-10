package egovframework.example.main.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import egovframework.example.main.dao.MainDao;
import egovframework.example.main.service.MainService;
import egovframework.example.main.vo.MainVo;
import egovframework.example.main.vo.Search;

@Service
public class MainServiceImpl implements MainService{
	@Autowired
    private MainDao dao;
    
    @Override
    public List<MainVo> selectClass(Search search) throws Exception {
        return dao.selectClass(search);
    }
    
    @Override
    public void insertClass(MainVo vo) throws Exception {
    	dao.insertClass(vo);
    }
 
    @Override
    public MainVo selectDetail(int classSeq) throws Exception {
        return dao.selectDetail(classSeq);
    }
 
    @Override
    public void updateClass(MainVo vo) throws Exception {
    	dao.updateClass(vo);
    }
 
    @Override
    public void deleteClass(int classSeq) throws Exception {
    	dao.deleteClass(classSeq);
    }
    
    @Override
    public int getBoardListCnt(Search search) throws Exception {
        return dao.getBoardListCnt(search);
    }



}
