package com.acasloa946.pfg_caraction.UserInterface.notifications

import android.Manifest
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.content.pm.PackageManager
import android.os.Build
import androidx.core.app.ActivityCompat
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.lifecycle.ViewModel
import com.acasloa946.pfg_caraction.R

class notif : ViewModel() {

    fun notify(context: Context, channelId: String){
        createNotificationChannel(context, channelId)
        val builder = NotificationCompat.Builder(context, channelId)
            .setSmallIcon(R.drawable.image_banner)
            .setContentTitle("Ha recibido un mensaje")
            .setPriority(NotificationManager.IMPORTANCE_DEFAULT)

        with(NotificationManagerCompat.from(context)) {
            if (ActivityCompat.checkSelfPermission(
                    context,
                    Manifest.permission.POST_NOTIFICATIONS
                ) != PackageManager.PERMISSION_GRANTED
            ) {

                return
            }
            notify(0, builder.build())
        }
    }

    fun createNotificationChannel(context: Context, channelId: String,) {
        val name = "pfg_CarActionChannel"
        val importance = NotificationManager.IMPORTANCE_DEFAULT
        val channel = NotificationChannel(channelId, name, importance)

        val notificationManager: NotificationManager =
            context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        notificationManager.createNotificationChannel(channel)
    }

}