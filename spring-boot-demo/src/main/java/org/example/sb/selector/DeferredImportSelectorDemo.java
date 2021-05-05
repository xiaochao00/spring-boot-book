package org.example.sb.selector;

import org.example.sb.selector.bean.DeferredImportSelectorBean;
import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * deferred import selector
 *
 * @author shichao
 * @since 1.0.0
 * 2021/5/5 16:32
 */
public class DeferredImportSelectorDemo implements DeferredImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{DeferredImportSelectorBean.class.getName()};
    }
}
