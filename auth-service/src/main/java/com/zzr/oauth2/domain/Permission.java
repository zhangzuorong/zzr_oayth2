package com.zzr.oauth2.domain;

import org.springframework.security.core.GrantedAuthority;

/**
 * 开发公司：山东海豚数据技术有限公司
 * 版权：山东海豚数据技术有限公司
 * <p>
 * Permission
 *
 * @author zzr
 * @created Create Time: 2019/4/16
 */
public class Permission implements GrantedAuthority{
    private String permissionCode;

    public Permission(String permissionCode){
        this.permissionCode = permissionCode;
    }

    @Override
    public String getAuthority() {
        return permissionCode;
    }
}
