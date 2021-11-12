package com.liang.modules.sys.controller;

import com.liang.common.utils.BlogJSONResult;
import com.liang.common.utils.PagedResult;
import com.liang.modules.sys.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: qiang
 * @ProjectName: adminsystem
 * @Package: com.liang.controller
 * @Description: 时间查询文章
 * @Date: 2019/7/10 0010 17:41
 **/
@RestController
public class TimeAtricleController {

    @Autowired
    private ArticleService articleService;

    /**
     * 通过时间查询
     * @param pageSize
     * @param pageNum
     * @param createTime
     * @return
     */
    @GetMapping("/getTime")
    public BlogJSONResult getTime(@RequestParam("pageSize") int pageSize
                                    , @RequestParam("pageNum") int pageNum
                                    , @RequestParam("createTime") String createTime){
        PagedResult byTime = articleService.findByTime(pageNum, pageSize, createTime);
        return BlogJSONResult.ok(byTime);
    }
}
