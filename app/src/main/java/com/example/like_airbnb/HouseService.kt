package com.example.like_airbnb

import retrofit2.Call
import retrofit2.http.GET


interface HouseService {
    @GET("/v3/e39dd395-6e88-4739-a005-97cf24929715")
    fun getHouseList() : Call<HouseDto>    //받기
}