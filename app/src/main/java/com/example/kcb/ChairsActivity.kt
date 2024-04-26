package com.example.kcb

import android.content.Intent
import android.os.Bundle
import android.provider.Settings
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kcb.ui.theme.Grey
import com.example.kcb.ui.theme.KCBTheme

class ChairsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Chairs()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Chairs() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Grey)
    ) {
        val mContext = LocalContext.current

        TopAppBar(title = { Text(text = "", color = Color.Gray) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Grey),
            navigationIcon = {
                IconButton(onClick = {
                    mContext.startActivity(
                        Intent(
                            mContext,
                            Layoutactivity::class.java
                        )
                    )
                }) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "arrowback",
                        tint = Color.Black
                    )
                }
            },
            actions = {

                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Lock,
                        contentDescription = "lock",
                        tint = Color.Black
                    )

                }

                IconButton(onClick = {

                }) {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = "menu",
                        tint = Color.Black
                    )

                }

            })
        //End of TopAppBar

        Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {
            androidx.compose.material3.Text(
                text = "Chairs",
                fontSize = 30.sp,
                fontWeight = FontWeight.ExtraBold,
                fontFamily = FontFamily.Serif,
            )

            Spacer(modifier = Modifier.width(15.dp))
            androidx.compose.material3.Text(
                text = "Tables",
                fontSize = 30.sp,
                fontWeight = FontWeight.Normal,
                fontFamily = FontFamily.Serif,
                color = Color.Gray
            )

            Spacer(modifier = Modifier.width(15.dp))
            androidx.compose.material3.Text(
                text = "Sofa",
                fontSize = 30.sp,
                fontWeight = FontWeight.Normal,
                fontFamily = FontFamily.Serif,
                color = Color.Gray
            )

            Spacer(modifier = Modifier.width(15.dp))
            androidx.compose.material3.Text(
                text = "Beds",
                fontSize = 30.sp,
                fontWeight = FontWeight.Normal,
                fontFamily = FontFamily.Serif,
                color = Color.Gray
            )

        }
        Spacer(modifier = Modifier.height(10.dp))
        Row {
            androidx.compose.material3.Text(
                text = "120 products",
                fontSize = 15.sp,
                fontWeight = FontWeight.Normal,
                fontFamily = FontFamily.Serif,
                color = Color.Gray
            )


            androidx.compose.material3.Text(
                text = " Popular",
                fontSize = 15.sp,
                fontWeight = FontWeight.Normal,
                modifier = Modifier.padding(start = 210.dp),

                fontFamily = FontFamily.Serif,
                color = Color.Black
            )
            IconButton(onClick = {

            }) {
                Icon(
                    imageVector = Icons.Default.ArrowDropDown,
                    contentDescription = "dropdown",
                    tint = Color.Black
                )

            }


        }
        Spacer(modifier = Modifier.height(3.dp))

        //Column 1
        Column {
            Row {

                Spacer(modifier = Modifier.width(20.dp))
                Card {
                    Card(
                        modifier = Modifier
                            .height(150.dp)
                            .width(150.dp)
                    ) {


                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Spacer(modifier = Modifier.width(10.dp))
                            Image(
                                painter = painterResource(id = R.drawable.chair2),
                                contentDescription = "nairobi",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds

                            )


                        }

                    }
                    Spacer(modifier = Modifier.height(20.dp))

                    androidx.compose.material3.Text(
                        text = "Amos Chair",
                        fontSize = 25.sp,
                        fontWeight = FontWeight.ExtraBold,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    androidx.compose.material3.Text(
                        text = "A wooden chair an",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                    )
                    androidx.compose.material3.Text(
                        text = " amazing design ",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Row {
                        androidx.compose.material3.Text(
                            text = " $ 680 ",
                            fontSize = 20.sp,
                            fontFamily = FontFamily.Serif,
                        )
                        Spacer(modifier = Modifier.width(8.dp))

                        IconButton(onClick = {

                        }) {
                            Icon(
                                imageVector = Icons.Default.Lock,
                                contentDescription = "lock",
                                tint = Color.DarkGray
                            )

                        }


                    }


                    //End of column 1


                }
                Spacer(modifier = Modifier.width(20.dp))


                Card {
                    Card(
                        modifier = Modifier
                            .height(150.dp)
                            .width(150.dp)
                    ) {


                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Spacer(modifier = Modifier.width(10.dp))
                            Image(
                                painter = painterResource(id = R.drawable.chair1),
                                contentDescription = "nairobi",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds

                            )


                        }

                    }
                    Spacer(modifier = Modifier.height(20.dp))

                    androidx.compose.material3.Text(
                        text = "Amos Chair",
                        fontSize = 25.sp,
                        fontWeight = FontWeight.ExtraBold,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    androidx.compose.material3.Text(
                        text = "A wooden chair an",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                    )
                    androidx.compose.material3.Text(
                        text = " amazing design ",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Row {
                        androidx.compose.material3.Text(
                            text = " $ 680 ",
                            fontSize = 20.sp,
                            fontFamily = FontFamily.Serif,
                        )
                        Spacer(modifier = Modifier.width(8.dp))

                        IconButton(onClick = {

                        }) {
                            Icon(
                                imageVector = Icons.Default.Lock,
                                contentDescription = "lock",
                                tint = Color.DarkGray
                            )

                        }


                    }


                    //End of column 1



                }



            }

            // end of row one

        }




    }
}


    



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ChairsPreview(){
    Chairs()
}
