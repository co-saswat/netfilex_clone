package com.example.netflixclone.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.netflixclone.response.TVShowResponse;
import com.example.netflixclone.respositories.MostPopularTVShowRepository;

public class MostPopularTVShowViewModel extends ViewModel {

    private MostPopularTVShowRepository mostPopularTVShowRepository;

    public MostPopularTVShowViewModel() {
        mostPopularTVShowRepository = new MostPopularTVShowRepository();
    }
    public LiveData<TVShowResponse> getMostPopularTVShows(int page){
        return mostPopularTVShowRepository.getMostPopularTVShows(page);
    }
}
