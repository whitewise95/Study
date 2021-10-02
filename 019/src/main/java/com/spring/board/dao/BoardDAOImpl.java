package com.spring.board.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.board.dto.BoardDTO;

@Repository // DAO는 @Repository를 명시하여야 한다.
public class BoardDAOImpl implements BoardDAO {
	
	@Autowired		
	private SqlSession sqlSession;	// Mybatis를 사용하기 위한 객체 생성
	
	@Override
	public void insert(BoardDTO bdto) throws Exception {
		sqlSession.insert("mapper.board.insertBoard" , bdto); //insert(namespace명.id명 , 매개변수);
	}

	@Override
	public List<BoardDTO> selectAll() throws Exception {
		return sqlSession.selectList("mapper.board.getAllBoard");
	}

	@Override
	public void increaseReadCount(int num) throws Exception {
		sqlSession.update("mapper.board.increaseReadCount" , num);
	}

	@Override
	public BoardDTO selectOne(int num) throws Exception {
		return sqlSession.selectOne("mapper.board.getOneBoard" , num);
	}

	@Override
	public BoardDTO validateUserCheck(BoardDTO bdto) throws Exception {
		return sqlSession.selectOne("mapper.board.validateUserCheck" , bdto);
	}

	@Override
	public void update(BoardDTO bdto) throws Exception {
		sqlSession.update("mapper.board.updateBoard" , bdto);
	}

	@Override
	public void delete(int num) throws Exception {
		sqlSession.delete("mapper.board.deleteBoard" , num);
	}
	
	
}

