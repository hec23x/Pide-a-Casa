package com.practicas.pideacasa.ui.pedidos;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PedidosViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public PedidosViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Este es el menú de Antojitos Lulú");
    }

    public LiveData<String> getText() {
        return mText;
    }
}