package com.personalblog.core.mysql;

import lombok.Data;

/***
 * @author 王强 Email : wangqiang@hushijie.com.cn
 * @version 创建时间：2017/11/12
 * SaveResult
 */
@Data
public class SaveResult{
    /***
     * 受影响行数
     */
    private Integer influencesRow = 0;

    /***
     * 主键
     */
    private Object id;
}
