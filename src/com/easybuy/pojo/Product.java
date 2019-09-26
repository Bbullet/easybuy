package com.easybuy.pojo;

public class Product {
    private int id;
    private String name;
    private String description;//描述
    private double price;//价格
    private int stock;//库存
    private int categoryLevel1Id;//一级分类
    private int categoryLevel2Id;//二级分类
    private int categoryLevel3Id;//三级分类
    private String fileName;//文件名

    public int getCategoryLevel1Id() {
        return categoryLevel1Id;
    }

    public void setCategoryLevel1Id(int categoryLevel1Id) {
        this.categoryLevel1Id = categoryLevel1Id;
    }
}
