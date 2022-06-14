package DCtown.demo.repository;

import DCtown.demo.model.Member;
import org.hibernate.cfg.JPAIndexHolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface MemberRepository extends JpaRepository<Member,Long> {
    Member findByName(String name);
}
