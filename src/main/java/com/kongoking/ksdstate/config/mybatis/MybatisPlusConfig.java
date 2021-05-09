package com.kongoking.ksdstate.config.mybatis;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author luonianxin
 * @Description mybatis分页插件的配置类
 * @Date 2021/5/3
 */
@Configuration
public class MybatisPlusConfig {

    // 配置分页插件
    @Bean
    public PaginationInterceptor paginationInterceptor(){
        return new PaginationInterceptor();
    }
}

