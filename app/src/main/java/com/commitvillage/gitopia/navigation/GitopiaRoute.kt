package com.commitvillage.gitopia.navigation

import kotlinx.serialization.Serializable

sealed interface GitopiaRoute {
    @Serializable
    data object Onboarding : GitopiaRoute

    @Serializable
    data object GithubAuth : GitopiaRoute

    @Serializable
    data object RepositorySelect : GitopiaRoute

    @Serializable
    data object VillageHome : GitopiaRoute

    @Serializable
    data object Shop : GitopiaRoute
}