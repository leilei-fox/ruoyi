package com.ruoyi.metadata.mapper;

import java.util.List;
import com.ruoyi.metadata.domain.MsMetadataTableInfo;

/**
 * 表信息管理Mapper接口
 * 
 * @author ruoyi
 * @date 2021-07-22
 */
public interface MsMetadataTableInfoMapper 
{
    /**
     * 查询表信息管理
     * 
     * @param id 表信息管理ID
     * @return 表信息管理
     */
    public MsMetadataTableInfo selectMsMetadataTableInfoById(Long id);

    /**
     * 查询表信息管理列表
     * 
     * @param msMetadataTableInfo 表信息管理
     * @return 表信息管理集合
     */
    public List<MsMetadataTableInfo> selectMsMetadataTableInfoList(MsMetadataTableInfo msMetadataTableInfo);

    /**
     * 新增表信息管理
     * 
     * @param msMetadataTableInfo 表信息管理
     * @return 结果
     */
    public int insertMsMetadataTableInfo(MsMetadataTableInfo msMetadataTableInfo);

    /**
     * 修改表信息管理
     * 
     * @param msMetadataTableInfo 表信息管理
     * @return 结果
     */
    public int updateMsMetadataTableInfo(MsMetadataTableInfo msMetadataTableInfo);

    /**
     * 删除表信息管理
     * 
     * @param id 表信息管理ID
     * @return 结果
     */
    public int deleteMsMetadataTableInfoById(Long id);

    /**
     * 批量删除表信息管理
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteMsMetadataTableInfoByIds(Long[] ids);
}
