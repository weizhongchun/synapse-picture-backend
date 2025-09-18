package com.weizc.synapsepicturebackend.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.weizc.synapsepicturebackend.model.dto.spaceuser.SpaceUserAddRequest;
import com.weizc.synapsepicturebackend.model.dto.spaceuser.SpaceUserQueryRequest;
import com.weizc.synapsepicturebackend.model.entity.SpaceUser;
import com.baomidou.mybatisplus.extension.service.IService;
import com.weizc.synapsepicturebackend.model.vo.SpaceUserVO;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author weizc
 * @description 针对表【space_user(空间用户关联)】的数据库操作Service
 * @createDate 2025-01-02 20:07:15
 */
public interface SpaceUserService extends IService<SpaceUser> {

    /**
     * 创建空间成员
     *
     * @param spaceUserAddRequest
     * @return
     */
    long addSpaceUser(SpaceUserAddRequest spaceUserAddRequest);

    /**
     * 校验空间成员
     *
     * @param spaceUser
     * @param add       是否为创建时检验
     */
    void validSpaceUser(SpaceUser spaceUser, boolean add);

    /**
     * 获取空间成员包装类（单条）
     *
     * @param spaceUser
     * @param request
     * @return
     */
    SpaceUserVO getSpaceUserVO(SpaceUser spaceUser, HttpServletRequest request);

    /**
     * 获取空间成员包装类（列表）
     *
     * @param spaceUserList
     * @return
     */
    List<SpaceUserVO> getSpaceUserVOList(List<SpaceUser> spaceUserList);

    /**
     * 获取查询对象
     *
     * @param spaceUserQueryRequest
     * @return
     */
    QueryWrapper<SpaceUser> getQueryWrapper(SpaceUserQueryRequest spaceUserQueryRequest);
}
