package adv.web.hcc;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;


@Repository

public interface FlowerRepo extends CrudRepository<Flower, String> {
}