package eu.cs.ubb.cardbox.repository;

import eu.cs.ubb.cardbox.entity.Card;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by botht on 2/4/2017.
 */
public interface CardRepository extends CrudRepository<Card, Long> {
    List<Card> findAll();
}
