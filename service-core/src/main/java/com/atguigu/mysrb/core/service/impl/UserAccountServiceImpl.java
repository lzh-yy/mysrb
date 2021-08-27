package com.atguigu.mysrb.core.service.impl;

import com.atguigu.mysrb.core.pojo.entity.UserAccount;
import com.atguigu.mysrb.core.mapper.UserAccountMapper;
import com.atguigu.mysrb.core.service.UserAccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户账户 服务实现类
 * </p>
 *
 * @author lzh
 * @since 2021-08-27
 */
@Service
public class UserAccountServiceImpl extends ServiceImpl<UserAccountMapper, UserAccount> implements UserAccountService {

}
