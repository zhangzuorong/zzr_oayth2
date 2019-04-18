package com.zzr.oauth2.config.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * 开发公司：山东海豚数据技术有限公司
 * 版权：山东海豚数据技术有限公司
 * <p>
 * WebSecurityConfig
 *
 * @author zzr
 * @created Create Time: 2019/4/16
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
    @Autowired
    private UserServiceDetail userServiceDetail;

    //配置请求是否需要安全认证
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests().anyRequest().authenticated()
            .and()
            .csrf().disable();
    }

    //配置验证的用户信息源和密码加密策略
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        //BCryptPasswordEncoder 密码加密方式
        //auth.userDetailsService(userServiceDetail).passwordEncoder(new BCryptPasswordEncoder());
        auth.userDetailsService(userServiceDetail);
    }

    //配置验证管理的Bean
    @Override
    @Bean
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

}
