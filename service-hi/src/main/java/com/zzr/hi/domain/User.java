package com.zzr.hi.domain;


import lombok.Data;

/**
 * 开发公司：山东海豚数据技术有限公司
 * 版权：山东海豚数据技术有限公司
 * <p>
 * User
 *
 * @author zzr
 * @created Create Time: 2019/4/17
 */

@Data
public class User {
    private Long id;

    private String username;

    private String password;
}
