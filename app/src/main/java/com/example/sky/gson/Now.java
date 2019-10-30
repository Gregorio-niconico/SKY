package com.example.sky.gson;

import com.google.gson.annotations.SerializedName;

public class Now {

    //温度
    @SerializedName("tmp")
    public String temperature;
    //实况天气描述
    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;

    }
}
