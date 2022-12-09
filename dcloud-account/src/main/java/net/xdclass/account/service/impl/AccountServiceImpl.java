package net.xdclass.account.service.impl;

import net.xdclass.account.model.AccountDO;
import net.xdclass.account.mapper.AccountMapper;
import net.xdclass.account.service.AccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 赵敏杰
 * @since 2022-12-09
 */
@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, AccountDO> implements AccountService {

}
