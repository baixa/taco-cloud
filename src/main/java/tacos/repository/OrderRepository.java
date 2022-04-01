package tacos.repository;

import org.springframework.data.repository.CrudRepository;
import tacos.classes.TacoOrder;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {
}
