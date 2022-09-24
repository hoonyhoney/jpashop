package jpabook.jpashop;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class MemberRepository {

    @PersistenceContext
    private EntityManager em;

    public Long save(Member mebmer){
        em.persist(mebmer); //persist는 merge같은 의미
        return mebmer.getId();
    }

    public Member find(Long id) {
        return em.find(Member.class, id);
    }
}
