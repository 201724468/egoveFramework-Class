package egovframework.example.main.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import egovframework.example.main.dao.MainDao;
import egovframework.example.main.service.MainMapper;
import egovframework.example.main.vo.MainVo;
import egovframework.example.main.vo.Search;

@Repository
public class MainDaoImpl implements MainDao {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
    public List<MainVo> selectClass(Search search) throws Exception {
		MainMapper mapper = sqlSession.getMapper(MainMapper.class);
		
        return mapper.selectClass(search);
    }
	
	@Override
    public void insertClass(MainVo vo) throws Exception {
		MainMapper mapper = sqlSession.getMapper(MainMapper.class);
        mapper.insertClass(vo);
    }
 
    @Override
    public MainVo selectDetail(int classSeq) throws Exception {
    	MainMapper mapper = sqlSession.getMapper(MainMapper.class);
        return mapper.selectDetail(classSeq);
    }
 
    @Override
    public void updateClass(MainVo vo) throws Exception {
        MainMapper mapper = sqlSession.getMapper(MainMapper.class);
        mapper.updateClass(vo);
    }
 
    @Override
    public void deleteClass(int classSeq) throws Exception {
        MainMapper mapper = sqlSession.getMapper(MainMapper.class);
        mapper.deleteClass(classSeq);
    }
    
    @Override
    public int getBoardListCnt(Search search) throws Exception {
    	MainMapper mapper = sqlSession.getMapper(MainMapper.class);
        return mapper.getBoardListCnt(search);
    }

}
