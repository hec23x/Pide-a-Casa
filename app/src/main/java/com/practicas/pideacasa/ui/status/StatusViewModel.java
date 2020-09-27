package com.practicas.pideacasa.ui.status;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class StatusViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public StatusViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Este es el status de tu pedido");
    }

    public LiveData<String> getText() {
        return mText;
    }
}