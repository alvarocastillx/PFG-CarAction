package com.acasloa946.pfg_caraction.Navigation

sealed class Routes(var route:String) {
    object InitScreen : Routes("InitScreen")
    object RegisterScreen : Routes("RegisterScreen")
    object Q1Screen : Routes("Q1Screen")
    object Q2Screen : Routes("Q2Screen")
    object LoginScreen : Routes("LoginScreen")
    object HomeScreen : Routes("HomeScreen")
    object UploadCarScreen : Routes("UploadCarScreen")
    object CarMakesScreen : Routes("CarMakesScreen")
    object CarModelScreen : Routes("CarModelScreen")
    object CarLocationScreen : Routes("CarLocationScreen")






}