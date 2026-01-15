package com.kob.backend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kob.backend.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * ClassName: UserMapper
 * Package: com.kob.backend.mapper
 * Description:
 *
 * @Author AnXin
 * @Create 2026/1/15 15:59
 * @Version 1.0
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
