package com.practicas.pideacasa.ui.pedidos;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PedidosViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public PedidosViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Estos son tus pedidos anteriores");
    }

    public LiveData<String> getText() {
        return mText;
    }
}