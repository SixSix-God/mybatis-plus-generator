package ${package.Service};

import ${package.Entity}.${entity};
import ${superServiceClassPackage};
import java.util.List;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
* <p>
    * $!{table.comment} 服务类
    * </p>
*
* @author ${author}
* @since ${date}
*/


public interface ${table.serviceName} extends ${superServiceClass}<${entity}> {

   /**
   * 查询
   *
   * @param model
   * @return
   */
   List<${entity}> list(${entity} model);

    /**
    * 分页查询
    *
    * @param model
    * @param pageNum  第几页
    * @param pageSize 每页数量
    * @return
    */
    IPage<${entity}> pageList(${entity} model, Integer pageNum, Integer pageSize);

}


