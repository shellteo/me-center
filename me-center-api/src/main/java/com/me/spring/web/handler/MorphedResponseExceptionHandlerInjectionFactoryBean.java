

package com.me.spring.web.handler;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;

/**
 * 配置全局异常处理器
 *
 * @author zhaohaojie
 * @date   2018-3-6 下午7:56
 */
public class MorphedResponseExceptionHandlerInjectionFactoryBean {

    /**
     * 返回全局异常处理器对象
     */
    @Bean
    @ConditionalOnMissingBean(name = "morphedResponseExceptionHandler")
    public MorphedResponseExceptionHandler morphedResponseExceptionHandler()
    {
        return new MorphedResponseExceptionHandler() {};
    }
}
