package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {

    //由于 JSON 中的一些字段可能不太适合直接作为 Java 字段来命名，
    // 因此这里使用@SerializedName注解的方式来让 JSON字段和 Java字段之间建立映射关系.
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
