package com.acasloa946.pfg_caraction.UserInterface.Start.InitScreen

import android.content.Context
import android.util.Log
import androidx.activity.result.ActivityResult
import androidx.lifecycle.ViewModel
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.api.ApiException
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.GoogleAuthProvider
import com.google.firebase.auth.auth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class InitScreenViewmodel : ViewModel() {

    private val auth = Firebase.auth



    fun googleAuth(activityResult:ActivityResult, onFailure: () -> Unit,
                   onSuccess : () -> Unit) {

        try {
            val account = GoogleSignIn.getSignedInAccountFromIntent(activityResult.data!!)
                .getResult(ApiException::class.java)
            val credential = GoogleAuthProvider.getCredential(account.idToken!!, null)
            FirebaseAuth.getInstance().signInWithCredential(credential)
                .addOnCompleteListener {
                    onSuccess()
                }
                .addOnFailureListener {
                    onFailure()
                }
        }
        catch (e: ApiException) {
            onFailure()
        }
    }
    }


/*

CERRAR SESIÓN DE GOOGLE

GoogleSignIn.getClient(
            context,
            GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).build()
        ).signOut().addOnCompleteListener {
            // Opcional: Agrega aquí lo que quieras hacer después de cerrar la sesión
        }
 */


