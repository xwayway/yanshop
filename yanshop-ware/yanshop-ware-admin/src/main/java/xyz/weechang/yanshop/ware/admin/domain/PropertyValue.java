package xyz.weechang.yanshop.ware.admin.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import xyz.weechang.moreco.core.model.domain.BaseDomain;

/**
 * 属性值
 * @author zhangwei
 * date 2019/7/16
 * time 12:39
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class PropertyValue extends BaseDomain {
    private static final long serialVersionUID = -1396373724868214251L;

    /*** 属性值 */
    private String value;

    /*** 属性Id */
    private String propertyId;

    /*** 排序 */
    private String sort;

    /*** 状态 */
    private Integer status;
}
