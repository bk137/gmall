package com.atguigu.gmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gmall.order.entity.RefundInfoEntity;

import java.util.Map;

/**
 * 
 *
 * @author bk137
 * @email bk137xver@gmail.com
 * @date 2020-06-01 09:51:08
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

