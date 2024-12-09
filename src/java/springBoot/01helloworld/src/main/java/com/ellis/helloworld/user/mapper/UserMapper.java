package com.ellis.helloworld.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ellis.helloworld.user.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.context.annotation.Bean;

/**
 * @author ellis
 * @create 2024-11-29-下午2:18
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
