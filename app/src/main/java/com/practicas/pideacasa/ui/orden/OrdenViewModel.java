package com.practicas.pideacasa.ui.orden;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class OrdenViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public OrdenViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Esta es tu orden");
    }

    public LiveData<String> getText() {
        return mText;
    }
}