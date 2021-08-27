package com.atguigu.mysrb.core.service.impl;

import com.atguigu.mysrb.core.pojo.entity.UserLoginRecord;
import com.atguigu.mysrb.core.mapper.UserLoginRecordMapper;
import com.atguigu.mysrb.core.service.UserLoginRecordService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户登录记录表 服务实现类
 * </p>
 *
 * @author lzh
 * @since 2021-08-27
 */
@Service
public class UserLoginRecordServiceImpl extends ServiceImpl<UserLoginRecordMapper, UserLoginRecord> implements UserLoginRecordService {

}
