package com.atguigu.gmall.member.dao;

import com.atguigu.gmall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author bk137
 * @email bk137xver@gmail.com
 * @date 2020-06-01 09:41:41
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
