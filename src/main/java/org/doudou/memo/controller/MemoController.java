package org.doudou.memo.controller;

import org.doudou.memo.entity.Memo;
import org.doudou.memo.service.MemoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class MemoController {

    @Resource
    MemoService memoService;

    @RequestMapping("/")
    public String index() {
        return "redirect:/list";
    }

    @RequestMapping("/list" )
    public String list(Model model) {
        List<Memo> memos = memoService.getMemoList();
        model.addAttribute("memos", memos);
        return "memo/list";
    }

    @RequestMapping("/toAdd")
    public String toAdd() {
        return "memo/memoAdd";
    }

    @RequestMapping("/add")
    public String add(Memo memo) {
        memoService.saveMemo(memo);
        return "redirect:/list";
    }

    @RequestMapping("/toEdit")
    public String toEdit(Model model,Long id) {
        Memo memo=memoService.findById(id);
        model.addAttribute("memo", memo);
        return "memo/memoEdit";
    }

    @RequestMapping("/edit")
    public String edit(Memo memo) {
        memoService.editMemo(memo);
        return "redirect:/list";
    }


    @RequestMapping("/delete")
    public String delete(Long id) {
        memoService.deleteMemo(id);
        return "redirect:/list";
    }

}
