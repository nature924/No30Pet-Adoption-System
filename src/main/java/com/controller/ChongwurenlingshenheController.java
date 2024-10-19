












package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 宠物认领审核
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/chongwurenlingshenhe")
public class ChongwurenlingshenheController {
    private static final Logger logger = LoggerFactory.getLogger(ChongwurenlingshenheController.class);

    @Autowired
    private ChongwurenlingshenheService chongwurenlingshenheService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;

    //级联表service
    @Autowired
    private ChongwurenlingService chongwurenlingService;
    @Autowired
    private YonghuService yonghuService;



    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role))
            return R.error(511,"权限为空");
        else if("用户".equals(role))
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        if(params.get("orderBy")==null || params.get("orderBy")==""){
            params.put("orderBy","id");
        }
        PageUtils page = chongwurenlingshenheService.queryPage(params);

        //字典表数据转换
        List<ChongwurenlingshenheView> list =(List<ChongwurenlingshenheView>)page.getList();
        for(ChongwurenlingshenheView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        ChongwurenlingshenheEntity chongwurenlingshenhe = chongwurenlingshenheService.selectById(id);
        if(chongwurenlingshenhe !=null){
            //entity转view
            ChongwurenlingshenheView view = new ChongwurenlingshenheView();
            BeanUtils.copyProperties( chongwurenlingshenhe , view );//把实体数据重构到view中

                //级联表
                ChongwurenlingEntity chongwurenling = chongwurenlingService.selectById(chongwurenlingshenhe.getChongwurenlingId());
                if(chongwurenling != null){
                    BeanUtils.copyProperties( chongwurenling , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setChongwurenlingId(chongwurenling.getId());
                }
                //级联表
                YonghuEntity yonghu = yonghuService.selectById(chongwurenlingshenhe.getYonghuId());
                if(yonghu != null){
                    BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setYonghuId(yonghu.getId());
                }
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody ChongwurenlingshenheEntity chongwurenlingshenhe, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,chongwurenlingshenhe:{}",this.getClass().getName(),chongwurenlingshenhe.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role))
            return R.error(511,"权限为空");
        else if("用户".equals(role))
            chongwurenlingshenhe.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));

        Wrapper<ChongwurenlingshenheEntity> queryWrapper = new EntityWrapper<ChongwurenlingshenheEntity>()
            .eq("chongwurenling_id", chongwurenlingshenhe.getChongwurenlingId())
            .eq("yonghu_id", chongwurenlingshenhe.getYonghuId())
            .eq("chongwurenlingshenhe_text", chongwurenlingshenhe.getChongwurenlingshenheText())
            .eq("chongwurenlingshenhe_yesno_types", chongwurenlingshenhe.getChongwurenlingshenheYesnoTypes())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ChongwurenlingshenheEntity chongwurenlingshenheEntity = chongwurenlingshenheService.selectOne(queryWrapper);
        if(chongwurenlingshenheEntity==null){
            chongwurenlingshenhe.setChongwurenlingshenheYesnoTypes(1);
            chongwurenlingshenhe.setCreateTime(new Date());
            chongwurenlingshenheService.insert(chongwurenlingshenhe);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody ChongwurenlingshenheEntity chongwurenlingshenhe, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,chongwurenlingshenhe:{}",this.getClass().getName(),chongwurenlingshenhe.toString());

        //根据字段查询是否有相同数据
        Wrapper<ChongwurenlingshenheEntity> queryWrapper = new EntityWrapper<ChongwurenlingshenheEntity>()
            .notIn("id",chongwurenlingshenhe.getId())
            .andNew()
            .eq("chongwurenling_id", chongwurenlingshenhe.getChongwurenlingId())
            .eq("yonghu_id", chongwurenlingshenhe.getYonghuId())
            .eq("chongwurenlingshenhe_text", chongwurenlingshenhe.getChongwurenlingshenheText())
            .eq("chongwurenlingshenhe_yesno_types", chongwurenlingshenhe.getChongwurenlingshenheYesnoTypes())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ChongwurenlingshenheEntity chongwurenlingshenheEntity = chongwurenlingshenheService.selectOne(queryWrapper);
        if(chongwurenlingshenheEntity==null){
            if(chongwurenlingshenhe.getChongwurenlingshenheYesnoTypes() == 2){
                ChongwurenlingEntity chongwurenlingEntity = new ChongwurenlingEntity();
                chongwurenlingEntity.setId(chongwurenlingshenhe.getChongwurenlingId());
                chongwurenlingEntity.setJieshuTypes(1);
                chongwurenlingService.updateById(chongwurenlingEntity);
            }
            chongwurenlingshenheService.updateById(chongwurenlingshenhe);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        chongwurenlingshenheService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }

    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        try {
            List<ChongwurenlingshenheEntity> chongwurenlingshenheList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("static/upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            ChongwurenlingshenheEntity chongwurenlingshenheEntity = new ChongwurenlingshenheEntity();
//                            chongwurenlingshenheEntity.setChongwurenlingId(Integer.valueOf(data.get(0)));   //宠物认领 要改的
//                            chongwurenlingshenheEntity.setYonghuId(Integer.valueOf(data.get(0)));   //认领用户 要改的
//                            chongwurenlingshenheEntity.setChongwurenlingshenheText(data.get(0));                    //认领理由 要改的
//                            chongwurenlingshenheEntity.setChongwurenlingshenheYesnoTypes(Integer.valueOf(data.get(0)));   //申请状态 要改的
//                            chongwurenlingshenheEntity.setCreateTime(date);//时间
                            chongwurenlingshenheList.add(chongwurenlingshenheEntity);


                            //把要查询是否重复的字段放入map中
                        }

                        //查询是否重复
                        chongwurenlingshenheService.insertBatch(chongwurenlingshenheList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }




    /**
    * 前端列表
    */
    @IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("list方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));

        // 没有指定排序字段就默认id倒序
        if(StringUtil.isEmpty(String.valueOf(params.get("orderBy")))){
            params.put("orderBy","id");
        }
        PageUtils page = chongwurenlingshenheService.queryPage(params);

        //字典表数据转换
        List<ChongwurenlingshenheView> list =(List<ChongwurenlingshenheView>)page.getList();
        for(ChongwurenlingshenheView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段
        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        ChongwurenlingshenheEntity chongwurenlingshenhe = chongwurenlingshenheService.selectById(id);
            if(chongwurenlingshenhe !=null){


                //entity转view
                ChongwurenlingshenheView view = new ChongwurenlingshenheView();
                BeanUtils.copyProperties( chongwurenlingshenhe , view );//把实体数据重构到view中

                //级联表
                    ChongwurenlingEntity chongwurenling = chongwurenlingService.selectById(chongwurenlingshenhe.getChongwurenlingId());
                if(chongwurenling != null){
                    BeanUtils.copyProperties( chongwurenling , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setChongwurenlingId(chongwurenling.getId());
                }
                //级联表
                    YonghuEntity yonghu = yonghuService.selectById(chongwurenlingshenhe.getYonghuId());
                if(yonghu != null){
                    BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setYonghuId(yonghu.getId());
                }
                //修改对应字典表字段
                dictionaryService.dictionaryConvert(view, request);
                return R.ok().put("data", view);
            }else {
                return R.error(511,"查不到数据");
            }
    }


    /**
    * 前端保存
    */
    @RequestMapping("/add")
    public R add(@RequestBody ChongwurenlingshenheEntity chongwurenlingshenhe, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,chongwurenlingshenhe:{}",this.getClass().getName(),chongwurenlingshenhe.toString());
        Wrapper<ChongwurenlingshenheEntity> queryWrapper = new EntityWrapper<ChongwurenlingshenheEntity>()
            .eq("chongwurenling_id", chongwurenlingshenhe.getChongwurenlingId())
            .eq("yonghu_id", chongwurenlingshenhe.getYonghuId())
            .eq("chongwurenlingshenhe_text", chongwurenlingshenhe.getChongwurenlingshenheText())
            .eq("chongwurenlingshenhe_yesno_types", chongwurenlingshenhe.getChongwurenlingshenheYesnoTypes())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ChongwurenlingshenheEntity chongwurenlingshenheEntity = chongwurenlingshenheService.selectOne(queryWrapper);
        if(chongwurenlingshenheEntity==null){
            chongwurenlingshenhe.setChongwurenlingshenheYesnoTypes(1);
            chongwurenlingshenhe.setCreateTime(new Date());
        //  String role = String.valueOf(request.getSession().getAttribute("role"));
        //  if("".equals(role)){
        //      chongwurenlingshenhe.set
        //  }
        chongwurenlingshenheService.insert(chongwurenlingshenhe);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }


}
