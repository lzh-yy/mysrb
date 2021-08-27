package com.atguigu.mysrb.core.controller.admin;


import com.atguigu.common.exception.BusinessException;
import com.atguigu.common.result.R;
import com.atguigu.common.result.ResponseEnum;
import com.atguigu.mysrb.core.pojo.entity.IntegralGrade;
import com.atguigu.mysrb.core.service.IntegralGradeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

/**
 * <p>
 * 积分等级表 前端控制器
 * </p>
 *
 * @author lzh
 * @since 2021-08-26
 */
@RestController
@RequestMapping("/admin/core/integralGrade")
@Api("积分等级")
public class AdminIntegralGradeController {

    @Autowired
    private IntegralGradeService integralGradeService;

    @ApiOperation("查询积分等级列表")
    @GetMapping("/list")
    public R listAll() {
        List<IntegralGrade> list = integralGradeService.list();
        return R.ok().data("list", list);
    }

    @ApiOperation("删除积分")
    @DeleteMapping("/remove/{id}")
    public R deleteById(@ApiParam(value = "积分主键id", required = true, example = "1") @PathVariable("id") Long id) {
        boolean b = integralGradeService.removeById(id);
        if (b) {
            return R.ok();
        } else {
            return R.error();
        }
    }

    @ApiOperation("保存积分对象")
    @PostMapping("/save")
    public R save(@ApiParam("积分等级json对象") @RequestBody IntegralGrade integralGrade) {

        BigDecimal borrowAmount = integralGrade.getBorrowAmount();
        int i = borrowAmount.intValue();
        if (null == borrowAmount || i <= 0) {
            throw new BusinessException(ResponseEnum.BORROW_AMOUNT_NULL_ERROR);
        }

        boolean save = integralGradeService.save(integralGrade);

        if (save) {
            return R.ok();
        } else {
            return R.error().message("错哪了我也不知道...");
        }
    }

    @ApiOperation("根据id查询积分等级对象")
    @GetMapping("/getById/{id}")
    public R selectById(@ApiParam(value = "积分主键id", required = true, example = "1") @PathVariable("id") Long id){
        IntegralGrade integralGrade = integralGradeService.getById(id);
        if (integralGrade != null) {
            return R.ok().data("record", integralGrade);
        } else {
            return R.error().message("数据不存在");
        }
    }

    @ApiOperation("修改积分对象")
    @PutMapping("/update")
    public R updateById(@ApiParam("积分等级json对象") @RequestBody IntegralGrade integralGrade) {
        boolean b = integralGradeService.updateById(integralGrade);
        if (b) {
            return R.ok().message("修改成功");
        } else {
            return R.error().message("修改失败");
        }
    }
}

