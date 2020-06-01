package com.atguigu.gmall.order.dao;

import com.atguigu.gmall.order.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author bk137
 * @email bk137xver@gmail.com
 * @date 2020-06-01 09:51:08
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}
