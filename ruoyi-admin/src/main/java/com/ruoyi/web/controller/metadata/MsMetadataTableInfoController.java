package com.ruoyi.web.controller.metadata;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.metadata.domain.MsMetadataTableInfo;
import com.ruoyi.metadata.service.IMsMetadataTableInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 表信息管理Controller
 * 
 * @author ruoyi
 * @date 2021-07-22
 */
@RestController
@RequestMapping("/metadata/tableInfo")
public class MsMetadataTableInfoController extends BaseController
{
    @Autowired
    private IMsMetadataTableInfoService msMetadataTableInfoService;

    /**
     * 查询表信息管理列表
     */
    @PreAuthorize("@ss.hasPermi('metadata:tableInfo:list')")
    @GetMapping("/list")
    public TableDataInfo list(MsMetadataTableInfo msMetadataTableInfo)
    {
        startPage();
        List<MsMetadataTableInfo> list = msMetadataTableInfoService.selectMsMetadataTableInfoList(msMetadataTableInfo);
        return getDataTable(list);
    }

    /**
     * 导出表信息管理列表
     */
    @PreAuthorize("@ss.hasPermi('metadata:tableInfo:export')")
    @Log(title = "表信息管理", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(MsMetadataTableInfo msMetadataTableInfo)
    {
        List<MsMetadataTableInfo> list = msMetadataTableInfoService.selectMsMetadataTableInfoList(msMetadataTableInfo);
        ExcelUtil<MsMetadataTableInfo> util = new ExcelUtil<MsMetadataTableInfo>(MsMetadataTableInfo.class);
        return util.exportExcel(list, "表信息管理数据");
    }

    /**
     * 获取表信息管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('metadata:tableInfo:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(msMetadataTableInfoService.selectMsMetadataTableInfoById(id));
    }

    /**
     * 新增表信息管理
     */
    @PreAuthorize("@ss.hasPermi('metadata:tableInfo:add')")
    @Log(title = "表信息管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody MsMetadataTableInfo msMetadataTableInfo)
    {
        return toAjax(msMetadataTableInfoService.insertMsMetadataTableInfo(msMetadataTableInfo));
    }

    /**
     * 修改表信息管理
     */
    @PreAuthorize("@ss.hasPermi('metadata:tableInfo:edit')")
    @Log(title = "表信息管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody MsMetadataTableInfo msMetadataTableInfo)
    {
        return toAjax(msMetadataTableInfoService.updateMsMetadataTableInfo(msMetadataTableInfo));
    }

    /**
     * 删除表信息管理
     */
    @PreAuthorize("@ss.hasPermi('metadata:tableInfo:remove')")
    @Log(title = "表信息管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(msMetadataTableInfoService.deleteMsMetadataTableInfoByIds(ids));
    }
}
