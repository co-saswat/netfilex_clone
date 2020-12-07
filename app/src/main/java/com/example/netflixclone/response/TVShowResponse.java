package com.example.netflixclone.response;

import com.example.netflixclone.models.TVShows;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TVShowResponse {

    @SerializedName("page")
    public int page;

    @SerializedName("pages")
    private int total_pages;

    @SerializedName("tv_shows")
    private List<TVShows> tvShowsList;

    public int getPage() {
        return page;
    }

    public int getTotal_pages() {
        return total_pages;
    }

    public List<TVShows> getTvShowsList() {
        return tvShowsList;
    }
}
