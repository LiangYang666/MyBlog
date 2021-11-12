package com.liang.modules.sys.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Set;

/**
 * @Author: qiang
 * @ProjectName: adminsystem
 * @Package: com.liang.modules.sys.entity
 * @Description: 留言实体类
 * @Date: 2019/7/24 0024 17:13
 **/
@Data
@TableName(value = "guest")
public class GuestEntity implements Serializable {

    private static final long serialVersionUID = -7136211463796574497L;
    /**
     * 主键
     */
    @TableId
    private Long id;

    /**
     * 留言者id
     */
    private String userId;

    /**
     * 留言内容
     */
    private String message;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 点赞数
     */
    private Integer likes;

    /**
     * 1  -- 未读  0 -- 已读
     */
    private Integer isRead = 1;

    /**
     * 留言者名称
     */
    private String authorName;

    /**
     * 一条留言可以有多个评论
     */
    @TableField(exist = false)
    private Set<RepGuestEntity> reportCommentSet;

}
