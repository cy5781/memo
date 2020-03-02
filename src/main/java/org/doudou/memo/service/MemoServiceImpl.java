package org.doudou.memo.service;

import org.doudou.memo.entity.Memo;
import org.doudou.memo.repository.MemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemoServiceImpl implements MemoService {

    @Autowired
    MemoRepository memoRepository;

    @Override
    public List<Memo> getMemoList() {
        return memoRepository.findAll();
    }

    @Override
    public Memo findById(long id) {
        return memoRepository.findById(id);
    }

    @Override
    public void saveMemo(Memo memo) {
        memoRepository.save(memo);
    }

    @Override
    public void editMemo(Memo memo) {
        memoRepository.save(memo);
    }

    @Override
    public void deleteMemo(long id) {
        memoRepository.deleteById(id);
    }

}
