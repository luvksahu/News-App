package com.lks.newsapp.fragments.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lks.newsapp.R;
import com.lks.newsapp.databinding.FragmentDamohNewsBinding;

import com.lks.newsapp.webViewController.WebViewController;


public class DamohNews extends Fragment {

   private FragmentDamohNewsBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentDamohNewsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        binding.webViewDamohNews.loadUrl("https://www.patrika.com/damoh-news/");
        binding.webViewDamohNews.setWebViewClient(new WebViewController());

        return root;
    }
}