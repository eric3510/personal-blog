package com.core.pojo;

import com.core.annotation.ApiModelProperty;
import com.core.annotation.Ignore;
import lombok.Data;

/**
 * @author 王强
 * @version 创建时间：2017/9/21
 * Paging
 **/
@Data
public class Paging{
    /***
     * 每页条数
     */
    @Ignore
    @ApiModelProperty(name = "每页大小", required = false)
    private Integer pageSize;

    /***
     * 所跳页
     */
    @Ignore
    @ApiModelProperty(name = "所跳页", required = false)
    private Integer toPage;

    /***
     * 排序
     */
    @Ignore
    @ApiModelProperty(name = "排序")
    private String order;
}
