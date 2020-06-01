package com.atguigu.gmall.coupon.dao;

import com.atguigu.gmall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author bk137
 * @email bk137xver@gmail.com
 * @date 2020-06-01 09:56:35
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
