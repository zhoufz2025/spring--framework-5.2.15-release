package com.zhoufz.mapper;

import org.apache.ibatis.annotations.Select;

/**
 * @author zhoufz
 * 日期 2025/6/13
 */
public interface UserMapper {
	@Select("select 'user'")
	String selectById();

}
