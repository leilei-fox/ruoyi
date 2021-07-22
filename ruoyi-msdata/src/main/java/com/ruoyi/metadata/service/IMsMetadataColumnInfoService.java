package com.ruoyi.metadata.service;

import java.util.List;
import com.ruoyi.metadata.domain.MsMetadataColumnInfo;

/**
 * 字段信息Service接口
 * 
 * @author ruoyi
 * @date 2021-07-22
 */
public interface IMsMetadataColumnInfoService 
{
    /**
     * 查询字段信息
     * 
     * @param id 字段信息ID
     * @return 字段信息
     */
    public MsMetadataColumnInfo selectMsMetadataColumnInfoById(Long id);

    /**
     * 查询字段信息列表
     * 
     * @param msMetadataColumnInfo 字段信息
     * @return 字段信息集合
     */
    public List<MsMetadataColumnInfo> selectMsMetadataColumnInfoList(MsMetadataColumnInfo msMetadataColumnInfo);

    /**
     * 新增字段信息
     * 
     * @param msMetadataColumnInfo 字段信息
     * @return 结果
     */
    public int insertMsMetadataColumnInfo(MsMetadataColumnInfo msMetadataColumnInfo);

    /**
     * 修改字段信息
     * 
     * @param msMetadataColumnInfo 字段信息
     * @return 结果
     */
    public int updateMsMetadataColumnInfo(MsMetadataColumnInfo msMetadataColumnInfo);

    /**
     * 批量删除字段信息
     * 
     * @param ids 需要删除的字段信息ID
     * @return 结果
     */
    public int deleteMsMetadataColumnInfoByIds(Long[] ids);

    /**
     * 删除字段信息信息
     * 
     * @param id 字段信息ID
     * @return 结果
     */
    public int deleteMsMetadataColumnInfoById(Long id);
}
