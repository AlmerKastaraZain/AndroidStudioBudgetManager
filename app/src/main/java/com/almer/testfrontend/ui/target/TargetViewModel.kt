package com.almer.testfrontend.ui.target

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TargetViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is target Fragment"
    }
    val text: LiveData<String> = _text
}