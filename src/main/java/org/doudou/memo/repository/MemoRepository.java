package org.doudou.memo.repository;

import org.doudou.memo.entity.Memo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemoRepository extends JpaRepository<Memo, Long> {
    Memo findById(long id);
    void deleteById(Long id);
}
