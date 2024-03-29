package xyz.weechang.yanshop.ware.admin.dao;

import org.springframework.stereotype.Repository;
import xyz.weechang.moreco.data.jpa.JpaBaseRepository;
import xyz.weechang.yanshop.ware.admin.domain.Brand;

/**
 * @author zhangwei
 * date 2019/7/16
 * time 12:35
 */
@Repository
public interface BrandDao extends JpaBaseRepository<Brand> {
}
