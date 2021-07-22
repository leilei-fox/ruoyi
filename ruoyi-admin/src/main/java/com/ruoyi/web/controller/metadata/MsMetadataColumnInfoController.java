package com.ruoyi.web.controller.metadata;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.metadata.domain.MsMetadataColumnInfo;
import com.ruoyi.metadata.service.IMsMetadataColumnInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 字段信息Controller
 * 
 * @author ruoyi
 * @date 2021-07-22
 */
@RestController
@RequestMapping("/metadata/columnInfo")
public class MsMetadataColumnInfoController extends BaseController
{
    @Autowired
    private IMsMetadataColumnInfoService msMetadataColumnInfoService;

    /**
     * 查询字段信息列表
     */
    @PreAuthorize("@ss.hasPermi('metadata:columnInfo:list')")
    @GetMapping("/list")
    public TableDataInfo list(MsMetadataColumnInfo msMetadataColumnInfo)
    {
        startPage();
        List<MsMetadataColumnInfo> list = msMetadataColumnInfoService.selectMsMetadataColumnInfoList(msMetadataColumnInfo);
        return getDataTable(list);
    }

    /**
     * 导出字段信息列表
     */
    @PreAuthorize("@ss.hasPermi('metadata:columnInfo:export')")
    @Log(title = "字段信息", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(MsMetadataColumnInfo msMetadataColumnInfo)
    {
        List<MsMetadataColumnInfo> list = msMetadataColumnInfoService.selectMsMetadataColumnInfoList(msMetadataColumnInfo);
        ExcelUtil<MsMetadataColumnInfo> util = new ExcelUtil<MsMetadataColumnInfo>(MsMetadataColumnInfo.class);
        return util.exportExcel(list, "字段信息数据");
    }

    /**
     * 获取字段信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('metadata:columnInfo:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(msMetadataColumnInfoService.selectMsMetadataColumnInfoById(id));
    }

    /**
     * 新增字段信息
     */
    @PreAuthorize("@ss.hasPermi('metadata:columnInfo:add')")
    @Log(title = "字段信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody MsMetadataColumnInfo msMetadataColumnInfo)
    {
        return toAjax(msMetadataColumnInfoService.insertMsMetadataColumnInfo(msMetadataColumnInfo));
    }

    /**
     * 修改字段信息
     */
    @PreAuthorize("@ss.hasPermi('metadata:columnInfo:edit')")
    @Log(title = "字段信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody MsMetadataColumnInfo msMetadataColumnInfo)
    {
        return toAjax(msMetadataColumnInfoService.updateMsMetadataColumnInfo(msMetadataColumnInfo));
    }

    /**
     * 删除字段信息
     */
    @PreAuthorize("@ss.hasPermi('metadata:columnInfo:remove')")
    @Log(title = "字段信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(msMetadataColumnInfoService.deleteMsMetadataColumnInfoByIds(ids));
    }
}
