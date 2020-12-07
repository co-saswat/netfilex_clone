package com.example.netflixclone.network;

import com.example.netflixclone.response.TVShowResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {
    @GET("most-popular")
    Call<TVShowResponse> getMostPopularTVShows(@Query("page") int page);
}
