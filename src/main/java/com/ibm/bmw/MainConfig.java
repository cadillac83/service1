package com.ibm.bmw;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/******************************************************************
 *
 *    Java Lib, Powered By Dalian IBM.
 *
 *    Copyright (c) 2001-2018 Dalian IBM Co.,Ltd
 *    http://www.ibm.com/
 *
 *    Package:     com.ibm.mail
 *
 *    Filename:    ${file_name}
 *
 *    Description: Spring Boot的主配置，这个配置是基本所有都要用的配置
 *
 *    Copyright:   Copyright (c) 2001-2018
 *
 *    Company:     Dalian IBM Co.,Ltd
 *
 *    @author: LiuQiang
 *
 *    @version: 1.0.0
 *
 *    Create at:   5/21/2017 1:29 PM
 *
 *    Revision:
 *
 *    5/21/2017 1:29 PM
 *        - first revision
 *
 *****************************************************************/

@Configuration   //@Configuration注解的作用是表示这个类是一个配置类
@ComponentScan({"com.ibm.bmw.*"})   //包扫描的位置
public class MainConfig {
}
