package com.zzr.oauth2.config.security;

import com.zzr.oauth2.domain.Permission;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


/**
 * 开发公司：山东海豚数据技术有限公司
 * 版权：山东海豚数据技术有限公司
 * <p>
 * UserServiceDetail
 *
 * @author zzr
 * @created Create Time: 2019/4/16
 */
@Service
public class UserServiceDetail implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return new UserDetails() {
            @Override
            public Collection<? extends GrantedAuthority> getAuthorities() {
                List<Permission> list = new ArrayList<>();
                list.add(new Permission("permission1"));
                list.add(new Permission("permission2"));
                list.add(new Permission("permission3"));
                return list;
            }

            @Override
            public String getPassword() {
                return "123456";
            }

            @Override
            public String getUsername() {
                return "zzr";
            }

            @Override
            public boolean isAccountNonExpired() {
                return true;
            }

            @Override
            public boolean isAccountNonLocked() {
                return true;
            }

            @Override
            public boolean isCredentialsNonExpired() {
                return true;
            }

            @Override
            public boolean isEnabled() {
                return true;
            }
        };
    }
}
