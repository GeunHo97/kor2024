package pro.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pro.model.entity.MemberEntity;

public interface MemberRepository extends JpaRepository<MemberEntity,Integer> {
}
