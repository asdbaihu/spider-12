package org.zechac.spider.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configurers.ExpressionUrlAuthorizationConfigurer;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;

import java.util.List;

/**
 * Created by Administrator on 2017/5/24.
 */
@Configuration
@EnableWebSecurity
public class SecurityConf  extends WebSecurityConfigurerAdapter {

    protected void configure(HttpSecurity http) throws Exception {
        ExpressionUrlAuthorizationConfigurer<HttpSecurity>.ExpressionInterceptUrlRegistry urlRegistry= http.authorizeRequests().anyRequest().permitAll();
    }

}
