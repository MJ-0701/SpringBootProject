package com.example.springbootproject.config

import org.springframework.context.annotation.Configuration
import org.springframework.http.CacheControl
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer
import java.util.concurrent.TimeUnit

@Configuration
class MvcConfiguration : WebMvcConfigurer {

    override fun addResourceHandlers(registry: ResourceHandlerRegistry) {
        super.addResourceHandlers(registry)
        registry.addResourceHandler("/**")  // 1. /로 시작하는 모든 요청을 다룸.
            .addResourceLocations("classpath:/templates/", "classpath:/static/") // 2. 1번에 해당하는 요청을 처리할 자원을 찾을 위치
            .setCacheControl(CacheControl.maxAge(10,TimeUnit.MINUTES)) // 3. 요청에대한 캐시를 10분으로 설정.
    }
}