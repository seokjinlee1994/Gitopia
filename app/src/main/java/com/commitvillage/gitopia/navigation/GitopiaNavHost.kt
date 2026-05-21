package com.commitvillage.gitopia.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.commitvillage.gitopia.githubauth.GithubAuthRoute
import com.commitvillage.gitopia.onboarding.OnboardingRoute
import com.commitvillage.gitopia.repository.RepositorySelectRoute
import com.commitvillage.gitopia.shop.ShopRoute
import com.commitvillage.gitopia.village.VillageHomeRoute

@Composable
fun GitopiaNavHost(
    navController: NavHostController,
    startDestination: GitopiaRoute,
    modifier: Modifier = Modifier
) {
    val navActions = remember(navController) {
        NavActions(navController)
    }

    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        onboardingDestination(navActions)
        githubAuthDestination(navActions)
        repositorySelectDestination(navActions)
        villageHomeDestination(navActions)
        shopDestination(navActions)
    }
}

private fun NavGraphBuilder.onboardingDestination(
    navActions: NavActions
) {
    composable<GitopiaRoute.Onboarding> {
        OnboardingRoute(
            onStartWithGithub = navActions::navigateToGithubAuth
        )
    }
}

private fun NavGraphBuilder.githubAuthDestination(
    navActions: NavActions
) {
    composable<GitopiaRoute.GithubAuth> {
        GithubAuthRoute(
            onAuthSuccess = navActions::navigateToRepositorySelectFromAuth,
            onBack = navActions::navigateBack
        )
    }
}

private fun NavGraphBuilder.repositorySelectDestination(
    navActions: NavActions
) {
    composable<GitopiaRoute.RepositorySelect> {
        RepositorySelectRoute(
            onRepositorySelected = navActions::navigateToVillageHomeFromRepositorySelect,
            onBack = navActions::navigateBack
        )
    }
}

private fun NavGraphBuilder.villageHomeDestination(
    navActions: NavActions
) {
    composable<GitopiaRoute.VillageHome> {
        VillageHomeRoute(
            onOpenShop = navActions::navigateToShop,
            onSelectRepository = navActions::navigateToRepositorySelect
        )
    }
}

private fun NavGraphBuilder.shopDestination(
    navActions: NavActions
) {
    composable<GitopiaRoute.Shop> {
        ShopRoute(
            onBack = navActions::navigateBack
        )
    }
}