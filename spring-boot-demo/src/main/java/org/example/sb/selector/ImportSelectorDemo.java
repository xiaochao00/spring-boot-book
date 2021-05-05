package org.example.sb.selector;

import org.example.sb.selector.bean.ImportSelectorBean;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * import demo
 *
 * @author shichao
 * @since 1.0.0
 * 2021/5/5 16:30
 */
public class ImportSelectorDemo implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{ImportSelectorBean.class.getName()};
    }
}
