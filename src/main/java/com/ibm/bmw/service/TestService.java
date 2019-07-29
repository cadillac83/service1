package com.ibm.bmw.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/******************************************************************
 *
 *    Java Lib, Powered By Dalian IBM.
 *
 *    Copyright (c) 2001-2018 Dalian IBM Co.,Ltd
 *    http://www.ibm.com/
 *
 *    Package:     com.ibm.bmw.service
 *
 *    Filename:    TestService
 *
 *    Description: (用一句话描述该文件做什么)
 *
 *    Copyright:   Copyright (c) 2001-2018
 *
 *    Company:     Dalian IBM Co.,Ltd
 *
 *    @author: liuqiang
 *
 *    @version: 1.0.0
 *
 *    Create at:   2019-07-30 05:57
 *
 *    Revision:
 *
 *    2019-07-30 05:57
 *        - first revision
 *
 *****************************************************************/
@Service
public class TestService {
    private static Logger logger = LoggerFactory.getLogger("APMInfoDev");
    public String testLogService() {
        logger.info("********* BMW Test Log Infor ***********");
        return "success";
    }
}
