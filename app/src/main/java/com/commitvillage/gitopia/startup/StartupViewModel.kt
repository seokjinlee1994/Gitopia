package com.commitvillage.gitopia.startup

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.commitvillage.gitopia.navigation.GitopiaRoute
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class StartupViewModel @Inject constructor() : ViewModel() {
    private val _uiState = MutableStateFlow(StartupUiState())
    val uiState = _uiState.asStateFlow()

    init {
        resolveDestination()
    }

    private fun resolveDestination() {
        viewModelScope.launch {
            /**
             * TODO
             * 1. 온보딩 완료 여부 확인
             * 2. Github 연동 여부 확인
             * 3. repository 선택 여부 확인
             * 4. 마지막 route 유효성 확인
             * 5. startDestination 결정
             */

            _uiState.update {
                it.copy(
                    isLoading = false,
                    startDestination = GitopiaRoute.Onboarding
                )
            }
        }
    }
}