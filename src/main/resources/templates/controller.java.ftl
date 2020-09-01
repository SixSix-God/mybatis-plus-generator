package ${package.Controller};

import ${package.Entity}.${entity};
import ${package.Service}.${table.serviceName} ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.baomidou.mybatisplus.core.metadata.IPage;


/**
* $!{table.comment} 前端控制器
* @author ${author}
* @since ${date}
*/


@RestController
@RequestMapping("/${table.entityPath}" )
public class ${table.controllerName} {

    @Autowired
    private ${table.serviceName}  ${table.entityPath}Service;

    /**
    * 保存
    *
    * @param model
    * @return
    */
    @RequestMapping("/save")
    public Object save(${entity} model) {
        ${table.entityPath}Service.save(model);
        return "success";
    }


    /**
    * 查询详情
    *
    * @param id
    * @return
    */
    @RequestMapping("/getById")
    public Object getById(Integer id) {
     ${entity} model = ${table.entityPath}Service.getById(id);
        // todo 再包装一层
        return model;
    }


    /**
    * 列表查询（非分页）
    *
    * @return
    */
    @RequestMapping("/list")
    public Object list() {
        ${entity} model = new  ${entity}();
        List<${entity}> list =  ${table.entityPath}Service.list(model);
        // todo 再包装一层
        return list;
    }


    /**
    * 列表查询（分页）
    *
    * @return
    */
    @RequestMapping("/pageList")
    public Object pageList(Integer pageNum, Integer pageSize) {

        ${entity} model = new  ${entity}();
        IPage<${entity}> page = ${table.entityPath}Service.pageList(model, pageNum, pageSize);
        // todo 再包装一层
        return page;
    }

}

