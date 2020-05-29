package com.atguigu.gmall.product.dao;

import com.atguigu.gmall.product.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author bk137
 * @email sunlightcs@gmail.com
 * @date 2020-05-29 16:04:22
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
