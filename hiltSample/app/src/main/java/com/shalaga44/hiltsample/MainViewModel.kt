package com.shalaga44.hiltsample

import androidx.hilt.Assisted
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.*
import com.shalaga44.hiltsample.model.Blog
import com.shalaga44.hiltsample.repository.MainRepository
import com.shalaga44.hiltsample.util.DataState
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch

class MainViewModel
@ViewModelInject
constructor(
    private val mainRepository: MainRepository,
    @Assisted private val savedStateHandle: SavedStateHandle
) : ViewModel() {
    private val _dataState: MutableLiveData<DataState<List<Blog>>> = MutableLiveData()
    val dataState: LiveData<DataState<List<Blog>>>
        get() = _dataState

    fun setStateEvent(mainStateEvent: MainStateEvent){
        viewModelScope.launch {
            when(mainStateEvent){
                is MainStateEvent.GetBlogEvent -> {
                    mainRepository.getBlogs().onEach {dataState ->
                        _dataState.value = dataState
                    }.launchIn(viewModelScope)
                }
                is MainStateEvent.None -> {
                    // Who cares
                }
            }
        }
    }
}

sealed class MainStateEvent {
    object GetBlogEvent : MainStateEvent()
    object None : MainStateEvent()
}