package com.commitvillage.gitopia.navigation

import androidx.navigation.NavHostController

class NavActions(
    private val navController: NavHostController
) {
    fun navigateToGithubAuth() {
        navController.navigate(GitopiaRoute.GithubAuth) {
            popUpTo<GitopiaRoute.Onboarding> {
                inclusive = true
            }
            launchSingleTop = true
        }
    }

    fun navigateToRepositorySelectFromAuth() {
        navController.navigate(GitopiaRoute.RepositorySelect) {
            popUpTo<GitopiaRoute.GithubAuth> {
                inclusive = true
            }

            launchSingleTop = true
        }
    }

    fun navigateToVillageHomeFromRepositorySelect() {
        navController.navigate(GitopiaRoute.VillageHome) {
            popUpTo<GitopiaRoute.RepositorySelect> {
                inclusive = true
            }
            launchSingleTop = true
        }
    }

    fun navigateToRepositorySelect() {
        navController.navigate(GitopiaRoute.RepositorySelect) {
            launchSingleTop = true
        }
    }

    fun navigateToShop() {
        navController.navigate(GitopiaRoute.Shop) {
            launchSingleTop = true
        }
    }

    fun navigateBack() {
        navController.popBackStack()
    }
}