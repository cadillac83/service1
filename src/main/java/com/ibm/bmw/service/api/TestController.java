package com.ibm.bmw.service.api;

import com.ibm.bmw.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/******************************************************************
 *
 *    Java Lib, Powered By Dalian IBM.
 *
 *    Copyright (c) 2001-2018 Dalian IBM Co.,Ltd
 *    http://www.ibm.com/
 *
 *    Package:     com.ibm.bmw.service.api
 *
 *    Filename:    TestController
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
 *    Create at:   2019-07-30 06:00
 *
 *    Revision:
 *
 *    2019-07-30 06:00
 *        - first revision
 *
 *****************************************************************/
@RestController
public class TestController {
    @Autowired
    private TestService testService;

    @RequestMapping(value = "/testLog", produces = {"application/json;charset=UTF-8"}, method = RequestMethod.GET)
    public String testLogController() {
        return testService.testLogService();
    }
}
