package com.ruoyi.metadata.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.metadata.mapper.MsMetadataColumnInfoMapper;
import com.ruoyi.metadata.domain.MsMetadataColumnInfo;
import com.ruoyi.metadata.service.IMsMetadataColumnInfoService;

/**
 * 字段信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-07-22
 */
@Service
public class MsMetadataColumnInfoServiceImpl implements IMsMetadataColumnInfoService 
{
    @Autowired
    private MsMetadataColumnInfoMapper msMetadataColumnInfoMapper;

    /**
     * 查询字段信息
     * 
     * @param id 字段信息ID
     * @return 字段信息
     */
    @Override
    public MsMetadataColumnInfo selectMsMetadataColumnInfoById(Long id)
    {
        return msMetadataColumnInfoMapper.selectMsMetadataColumnInfoById(id);
    }

    /**
     * 查询字段信息列表
     * 
     * @param msMetadataColumnInfo 字段信息
     * @return 字段信息
     */
    @Override
    public List<MsMetadataColumnInfo> selectMsMetadataColumnInfoList(MsMetadataColumnInfo msMetadataColumnInfo)
    {
        return msMetadataColumnInfoMapper.selectMsMetadataColumnInfoList(msMetadataColumnInfo);
    }

    /**
     * 新增字段信息
     * 
     * @param msMetadataColumnInfo 字段信息
     * @return 结果
     */
    @Override
    public int insertMsMetadataColumnInfo(MsMetadataColumnInfo msMetadataColumnInfo)
    {
        msMetadataColumnInfo.setCreateTime(DateUtils.getNowDate());
        return msMetadataColumnInfoMapper.insertMsMetadataColumnInfo(msMetadataColumnInfo);
    }

    /**
     * 修改字段信息
     * 
     * @param msMetadataColumnInfo 字段信息
     * @return 结果
     */
    @Override
    public int updateMsMetadataColumnInfo(MsMetadataColumnInfo msMetadataColumnInfo)
    {
        msMetadataColumnInfo.setUpdateTime(DateUtils.getNowDate());
        return msMetadataColumnInfoMapper.updateMsMetadataColumnInfo(msMetadataColumnInfo);
    }

    /**
     * 批量删除字段信息
     * 
     * @param ids 需要删除的字段信息ID
     * @return 结果
     */
    @Override
    public int deleteMsMetadataColumnInfoByIds(Long[] ids)
    {
        return msMetadataColumnInfoMapper.deleteMsMetadataColumnInfoByIds(ids);
    }

    /**
     * 删除字段信息信息
     * 
     * @param id 字段信息ID
     * @return 结果
     */
    @Override
    public int deleteMsMetadataColumnInfoById(Long id)
    {
        return msMetadataColumnInfoMapper.deleteMsMetadataColumnInfoById(id);
    }
}
