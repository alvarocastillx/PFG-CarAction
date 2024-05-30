package com.acasloa946.pfg_caraction.UserInterface.MainScreens.carScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.SubcomposeAsyncImage
import com.acasloa946.pfg_caraction.Navigation.Routes
import com.acasloa946.pfg_caraction.R
import com.acasloa946.pfg_caraction.UserInterface.MainScreens.profileScreen.profileViewmodel
import com.acasloa946.pfg_caraction.UserInterface.AuthScreens.InitScreen.BottomRoundedShape
import com.acasloa946.pfg_caraction.carscreen.AO
import com.acasloa946.pfg_caraction.carscreen.Banner
import com.acasloa946.pfg_caraction.carscreen.BannerImage
import com.acasloa946.pfg_caraction.carscreen.ButtonContact
import com.acasloa946.pfg_caraction.carscreen.ButtonDelete
import com.acasloa946.pfg_caraction.carscreen.ButtonFavs
import com.acasloa946.pfg_caraction.carscreen.ContactarConVendedor
import com.acasloa946.pfg_caraction.carscreen.DeleteText
import com.acasloa946.pfg_caraction.carscreen.Elipe
import com.acasloa946.pfg_caraction.carscreen.FavText
import com.acasloa946.pfg_caraction.carscreen.FieldAO
import com.acasloa946.pfg_caraction.carscreen.FieldFuel
import com.acasloa946.pfg_caraction.carscreen.FieldKM
import com.acasloa946.pfg_caraction.carscreen.FieldLocalization
import com.acasloa946.pfg_caraction.carscreen.FieldMake
import com.acasloa946.pfg_caraction.carscreen.FieldModel
import com.acasloa946.pfg_caraction.carscreen.FieldPlate
import com.acasloa946.pfg_caraction.carscreen.FieldPrice
import com.acasloa946.pfg_caraction.carscreen.FieldTrans
import com.acasloa946.pfg_caraction.carscreen.FrameUsername
import com.acasloa946.pfg_caraction.carscreen.Fueld
import com.acasloa946.pfg_caraction.carscreen.ImageFrame
import com.acasloa946.pfg_caraction.carscreen.InfoText
import com.acasloa946.pfg_caraction.carscreen.InformaciNHeader
import com.acasloa946.pfg_caraction.carscreen.KMS
import com.acasloa946.pfg_caraction.carscreen.Linea1
import com.acasloa946.pfg_caraction.carscreen.LocalizaciN
import com.acasloa946.pfg_caraction.carscreen.MainCarScreen
import com.acasloa946.pfg_caraction.carscreen.MapFrame
import com.acasloa946.pfg_caraction.carscreen.Marca
import com.acasloa946.pfg_caraction.carscreen.MaterialSymbolsMenu
import com.acasloa946.pfg_caraction.carscreen.MatrCula
import com.acasloa946.pfg_caraction.carscreen.Modelo
import com.acasloa946.pfg_caraction.carscreen.Precio
import com.acasloa946.pfg_caraction.carscreen.RC
import com.acasloa946.pfg_caraction.carscreen.RC2
import com.acasloa946.pfg_caraction.carscreen.RC3
import com.acasloa946.pfg_caraction.carscreen.RC4
import com.acasloa946.pfg_caraction.carscreen.RC6
import com.acasloa946.pfg_caraction.carscreen.RC7
import com.acasloa946.pfg_caraction.carscreen.Rectangle
import com.acasloa946.pfg_caraction.carscreen.Rectangle2
import com.acasloa946.pfg_caraction.carscreen.Rectangle3
import com.acasloa946.pfg_caraction.carscreen.RectangleDelete
import com.acasloa946.pfg_caraction.carscreen.RectangleFav
import com.acasloa946.pfg_caraction.carscreen.RectanglePublish
import com.acasloa946.pfg_caraction.carscreen.TopLevel
import com.acasloa946.pfg_caraction.carscreen.Trans
import com.acasloa946.pfg_caraction.carscreen.UserImage
import com.acasloa946.pfg_caraction.carscreen.UserImageSynth
import com.acasloa946.pfg_caraction.carscreen.UserImageVECVEC
import com.acasloa946.pfg_caraction.carscreen.Vector
import com.acasloa946.pfg_caraction.carscreen.VectorDlete
import com.acasloa946.pfg_caraction.carscreen.VectorFav
import com.acasloa946.pfg_caraction.carscreen.VectorPublish
import com.acasloa946.pfg_caraction.carscreen.raillinc
import com.acasloa946.pfg_caraction.ui.theme.RojoMain
import com.acasloa946.pfg_caraction.ui.theme.againstFont
import com.acasloa946.pfg_caraction.ui.theme.raillincFont
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.MapUiSettings
import com.google.maps.android.compose.Marker
import com.google.maps.android.compose.rememberCameraPositionState
import com.google.relay.compose.BoxScopeInstanceImpl.align
import com.google.relay.compose.RelayText
import kotlinx.coroutines.delay


