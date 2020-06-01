package com.atguigu.gmall.coupon.dao;

import com.atguigu.gmall.coupon.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * 
 * @author bk137
 * @email bk137xver@gmail.com
 * @date 2020-06-01 09:56:35
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {
	
}
