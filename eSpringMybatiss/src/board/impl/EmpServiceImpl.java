package board.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("empService")
public class EmpServiceImpl { //자동변수명 : empServiceImpl
	
	@Autowired
	private EmpDAOImpl empDAO;
	
	public List<HashMap>selectEmp() {
		return empDAO.selectEmp();
	}
	
}
