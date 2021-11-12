package com.liang.modules.sys.dao;

import com.liang.modules.sys.entity.VO.UsersVOEntity;
import org.springframework.stereotype.Repository;

/**
 * @Author: qiang
 * @ProjectName: adminsystem
 * @Package: com.liang.modules.sys.dao
 * @Description:
 * @Date: 2019/8/17 0017 12:44
 **/
@Repository
public interface UsersLoginDao {
    UsersVOEntity findByPhone(String phone);

}
