package com.acasloa946.pfg_caraction.UserInterface.AuthScreens.InitScreen

import android.content.Context
import androidx.activity.result.ActivityResult
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.acasloa946.pfg_caraction.domain.UsersUseCases.checkIfUserExistsUseCase
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.common.api.ApiException
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.GoogleAuthProvider
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class InitScreenViewmodel @Inject constructor(private val checkIfUserExistsUseCase: checkIfUserExistsUseCase) : ViewModel() {

    private val auth = Firebase.auth



    fun googleAuth(activityResult:ActivityResult, onFailure: () -> Unit,
                   onSuccessCreateAccount : () -> Unit,
                   onSuccessSignIn : () -> Unit,
                   context: Context) {

            try {
                val account = GoogleSignIn.getSignedInAccountFromIntent(activityResult.data!!)
                    .getResult(ApiException::class.java)
                val credential = GoogleAuthProvider.getCredential(account.idToken!!, null)
                FirebaseAuth.getInstance().signInWithCredential(credential)
                    .addOnCompleteListener {
                        viewModelScope.launch {
                            val userExists = checkIfUserExistsUseCase.invoke(context,auth.currentUser?.email.toString())
                            if (userExists) {
                                onSuccessSignIn()
                            }
                            else {
                                onSuccessCreateAccount()
                            }
                        }
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


