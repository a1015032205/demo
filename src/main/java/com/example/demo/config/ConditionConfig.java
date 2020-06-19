package com.example.demo.config;

import com.example.demo.demo.impl.GpCondition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import sun.plugin.com.BeanClass;


/**
 * @Author: 秒度
 * @Email: fangxin.md@Gmail.com
 * @Date: 2020-06-18 23:04
 * @Description:
 */
@Configuration
public class ConditionConfig {

    @Bean
    @Conditional(GpCondition.class)
    public BeanClass beanClass() {
        return new BeanClass(GpCondition.class);
    }
}
