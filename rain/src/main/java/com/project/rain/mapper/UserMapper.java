package com.project.rain.mapper;

import com.project.rain.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @Author:rain
 * @Date:
 */
@Repository
public interface UserMapper {

    User Sel(int id);
}
