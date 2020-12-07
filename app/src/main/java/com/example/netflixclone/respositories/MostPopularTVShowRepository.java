package com.example.netflixclone.respositories;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.netflixclone.network.ApiClient;
import com.example.netflixclone.network.ApiService;
import com.example.netflixclone.response.TVShowResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MostPopularTVShowRepository {
    private ApiService apiService;

    public MostPopularTVShowRepository() {
        apiService = ApiClient.getRetrofit().create(ApiService.class);
    }

    public LiveData<TVShowResponse> getMostPopularTVShows(int page){
        MutableLiveData<TVShowResponse> data = new MutableLiveData<>();
        apiService.getMostPopularTVShows(page).enqueue(new Callback<TVShowResponse>() {
            @Override
            public void onResponse(Call<TVShowResponse> call, Response<TVShowResponse> response) {
                data.setValue(response.body());
            }

            @Override
            public void onFailure(Call<TVShowResponse> call, Throwable t) {
                data.setValue(null);
            }
        });
        return data;
    }
}
