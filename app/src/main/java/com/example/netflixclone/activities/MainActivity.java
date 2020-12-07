package com.example.netflixclone.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.widget.Toast;

import com.example.netflixclone.R;
import com.example.netflixclone.viewmodels.MostPopularTVShowViewModel;

public class MainActivity extends AppCompatActivity {

    private MostPopularTVShowViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewModel = new ViewModelProvider(this).get(MostPopularTVShowViewModel.class);
        getMostPopularTVShows();
    }

    public void getMostPopularTVShows(){
        viewModel.getMostPopularTVShows(0).observe(this, mostPopularTVShowsResponse ->
                        Toast.makeText(getApplicationContext(),
                                "Total Pages" + mostPopularTVShowsResponse.getTotal_pages() ,
                                Toast.LENGTH_SHORT).show()
                );
    }
}