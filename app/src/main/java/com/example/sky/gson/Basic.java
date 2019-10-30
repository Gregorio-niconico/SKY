package com.example.sky.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {
    //由于GSon建立映射需要建立的实体类名需要和返回的JSON数据名一致
    //通过SerializedName注解的方式让JSON字段和Java字段之间建立映射关系
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;

    }

}
