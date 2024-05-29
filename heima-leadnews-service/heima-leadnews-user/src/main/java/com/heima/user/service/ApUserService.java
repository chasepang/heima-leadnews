package com.heima.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.heima.model.common.dtos.ResponseResult;
import com.heima.model.user.dtos.LoginDto;
import com.heima.model.user.pojos.ApUser;

/**
 * @author: Chase
 * @date: 2024-05-28
 * @description: TODO
 **/
public interface ApUserService extends IService<ApUser> {

    /**
     * app端登录
     *
     * @param dto
     * @return
     */
    ResponseResult login(LoginDto dto);

}
