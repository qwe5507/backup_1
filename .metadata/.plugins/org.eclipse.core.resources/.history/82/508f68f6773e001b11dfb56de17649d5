package board.impl;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("empDAO")
public class EmpDAOImpl { //자동객체명 : empDAOImpl
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	public List<HashMap> selectEmp() {
		System.out.println("EmpDAOImpl 에 selectEmp() 호출");
		return sqlSession.selectList("EmpDAO.selectEmp");
	}
}
