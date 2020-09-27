package com.practicas.pideacasa.ui.orden;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.practicas.pideacasa.R;

public class OrdenFragment extends Fragment {

    private OrdenViewModel ordenViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ordenViewModel =
                ViewModelProviders.of(this).get(OrdenViewModel.class);
        View root = inflater.inflate(R.layout.fragment_orden, container, false);
        final TextView textView = root.findViewById(R.id.text_orden);
        ordenViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
