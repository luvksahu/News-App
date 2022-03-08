package com.lks.newsapp.fragments.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import com.lks.newsapp.R;
import com.lks.newsapp.databinding.FragmentCnnBinding;
import com.lks.newsapp.webViewController.WebViewController;

public class CNNFragment extends Fragment {

    private FragmentCnnBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        binding = FragmentCnnBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        binding.webViewBbc.loadUrl("https://www.cnn.com/");
        binding.webViewBbc.setWebViewClient(new WebViewController());

        binding.button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_nav_home_to_nav_damoh);
            }
        });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}