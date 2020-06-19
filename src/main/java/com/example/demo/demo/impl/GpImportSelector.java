package com.example.demo.demo.impl;

import com.example.demo.demo.OneClass;
import com.example.demo.demo.TwoClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.function.Predicate;

/**
 * @Author: 秒度
 * @Email: fangxin.md@Gmail.com
 * @Date: 2020-06-18 22:40
 * @Description:
 */
@ConditionalOnBean(GpImportSelector.class)
public class GpImportSelector implements ImportSelector {

    OneClass oneClass;

    @Override
    public Predicate<String> getExclusionFilter() {
        return null;
    }

    /**
     * 把2个bean装载到IOC中
     *
     * @param annotationMetadata
     * @return
     */
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        oneClass.toString();
        System.out.println(111);
        return new String[]{OneClass.class.getName(), TwoClass.class.getName()};
    }


}
