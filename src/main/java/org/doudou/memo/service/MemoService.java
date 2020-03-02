package org.doudou.memo.service;

import org.doudou.memo.entity.Memo;

import java.util.List;

public interface MemoService {
    public List<Memo> getMemoList();
    public Memo findById(long id);
    public void saveMemo(Memo memo);
    public void editMemo(Memo memo);
    public void deleteMemo(long id);
}
