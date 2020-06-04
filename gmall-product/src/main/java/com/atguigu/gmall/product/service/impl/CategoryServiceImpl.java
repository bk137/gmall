package com.atguigu.gmall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.Query;

import com.atguigu.gmall.product.dao.CategoryDao;
import com.atguigu.gmall.product.entity.CategoryEntity;
import com.atguigu.gmall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {



    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        List<CategoryEntity> entities = baseMapper.selectList(null);
        //组装
        //筛选父类
        List<CategoryEntity>  fuEntity =  entities.stream().filter(categoryEntity -> {
            return categoryEntity.getParentCid() == 0;
        }).map(menu->{
            //添加子分类
            //System.out.println(menu);
            menu.setChildren(getChildrens(menu,entities));
            return menu;
        }).sorted((menu1,menu2)->{
            System.out.println(menu1);
            System.out.println(menu2);
            return (menu1.getSort()==null?0:menu1.getSort())-(menu2.getSort()==null?0:menu2.getSort());
        }).collect(Collectors.toList());
        //System.out.println(fuEntity);
        //System.out.println(fuEntity.size());
        return fuEntity;
    }

    //递归
    private List<CategoryEntity> getChildrens(CategoryEntity root,List<CategoryEntity> all){
        List<CategoryEntity> collect = all.stream().filter(categoryEntity -> {
            return categoryEntity.getParentCid().equals(root.getCatId());
        }).map(categoryEntity -> {
            //System.out.println(categoryEntity);
            categoryEntity.setChildren(getChildrens(categoryEntity, all));
            return categoryEntity;
        }).sorted((menu1, menu2) -> {
            //菜单的排序
            return (menu1.getSort() == null ? 0 : menu1.getSort()) - (menu2.getSort() == null ? 0 : menu2.getSort());
        }).collect(Collectors.toList());

        return collect;
    }

    @Override
    public void test(){
        List<Map<String,String>> list1 =  /*Arrays.asList("a","a","a","d")*/ new ArrayList<>();
        //list1.add(new HashMap<>());
        HashMap map = new HashMap<>();
        HashMap map2 = new HashMap<>();
        map.put("key","value");
        map.put("key1","value1");
        map2.put("key2","value2");
        list1.add(map);
        list1.add(map2);
        //List<String> list2 =  Arrays.asList("a","c","b","a");
        //
        //List<String> collect = list1.stream()
        //        .filter(m1 ->
        //            list2.stream().filter(m2-> m2.equals(m1))
        //        ).collect(Collectors.toList());
        //final String c = "a";
        //List<String> res = list1.stream().filter(s-> s=="d").collect(Collectors.toList());

        System.out.println(list1);
    }



}