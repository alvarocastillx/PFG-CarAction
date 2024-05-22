package com.acasloa946.pfg_caraction.UserInterface.Main.homeScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.navigation.NavController
import coil.compose.SubcomposeAsyncImage
import com.acasloa946.pfg_caraction.Navigation.Routes
import com.acasloa946.pfg_caraction.R
import com.acasloa946.pfg_caraction.UserInterface.Main.FilterDialog.FilterDialogComponent
import com.acasloa946.pfg_caraction.UserInterface.Main.FilterDialog.FilterDialogViewmodel
import com.acasloa946.pfg_caraction.UserInterface.Main.carScreen.CarScreenViewmodel
import com.acasloa946.pfg_caraction.UserInterface.Start.InitScreen.BottomRoundedShape
import com.acasloa946.pfg_caraction.carcard.FrameImage
import com.acasloa946.pfg_caraction.carcard.Line1
import com.acasloa946.pfg_caraction.carcard.Line2
import com.acasloa946.pfg_caraction.carcard.MakeModelText
import com.acasloa946.pfg_caraction.carcard.PriceText
import com.acasloa946.pfg_caraction.carcard.against
import com.acasloa946.pfg_caraction.notfoundalert.NotFoundText
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
import com.acasloa946.pfg_caraction.ui.theme.BlancoMain
import com.acasloa946.pfg_caraction.ui.theme.GrisMain
import com.acasloa946.pfg_caraction.ui.theme.RojoMain
import com.acasloa946.pfg_caraction.ui.theme.againstFont
import com.acasloa946.pfg_caraction.ui.theme.raillincFont
import com.google.relay.compose.RelayText
import com.google.relay.compose.RowScopeInstanceImpl.align


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
    homeScreenViewmodel: homeScreenViewmodel,
    navController: NavController,
    carScreenViewmodel: CarScreenViewmodel,
    onFilterClick : () -> Unit
) {


    val fetchedCars by homeScreenViewmodel.fetchedCars.collectAsState()
    val fetchedCarsType by homeScreenViewmodel.fetchedCarTypes.collectAsState()
    TopLevel(modifier = modifier) {
        Banner(
            modifier = Modifier
                .rowWeight(1.0f)
                .clip(BottomRoundedShape(60.dp))
                .border(2.dp, RojoMain, BottomRoundedShape(60.dp))
        ) {
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
                Image(
                    painter = painterResource(id = R.drawable.image_banner),
                    contentDescription = null,
                    modifier = Modifier.fillMaxSize()
                )
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
                    items(fetchedCarsType) {
                        SearchButtonComponent(modifier = Modifier.fillMaxWidth(),
                            searchText = it,
                            onSearchClick = {
                                homeScreenViewmodel.filterListByTypeButton(it)
                            })
                    }
                }
            }
            Linea2()
            Spacer(modifier = Modifier.padding(10.dp))
            SearchBar(
                modifier = Modifier
                    .rowWeight(1.0f)
                    .columnWeight(1.0f)
            ) {
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
                            .border(3.dp, RojoMain, RoundedCornerShape(15.dp)),
                        textStyle = TextStyle.Default.copy(fontSize = 10.sp),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)


                    )

                }
                FilterIcon(onFilterClick = onFilterClick) {
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
            Spacer(modifier = Modifier.padding(15.dp))
            FrameCars(modifier = Modifier.rowWeight(1.0f)) {
                val scrollState = rememberLazyListState()
                val countOfList = homeScreenViewmodel.countOfList
                if (fetchedCars.isNotEmpty()) {
                    LazyColumn(
                        verticalArrangement = Arrangement.spacedBy(5.dp),
                        state = scrollState
                    ) {
                        if (!scrollState.canScrollForward) {
                            homeScreenViewmodel.add5toList()
                        }
                        items(fetchedCars.take(countOfList)) {
                            CarCardComponent(
                                makeModelText = ("${it.make} ${it.model}"),
                                priceText = "${it.price}€",
                                image = it.image!!,
                                onCarClick = {
                                    navController.navigate(Routes.CarScreen.route)
                                    carScreenViewmodel.clickedCar = it
                                }
                            )
                        }

                    }
                } else {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .fillMaxSize()
                    ) {
                        NotFoundAlertComponent(modifier = Modifier.size(205.dp, 29.dp))
                    }
                }
            }
        }

    }
    Spacer(modifier = Modifier.padding(40.dp))
}


@Composable
fun CarCardComponent(
    modifier: Modifier = Modifier.clip(RoundedCornerShape(20.dp)),
    makeModelText: String = "",
    priceText: String = "",
    onCarClick: () -> Unit = {},
    image:String
) {
    com.acasloa946.pfg_caraction.carcard.TopLevel(
        onCarClick = onCarClick,
        modifier = modifier
    ) {
        FrameImage {
            SubcomposeAsyncImage(
                model = image,
                contentDescription = null,
                contentScale = ContentScale.FillWidth,
                modifier = Modifier
                    .clip(RoundedCornerShape(20.dp))
                    .border(2.dp, RojoMain, RoundedCornerShape(20.dp))
                    .align(Alignment.CenterVertically),
                loading = {
                    CircularProgressIndicator(
                        modifier = Modifier
                            .align(Alignment.Center)
                            .fillMaxSize(),
                        color = RojoMain
                    )
                }
            )
        }
        Line1()
        MakeModelTextC(makeModelText = makeModelText)
        Line2()
        PriceText(priceText = priceText)
    }
}

@Composable
fun MakeModelTextC(
    makeModelText: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = makeModelText,
        fontSize = 20.0.sp,
        fontFamily = againstFont,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.3649999618530273.em,
        modifier = modifier,
        fontWeight = FontWeight.ExtraBold
    )
}

/*

 */



@Composable
fun SearchButtonComponent(
    modifier: Modifier = Modifier,
    searchText: String = "",
    onSearchClick: () -> Unit = {}
) {
    com.acasloa946.pfg_caraction.searchbutton.TopLevel(
        onSearchClick = onSearchClick,
        modifier = modifier
    ) {
        TextComponent(searchText = searchText)
    }
}

@Composable
fun TextComponent(
    searchText: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = searchText,
        fontSize = 15.0.sp,
        fontFamily = raillincFont,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.6039999643961587.em,
        modifier = modifier
    )
}


@Composable
fun NotFoundAlertComponent(modifier: Modifier = Modifier) {
    com.acasloa946.pfg_caraction.notfoundalert.TopLevel(modifier = modifier) {
        NotFoundText(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.5.dp,
                    y = 0.0.dp
                )
            )
        )
    }
}

@Composable
fun FilterDialog(
    homeScreenViewmodel: homeScreenViewmodel,
    filterDialogViewmodel: FilterDialogViewmodel
){
    Dialog(onDismissRequest = { homeScreenViewmodel.changeDialog() }) {
        Column (modifier = Modifier
            .height(400.dp)
            .background(GrisMain),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {
            FilterDialogComponent(modifier = Modifier.fillMaxSize(), filterDialogViewmodel = filterDialogViewmodel, homeScreenViewmodel, onApplyClick = {
                val filterList = filterDialogViewmodel.filterObjectMaker()
                homeScreenViewmodel.filterArea(filterList)
            })
        }
    }
}


