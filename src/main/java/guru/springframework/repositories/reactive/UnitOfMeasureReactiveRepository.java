package guru.springframework.repositories.reactive;

import guru.springframework.domain.UnitOfMeasure;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by jt on 8/17/17.
 */
@Repository
public interface UnitOfMeasureReactiveRepository extends ReactiveMongoRepository<UnitOfMeasure, String> {
}