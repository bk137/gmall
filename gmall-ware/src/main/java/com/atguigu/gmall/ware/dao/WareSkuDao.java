package com.atguigu.gmall.ware.dao;

import com.atguigu.gmall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author bk137
 * @email bk137xver@gmail.com
 * @date 2020-06-01 09:54:36
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
