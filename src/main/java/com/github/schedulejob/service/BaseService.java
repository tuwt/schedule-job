package com.github.schedulejob.service;

import com.github.schedulejob.common.AppConst;
import com.github.schedulejob.anno.TargetDataSource;

/**
 * 基础服务类
 *
 * @author: lvhao
 * @since: 2016-4-19 20:08
 */

// 子类默认 default db
@TargetDataSource(AppConst.DbKey.DEFAULT)
public class BaseService {
}
