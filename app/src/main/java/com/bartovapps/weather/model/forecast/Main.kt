package com.bartovapps.weather.model.forecast

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


/**
 * Created by motibartov on 15/01/2018.
 */
data class Main(

        @SerializedName("temp")
        @Expose
        var temp: Double? = null,

        @SerializedName("temp_min")
        @Expose
        var tempMin: Double? = null,

        @SerializedName("temp_max")
        @Expose
        var tempMax: Double? = null

)