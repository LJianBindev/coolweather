package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Forecast {//实体类（daily_forecast包含的是一个数组，此处只定义一项，声明实体类时需使用集合类型声明）

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature {

        public String max;
        public String min;

    }
    public class More {

        @SerializedName("txt_d")
        public String info;
    }
}
