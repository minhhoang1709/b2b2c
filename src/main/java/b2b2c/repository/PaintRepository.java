package b2b2c.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import b2b2c.model.PaintModel;

@Repository
public interface PaintRepository extends JpaRepository<PaintModel, Integer> {

}
