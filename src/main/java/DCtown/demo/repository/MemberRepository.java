package DCtown.demo.repository;

import DCtown.demo.model.Member;
import org.springframework.data.repository.CrudRepository;

public interface MemberRepository extends CrudRepository<Member,Integer> {
}
