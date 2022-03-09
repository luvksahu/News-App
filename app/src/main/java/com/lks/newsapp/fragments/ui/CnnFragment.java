package com.lks.newsapp.fragments.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.lks.newsapp.databinding.FragmentBbcBinding;
import com.lks.newsapp.webViewController.WebViewController;

public class CnnFragment extends Fragment {

    private FragmentBbcBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        binding = FragmentBbcBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        binding.webViewBbc.loadUrl("https://www.cnn.com/");
        binding.webViewBbc.setWebViewClient(new WebViewController());

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}