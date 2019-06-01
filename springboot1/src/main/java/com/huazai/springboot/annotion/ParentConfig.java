package com.huazai.springboot.annotion;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by pyh on 2019/5/27.
 */
@Configuration
@Import({JavaConfigA.class, JavaConfigB.class})
public class ParentConfig {
}
