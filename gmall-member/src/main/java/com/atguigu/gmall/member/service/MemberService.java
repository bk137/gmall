package com.atguigu.gmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gmall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author bk137
 * @email bk137xver@gmail.com
 * @date 2020-06-01 09:41:41
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