@Composable
fun CarScreenComponent(
    modifier: Modifier = Modifier,
    makeText: String = "",
    modelText: String = "",
    plateText: String = "",
    localizationText: String = "",
    yearText: String = "",
    kmText: String = "",
    transText: String = "",
    fuelText: String = "",
    priceText: String = "",
    userNameText: String = "",
    onContactClick: () -> Unit = {},
    carScreenViewmodel: CarScreenViewmodel,
    navController: NavController,
    profileViewmodel: profileViewmodel,
    onLeftMenuClick: () -> Unit,
    onFavClick : () -> Unit,
    infoText : String,
    onDeleteClick :() -> Unit
) {

    val cameraPositionState = rememberCameraPositionState {
        position =
            CameraPosition.fromLatLngZoom(
                LatLng(
                    carScreenViewmodel.clickedCar.location!!.first!!,
                    carScreenViewmodel.clickedCar.location!!.second!!
                ), 8f
            )
    }

    var isMapLoaded by remember { mutableStateOf(false) }
    val context = LocalContext.current
    var authorCheck by remember {
        mutableStateOf(false)
    }


    LaunchedEffect(Unit) {
        delay(2000)
        isMapLoaded = true
        authorCheck = carScreenViewmodel.checkIfAuthor(context)
    }




    TopLevel(modifier = modifier) {
        Banner(
            modifier = Modifier
                .rowWeight(1.0f)
                .clip(BottomRoundedShape(60.dp))
                .border(2.dp, RojoMain, BottomRoundedShape(60.dp))
        ) {
            MaterialSymbolsMenu(
                modifier = Modifier
                    .boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 38.0.dp,
                            y = 26.0.dp
                        )
                    )
                    .clickable {
                        onLeftMenuClick()
                    }
            ) {
                Vector(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = -0.000476837158203125.dp,
                            y = 0.0.dp
                        )
                    )
                )
            }
            BannerImage(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -0.0732574462890625.dp,
                        y = 0.0.dp
                    )
                )
            ) {

                Image(
                    painter = painterResource(id = R.drawable.image_banner),
                    contentDescription = null,
                    modifier = Modifier.fillMaxSize()
                )

            }
        }
        MainCarScreen(
            modifier = Modifier
                .rowWeight(1.0f)
                .columnWeight(1.0f)
        ) {
            FrameUsername (modifier = Modifier.clickable {
                navController.navigate(Routes.ProfileScreen.route)
                profileViewmodel.userName = userNameText
            }) {
                UserNameComponent(userNameText = userNameText)
                UserImage {
                    UserImageSynth {
                        Elipe()
                    }
                    UserImageVECVEC(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.Center,
                            offset = DpOffset(
                                x = -0.0002689361572265625.dp,
                                y = 0.0000743865966796875.dp
                            )
                        )
                    )
                }
            }
            ImageFrame {

                Row (
                    modifier = Modifier.fillMaxSize(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ){
                    SubcomposeAsyncImage(
                        model = carScreenViewmodel.clickedCar.image,
                        contentDescription = null,
                        contentScale = ContentScale.FillWidth,
                        modifier = Modifier
                            .clip(RoundedCornerShape(20.dp))
                            .border(2.dp, RojoMain, RoundedCornerShape(20.dp)),
                        loading = {
                            CircularProgressIndicator(
                                modifier = Modifier
                                    .size(100.dp)
                                    .align(Alignment.Center),
                                color = RojoMain
                            )
                        }
                    )
                }
            }
            MapFrame {
                if (isMapLoaded) {
                    GoogleMap(
                        cameraPositionState = cameraPositionState,
                        uiSettings = MapUiSettings(scrollGesturesEnabled = false)
                    ) {
                        Marker(
                            position = LatLng(
                                carScreenViewmodel.clickedCar.location!!.first!!,
                                carScreenViewmodel.clickedCar.location!!.second!!
                            ),
                            title = "Tu ubicación"
                        )
                    }
                } else {
                    CircularProgressIndicator(
                        modifier = Modifier
                            .align(Alignment.Center)
                            .size(100.dp),
                        color = RojoMain
                    )
                }


            }
            FieldMake {
                Rectangle2(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 0.0.dp
                        )
                    )
                )
                Marca(
                    makeText = makeText,
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.000457763671875.dp,
                            y = 0.9824447631835938.dp
                        )
                    )
                )
            }
            FieldModel {
                RC(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 0.0.dp
                        )
                    )
                )
                Modelo(
                    modelText = modelText,
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.000457763671875.dp,
                            y = 0.9824447631835938.dp
                        )
                    )
                )
            }
            FieldPlate {
                Rectangle(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 0.0.dp
                        )
                    )
                )
                MatrCula(
                    plateText = plateText,
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.000457763671875.dp,
                            y = 0.9824447631835938.dp
                        )
                    )
                )
            }
            FieldLocalization {
                Rectangle3(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 0.0.dp
                        )
                    )
                )
                LocalizaciN(
                    localizationText = localizationText,
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.000457763671875.dp,
                            y = 0.9824447631835938.dp
                        )
                    )
                )
            }
            FieldAO {
                RC2(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 0.0.dp
                        )
                    )
                )
                AO(
                    yearText = yearText,
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.000457763671875.dp,
                            y = 0.9824447631835938.dp
                        )
                    )
                )
            }
            FieldKM {
                RC3(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 0.0.dp
                        )
                    )
                )
                KMS(
                    kmText = kmText,
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.000457763671875.dp,
                            y = 0.9824447631835938.dp
                        )
                    )
                )
            }
            FieldTrans {
                RC6(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 0.0.dp
                        )
                    )
                )
                Trans(
                    transText = transText,
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.000457763671875.dp,
                            y = 0.9824447631835938.dp
                        )
                    )
                )
            }
            FieldFuel {
                RC7(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 0.0.dp
                        )
                    )
                )
                Fueld(
                    fuelText = fuelText,
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.000457763671875.dp,
                            y = 0.9824447631835938.dp
                        )
                    )
                )
            }
            FieldPrice {
                RC4(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 0.0.dp
                        )
                    )
                )
                Precio(
                    priceText = priceText,
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.000457763671875.dp,
                            y = 0.9824447631835938.dp
                        )
                    )
                )
            }
            ButtonContact(onContactClick = onContactClick) {
                RectanglePublish(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 0.0.dp
                        )
                    )
                )
                VectorPublish(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 129.12752151489258.dp,
                            y = -0.00004100799560546875.dp
                        )
                    )
                )
                ContactarConVendedor(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = -0.5.dp
                        )
                    )
                )
            }
            ButtonFavs(onFavClick = onFavClick) {
                RectangleFav(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 0.0.dp
                        )
                    )
                )
                VectorFav(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 129.12752151489258.dp,
                            y = 0.00008106231689453125.dp
                        )
                    )
                )
                FavText(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 0.13232421875.dp
                        )
                    )
                )
            }
            if (authorCheck) {
                ButtonDelete(onDeleteClick = onDeleteClick) {
                    RectangleDelete(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.Center,
                            offset = DpOffset(
                                x = 0.0.dp,
                                y = 0.0.dp
                            )
                        )
                    )
                    VectorDlete(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.Center,
                            offset = DpOffset(
                                x = 129.12752151489258.dp,
                                y = 0.00008106231689453125.dp
                            )
                        )
                    )
                    DeleteText(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.Center,
                            offset = DpOffset(
                                x = 0.0.dp,
                                y = 0.13232421875.dp
                            )
                        )
                    )
                }
            }
            Linea1()
            InformaciNHeaderComp()
            Spacer(modifier = Modifier.padding(2.dp))
            InfoText(
                infoText = infoText,
                modifier = Modifier
                    .rowWeight(1.0f)
                    .columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun InformaciNHeaderComp(modifier: Modifier = Modifier) {
    RelayText(
        content = "Información",
        fontSize = 28.0.sp,
        fontFamily = againstFont,
        color = Color(
            alpha = 255,
            red = 248,
            green = 241,
            blue = 233
        ),
        height = 1.6039999553135462.em,
        maxLines = -1,
        modifier = modifier
            .requiredWidth(289.0.dp)
            .requiredHeight(33.0.dp)
    )
}

@Composable
fun UserNameComponent(modifier: Modifier = Modifier, userNameText: String = "") {
    RelayText(
        content = userNameText,
        fontSize = 12.0.sp,
        fontFamily = raillincFont,
        color = Color(
            alpha = 255,
            red = 248,
            green = 241,
            blue = 233
        ),
        height = 1.6039999326070147.em,
        modifier = modifier
    )
}