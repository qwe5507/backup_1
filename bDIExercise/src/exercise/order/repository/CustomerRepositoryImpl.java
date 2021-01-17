package exercise.order.repository;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import exercise.order.domain.Customer;


//@Component
@Repository
public class CustomerRepositoryImpl implements CustomerRepository {


	@Override
	public void save(Customer customer) {
		System.out.println(customer + "가 저장되었습니다.");
	}
	@Override
	public void delete(long id) {
		System.out.println(id + "번 고객이 삭제되었습니다.");
	}

}