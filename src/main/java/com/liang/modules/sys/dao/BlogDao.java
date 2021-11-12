package com.liang.modules.sys.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.liang.modules.sys.entity.VO.BlogMessageVOEntity;
import org.springframework.stereotype.Repository;

/**
 * @Author: qiang
 * @ProjectName: adminsystem
 * @Package: com.liang.modules.sys.dao
 * @Description:
 * @Date: 2019/8/17 0017 15:44
 **/
@Repository
public interface BlogDao extends BaseMapper<BlogMessageVOEntity> {
}
