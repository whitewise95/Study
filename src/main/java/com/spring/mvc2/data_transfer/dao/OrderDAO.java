package com.spring.mvc2.data_transfer.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.mvc2.data_transfer.domain.OrderDTO;

@Repository
public class OrderDAO {

	
	@Autowired
	private SqlSession 	sqlSessin;
	
	public List<OrderDTO> selectAll(){
		
		return sqlSessin.selectList("order.selectAll");
	}
	//Mapper > DAO 전송 예시) 단일 데이터 전송 
	public int selectData1() {
		
		
		return sqlSessin.selectOne("order.select1");
	}
	
	// Mapper > DAO 전송 예시 2) DTO 클래스 리스트  전송
	public List<OrderDTO> selectData2(){
		
		
		return sqlSessin.selectList("order.select2");
	}
	
	
	// Mapper > DAO 전송 예시 3) Map 클래스 리스트  전송
	public List<Map<String, Object>> selectData3(){
		
		return sqlSessin.selectList("order.select3");
	}
	public List<Map<String, Object>> selectData4(){
		
		return sqlSessin.selectList("order.select4");
	}
	
	
	//============================================================================================
	
	//DAO > Mapper전송 예시 1) 단일 데이터 전송

	public void insertOne(String productName){
		sqlSessin.insert("order.insertOneData", productName);
	}
	
	
	
	//DAO > Mapper전송 예시 2) DTO 데이터 전송
	public void insertDTO(OrderDTO orderDTO){
		sqlSessin.insert("order.insertDTO", orderDTO);
	}
	
	
	
	//DAO > Mapper전송 예시 3) Map 데이터 전송
	public void insertMap(Map orderMap){
		sqlSessin.insert("order.insertMap", orderMap);
	}
	
}
