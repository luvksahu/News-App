package com.lks.newsapp.fragments.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.lks.newsapp.databinding.FragmentRbharatBinding;
import com.lks.newsapp.webViewController.WebViewController;


public class RBharatFragment extends Fragment {

    private FragmentRbharatBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        binding = FragmentRbharatBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        binding.webViewRBharat.loadUrl("https://bharat.republicworld.com/");
        binding.webViewRBharat.setWebViewClient(new WebViewController());

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}