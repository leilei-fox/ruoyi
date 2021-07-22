package com.ruoyi.metadata.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.metadata.mapper.MsMetadataTableInfoMapper;
import com.ruoyi.metadata.domain.MsMetadataTableInfo;
import com.ruoyi.metadata.service.IMsMetadataTableInfoService;

/**
 * 表信息管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-07-22
 */
@Service
public class MsMetadataTableInfoServiceImpl implements IMsMetadataTableInfoService 
{
    @Autowired
    private MsMetadataTableInfoMapper msMetadataTableInfoMapper;

    /**
     * 查询表信息管理
     * 
     * @param id 表信息管理ID
     * @return 表信息管理
     */
    @Override
    public MsMetadataTableInfo selectMsMetadataTableInfoById(Long id)
    {
        return msMetadataTableInfoMapper.selectMsMetadataTableInfoById(id);
    }

    /**
     * 查询表信息管理列表
     * 
     * @param msMetadataTableInfo 表信息管理
     * @return 表信息管理
     */
    @Override
    public List<MsMetadataTableInfo> selectMsMetadataTableInfoList(MsMetadataTableInfo msMetadataTableInfo)
    {
        return msMetadataTableInfoMapper.selectMsMetadataTableInfoList(msMetadataTableInfo);
    }

    /**
     * 新增表信息管理
     * 
     * @param msMetadataTableInfo 表信息管理
     * @return 结果
     */
    @Override
    public int insertMsMetadataTableInfo(MsMetadataTableInfo msMetadataTableInfo)
    {
        msMetadataTableInfo.setCreateTime(DateUtils.getNowDate());
        return msMetadataTableInfoMapper.insertMsMetadataTableInfo(msMetadataTableInfo);
    }

    /**
     * 修改表信息管理
     * 
     * @param msMetadataTableInfo 表信息管理
     * @return 结果
     */
    @Override
    public int updateMsMetadataTableInfo(MsMetadataTableInfo msMetadataTableInfo)
    {
        msMetadataTableInfo.setUpdateTime(DateUtils.getNowDate());
        return msMetadataTableInfoMapper.updateMsMetadataTableInfo(msMetadataTableInfo);
    }

    /**
     * 批量删除表信息管理
     * 
     * @param ids 需要删除的表信息管理ID
     * @return 结果
     */
    @Override
    public int deleteMsMetadataTableInfoByIds(Long[] ids)
    {
        return msMetadataTableInfoMapper.deleteMsMetadataTableInfoByIds(ids);
    }

    /**
     * 删除表信息管理信息
     * 
     * @param id 表信息管理ID
     * @return 结果
     */
    @Override
    public int deleteMsMetadataTableInfoById(Long id)
    {
        return msMetadataTableInfoMapper.deleteMsMetadataTableInfoById(id);
    }
}
