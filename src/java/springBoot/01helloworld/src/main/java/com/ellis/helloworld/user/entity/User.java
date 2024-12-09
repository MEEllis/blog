package com.ellis.helloworld.user.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ellis
 * @create 2024-11-28-下午5:03
 */
@Data
@NoArgsConstructor
public class User {
    @TableId(type =IdType.AUTO)
    private Long id;

    private String name;
    private Integer age;
    private String email;
}
