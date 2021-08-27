package com.atguigu.mysrb.core.service.impl;

import com.atguigu.mysrb.core.pojo.entity.UserInfo;
import com.atguigu.mysrb.core.mapper.UserInfoMapper;
import com.atguigu.mysrb.core.service.UserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户基本信息 服务实现类
 * </p>
 *
 * @author lzh
 * @since 2021-08-27
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {

}
