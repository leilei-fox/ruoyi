package com.ruoyi.metadata.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 表信息管理对象 ms_metadata_table_info
 * 
 * @author ruoyi
 * @date 2021-07-22
 */
public class MsMetadataTableInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 数据库类型 */
    @Excel(name = "数据库类型")
    private String dbType;

    /** 数据库名 */
    @Excel(name = "数据库名")
    private String schema;

    /** 表名 */
    @Excel(name = "表名")
    private String name;

    /** 表注释 */
    @Excel(name = "表注释")
    private String comment;

    /** 表类型 */
    @Excel(name = "表类型")
    private String tableType;

    /** 数据表状态 0待创建 1已创建 -1待删除 -2已删除 */
    @Excel(name = "数据表状态 0待创建 1已创建 -1待删除 -2已删除")
    private Integer state;

    /** 分区类型/分隔类型 */
    @Excel(name = "分区类型/分隔类型")
    private String partitionType;

    /** 分区数量 */
    @Excel(name = "分区数量")
    private Integer partitionNum;

    /** $column.columnComment */
    @Excel(name = "分区数量")
    private Integer isSync;

    /** $column.columnComment */
    @Excel(name = "分区数量")
    private Integer isValid;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setDbType(String dbType) 
    {
        this.dbType = dbType;
    }

    public String getDbType() 
    {
        return dbType;
    }
    public void setSchema(String schema) 
    {
        this.schema = schema;
    }

    public String getSchema() 
    {
        return schema;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setComment(String comment) 
    {
        this.comment = comment;
    }

    public String getComment() 
    {
        return comment;
    }
    public void setTableType(String tableType) 
    {
        this.tableType = tableType;
    }

    public String getTableType() 
    {
        return tableType;
    }
    public void setState(Integer state) 
    {
        this.state = state;
    }

    public Integer getState() 
    {
        return state;
    }
    public void setPartitionType(String partitionType) 
    {
        this.partitionType = partitionType;
    }

    public String getPartitionType() 
    {
        return partitionType;
    }
    public void setPartitionNum(Integer partitionNum) 
    {
        this.partitionNum = partitionNum;
    }

    public Integer getPartitionNum() 
    {
        return partitionNum;
    }
    public void setIsSync(Integer isSync) 
    {
        this.isSync = isSync;
    }

    public Integer getIsSync() 
    {
        return isSync;
    }
    public void setIsValid(Integer isValid) 
    {
        this.isValid = isValid;
    }

    public Integer getIsValid() 
    {
        return isValid;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("dbType", getDbType())
            .append("schema", getSchema())
            .append("name", getName())
            .append("comment", getComment())
            .append("remark", getRemark())
            .append("tableType", getTableType())
            .append("state", getState())
            .append("partitionType", getPartitionType())
            .append("partitionNum", getPartitionNum())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("isSync", getIsSync())
            .append("isValid", getIsValid())
            .toString();
    }
}
