package com.acasloa946.pfg_caraction.Navigation

sealed class Routes(var route:String) {
    object InitScreen : Routes("InitScreen")
    object RegisterScreen : Routes("RegisterScreen")

}