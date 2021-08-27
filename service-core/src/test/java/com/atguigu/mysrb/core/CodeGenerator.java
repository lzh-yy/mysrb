package com.atguigu.mysrb.core;

import ch.qos.logback.classic.turbo.TurboFilter;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author lzhCreate
 * @create 2021-08-26 10:50
 */
@SpringBootTest
public class CodeGenerator {
    @Test
    public void generateCode() {

        //1.创建代码自动生成器
        AutoGenerator autoGenerator = new AutoGenerator();

        //2.全局配置
        GlobalConfig globalConfig = new GlobalConfig();
        String projectPath = System.getProperty("user.dir");
        globalConfig.setOutputDir(projectPath + "/src/main/java");
        globalConfig.setAuthor("lzh");
        globalConfig.setOpen(false);
        globalConfig.setServiceName("%sService");
        globalConfig.setIdType(IdType.AUTO);
        globalConfig.setSwagger2(true);

        autoGenerator.setGlobalConfig(globalConfig);

        //3.数据源配置
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDriverName("com.mysql.cj.jdbc.Driver");
        dataSourceConfig.setUrl("jdbc:mysql://localhost:3306/srb_core?serverTimezone=GMT%2B8&characterEncoding=utf-8");
        dataSourceConfig.setUsername("root");
        dataSourceConfig.setPassword("Root");

        autoGenerator.setDataSource(dataSourceConfig);

        //4.包配置
        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setParent("com.atguigu.mysrb.core");
        packageConfig.setEntity("pojo.entity");

        autoGenerator.setPackageInfo(packageConfig);

        //5.策略配置(杂项)
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig.setNaming(NamingStrategy.underline_to_camel);
        strategyConfig.setColumnNaming(NamingStrategy.underline_to_camel);
        strategyConfig.setEntityLombokModel(true);
        strategyConfig.setLogicDeleteFieldName("is_deleted");
        strategyConfig.setEntityBooleanColumnRemoveIsPrefix(true);
        strategyConfig.setRestControllerStyle(true);

        autoGenerator.setStrategy(strategyConfig);

        autoGenerator.execute();
    }
}


















