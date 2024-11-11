package com.almer.testfrontend.ui.create

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CreateViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "This is report Fragment"
    }
    val text: LiveData<String> = _text
}