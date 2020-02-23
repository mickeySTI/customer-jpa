package hello;

import java.util.List;

import org.springframework.data.repository.CrudRepository; // CRUD

public interface CustomerRepository extends CrudRepository<Customer, Long> {

  List<Customer> findByLastName(String lastName);
  
  List<Customer> findAllByOrderByLastNameAsc();
  
  List<Customer> findFirst3ByOrderByLastNameAsc();

}