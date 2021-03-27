package com.example.cyber_guide.api;

import com.example.cyber_guide.models.News;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

// abstract "class" that is used to group related methods with "empty" bodies
public interface ApiInterface {
    // make a get request to: //https://newsapi.org/v2/top-headlines
    @GET("top-headlines")
    Call<News> getNews(
            // Top business headlines in the US right now can be prvided with:
            //https://newsapi.org/v2/top-headlines?country=us&category=business&apiKey
            // above is the format of api request
            @Query("country") String country,
            @Query("apiKey") String apiKey
    );
}
