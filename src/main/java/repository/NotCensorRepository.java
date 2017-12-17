package repository;

import model.NotCensor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface NotCensorRepository extends JpaRepository<NotCensor,Long> {

}
