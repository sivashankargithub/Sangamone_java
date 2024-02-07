package pkg1.test;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterRepo1 extends JpaRepository<ClassEntity, Integer> {
}
