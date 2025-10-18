package kai_yakovchuk.spring_db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kai_yakovchuk.spring_db.entity.Laptop;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Integer> {
}