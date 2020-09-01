package com.ntm.generator.orm.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * Spring Boot Demo Orm 系列示例表
 * </p>
 *
 * @author ntm
 * @since 2020-09-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("orm_user")
@ApiModel(value="user对象", description="")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "用户名")
    private String name;

    @ApiModelProperty(value = "加密后的密码")
    private String password;

    @ApiModelProperty(value = "加密使用的盐")
    private String salt;

    @ApiModelProperty(value = "邮箱")
    private String email;

    @ApiModelProperty(value = "手机号码")
    private String phoneNumber;

    @ApiModelProperty(value = "状态，-1：逻辑删除，0：禁用，1：启用")
    private Integer status;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "上次登录时间")
    private Date lastLoginTime;

    @ApiModelProperty(value = "上次更新时间")
    private Date lastUpdateTime;


}
