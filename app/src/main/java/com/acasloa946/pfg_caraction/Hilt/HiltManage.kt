package com.acasloa946.pfg_caraction.Hilt

import com.acasloa946.pfg_caraction.data.UserDao

abstract class HiltManage {
    //DAO
    abstract fun userDao(): UserDao
}