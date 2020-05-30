/**
 * @author CY
 * @date 2019年5月21日
 */
package com.caijai.data.mapper;

import org.apache.ibatis.annotations.Param;

import com.caijai.data.entity.Em;

public interface EmMapper {

	Em getEm(@Param("code")String code,@Param("org")String org);

}
