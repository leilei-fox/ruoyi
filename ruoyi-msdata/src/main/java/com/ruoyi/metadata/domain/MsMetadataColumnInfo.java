package com.ruoyi.metadata.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 字段信息对象 ms_metadata_column_info
 * 
 * @author ruoyi
 * @date 2021-07-22
 */
public class MsMetadataColumnInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 列名 */
    @Excel(name = "列名")
    private String name;

    /** 类型 */
    @Excel(name = "类型")
    private String type;

    /** 释义 */
    @Excel(name = "释义")
    private String comment;

    /** 格式 */
    @Excel(name = "格式")
    private String format;

    /** 默认值 */
    @Excel(name = "默认值")
    private String defaultValue;

    /** 状态 0未使用 1使用中 -1已失效 */
    @Excel(name = "状态 0未使用 1使用中 -1已失效")
    private Integer state;

    /** $column.columnComment */
    @Excel(name = "状态 0未使用 1使用中 -1已失效")
    private Integer isValid;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setType(String type) 
    {
        this.type = type;
    }

    public String getType() 
    {
        return type;
    }
    public void setComment(String comment) 
    {
        this.comment = comment;
    }

    public String getComment() 
    {
        return comment;
    }
    public void setFormat(String format) 
    {
        this.format = format;
    }

    public String getFormat() 
    {
        return format;
    }
    public void setDefaultValue(String defaultValue) 
    {
        this.defaultValue = defaultValue;
    }

    public String getDefaultValue() 
    {
        return defaultValue;
    }
    public void setState(Integer state) 
    {
        this.state = state;
    }

    public Integer getState() 
    {
        return state;
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
            .append("name", getName())
            .append("type", getType())
            .append("comment", getComment())
            .append("format", getFormat())
            .append("defaultValue", getDefaultValue())
            .append("state", getState())
            .append("remark", getRemark())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("isValid", getIsValid())
            .toString();
    }
}
