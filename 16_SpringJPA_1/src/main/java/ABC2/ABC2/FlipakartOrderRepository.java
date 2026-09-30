package ABC2.ABC2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface FlipakartOrderRepository extends JpaRepository<FlipakartOrder, Long>{

}
