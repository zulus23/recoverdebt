package ru.zhukov.recoverdebt.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
/*@EnableWebSecurity*/
/*@Order(Ordered.HIGHEST_PRECEDENCE)*/
public class SecurityConfig  extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/").permitAll()

                .antMatchers("/resources/**").permitAll()
                .anyRequest().authenticated()
                .and()
                 .formLogin()
                 .loginPage("/login")
                 .permitAll();
    }
}
