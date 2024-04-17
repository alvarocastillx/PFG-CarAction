package com.acasloa946.pfg_caraction.UserInterface.Main.homeScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.acasloa946.pfg_caraction.R
import com.acasloa946.pfg_caraction.UserInterface.Start.InitScreen.BottomRoundedShape
import com.acasloa946.pfg_caraction.data.CarEntityType
import com.acasloa946.pfg_caraction.pantallaprincipal.Banner
import com.acasloa946.pfg_caraction.pantallaprincipal.BannerImage
import com.acasloa946.pfg_caraction.pantallaprincipal.BienvenidaCard
import com.acasloa946.pfg_caraction.pantallaprincipal.Elipe
import com.acasloa946.pfg_caraction.pantallaprincipal.FilterIcon
import com.acasloa946.pfg_caraction.pantallaprincipal.FilterIconVector
import com.acasloa946.pfg_caraction.pantallaprincipal.FrameButtonsSearch
import com.acasloa946.pfg_caraction.pantallaprincipal.FrameCars
import com.acasloa946.pfg_caraction.pantallaprincipal.Linea1
import com.acasloa946.pfg_caraction.pantallaprincipal.Linea2
import com.acasloa946.pfg_caraction.pantallaprincipal.MainHome
import com.acasloa946.pfg_caraction.pantallaprincipal.MaterialSymbolsMenu
import com.acasloa946.pfg_caraction.pantallaprincipal.SearchBar
import com.acasloa946.pfg_caraction.pantallaprincipal.SearchBarFrame
import com.acasloa946.pfg_caraction.pantallaprincipal.TextWelcome
import com.acasloa946.pfg_caraction.pantallaprincipal.TopLevel
import com.acasloa946.pfg_caraction.pantallaprincipal.UserImage
import com.acasloa946.pfg_caraction.pantallaprincipal.UserImageVEC
import com.acasloa946.pfg_caraction.pantallaprincipal.UserImageVECVEC
import com.acasloa946.pfg_caraction.pantallaprincipal.Vector
import com.acasloa946.pfg_caraction.searchgadget.SearchGadget
import com.acasloa946.pfg_caraction.ui.theme.BlancoMain
import com.acasloa946.pfg_caraction.ui.theme.GrisMain
import com.acasloa946.pfg_caraction.ui.theme.RojoMain


/**
 * Pujas, calificación de usuarios.
 * BDDs: users, cars, pujas
 * Notificaciones
 * API PARA MARCAS Y ¿MODELOS? Y UTILIZAR FOTOS DESPUES
 *
 */
@Composable
fun PantallaPrincipalComponent(
    modifier: Modifier = Modifier,
    textWelcome: String = "",
    rightMenuClick: () -> Unit = {},
    onUserClick: () -> Unit = {},
    homeScreenViewmodel: homeScreenViewmodel
) {
    TopLevel(modifier = modifier) {
        Banner(modifier = Modifier
            .rowWeight(1.0f)
            .clip(BottomRoundedShape(60.dp))
            .border(2.dp, RojoMain, BottomRoundedShape(60.dp))) {
            MaterialSymbolsMenu(
                rightMenuClick = rightMenuClick,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 38.0.dp,
                        y = 26.0.dp
                    )
                )
            ) {
                Vector(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.000011444091796875.dp,
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
                Image(painter = painterResource(id = R.drawable.image_banner), contentDescription = null,
                    modifier = Modifier.fillMaxSize())
            }
        }
        MainHome(modifier = Modifier.rowWeight(1.0f)) {
            BienvenidaCard(
                onUserClick = onUserClick,
                modifier = Modifier.rowWeight(1.0f)
            ) {
                TextWelcome(textWelcome = "Bienvenido, $textWelcome")
                UserImage {
                    Elipe(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.Center,
                            offset = DpOffset(
                                x = 0.0.dp,
                                y = 0.0.dp
                            )
                        )
                    )
                    UserImageVEC(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.Center,
                            offset = DpOffset(
                                x = -0.000102996826171875.dp,
                                y = 0.000019073486328125.dp
                            )
                        )
                    ) {
                        UserImageVECVEC(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.Center,
                                offset = DpOffset(
                                    x = -0.0000438690185546875.dp,
                                    y = 0.0001163482666015625.dp
                                )
                            )
                        )
                    }
                }
            }
            Linea1()
            FrameButtonsSearch(modifier = Modifier.rowWeight(1.0f)) {
                LazyRow(
                    modifier = Modifier.fillMaxSize(),
                    horizontalArrangement = Arrangement.spacedBy(3.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    items(CarEntityType.entries) {
                        SearchGadget(modifier = Modifier.size(104.dp,32.dp),
                            gadgetText = it.name)
                    }
                }
            }
            Linea2()
            Spacer(modifier = Modifier.padding(5.dp))
            SearchBar(modifier = Modifier
                .rowWeight(1.0f)
                .columnWeight(1.0f)) {
                SearchBarFrame(modifier = Modifier.rowWeight(1.0f)) {
                    androidx.compose.material3.TextField(
                        value = homeScreenViewmodel.searchBarText,
                        onValueChange = {
                            homeScreenViewmodel.changeSearchBarText(it)
                        },
                        leadingIcon = {
                            Icon(imageVector = Icons.Default.Search, contentDescription = null)
                        },
                        shape = RoundedCornerShape(5.dp),
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedBorderColor = RojoMain,
                            unfocusedBorderColor = RojoMain,
                            focusedLabelColor = RojoMain,
                            unfocusedLabelColor = RojoMain,
                            unfocusedTextColor = RojoMain,
                            focusedTextColor = GrisMain,
                        ),
                        modifier = Modifier
                            .background(BlancoMain)
                            .fillMaxSize()
                            .border(3.dp, RojoMain,RoundedCornerShape(15.dp)),
                        textStyle = TextStyle.Default.copy(fontSize = 10.sp),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)




                    )

                }
                FilterIcon (onFilterClick = {

                }) {
                    FilterIconVector(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.Center,
                            offset = DpOffset(
                                x = 0.24255084991455078.dp,
                                y = 0.3011016845703125.dp
                            )
                        )
                    )
                }
            }
            FrameCars(modifier = Modifier.rowWeight(1.0f)) {

            }
        }
    }
}



/*
 Image(painter = painterResource(id = R.drawable.image_banner), contentDescription = null,
                    modifier = Modifier.fillMaxSize())


 */