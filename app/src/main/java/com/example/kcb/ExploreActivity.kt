package com.example.kcb

import android.content.Intent
import android.os.Bundle
import android.provider.Settings
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
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
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import com.example.kcb.ui.theme.KCBTheme

class ExploreActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Explore()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Explore() {

    Column(
        modifier = Modifier
            .fillMaxSize()
    )
    {
        val mContext = LocalContext.current

        TopAppBar(title = { Text(text = "Cities", color = Color.Black) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.White),

            navigationIcon = {
                IconButton(onClick = {

                    mContext.startActivity(Intent(mContext, Layoutactivity::class.java))
                }) {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = "menu",
                        tint = Color.Black
                    )
                }
            },
            actions = {

                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Share,
                        contentDescription = "share",
                        tint = Color.Black
                    )

                }

                IconButton(onClick = {
                    val settingsIntent = Intent(Settings.ACTION_SETTINGS)
                    mContext.startActivity(settingsIntent)
                }) {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "search",
                        tint = Color.Black
                    )


                }
                //end of topappbar
                IconButton(onClick = {
                    val settingsIntent = Intent(Settings.ACTION_SETTINGS)
                    mContext.startActivity(settingsIntent)
                }) {
                    Icon(
                        imageVector = Icons.Default.Notifications,
                        contentDescription = "search",
                        tint = Color.Black
                    )


                }


            })
        Column(
            modifier = Modifier.verticalScroll(rememberScrollState())
        ) {

            androidx.compose.material3.Text(
                text = "Tickets",
                fontSize = 40.sp,
                fontWeight = FontWeight.ExtraBold,
                fontFamily = FontFamily.Cursive,
                modifier = Modifier.padding(start = 10.dp)

            )

        }
        Spacer(modifier = Modifier.height(10.dp))


        //Column 1


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
                    painter = painterResource(id = R.drawable.nairobi),
                    contentDescription = "nairobi",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.FillBounds

                )
                Icon(
                    imageVector = Icons.Default.FavoriteBorder,
                    contentDescription = "favourite",
                    tint = Color.White,
                    modifier = Modifier
                        .align(Alignment.TopEnd)
                        .padding(15.dp)
                )

            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        androidx.compose.material3.Text(
            text = "Nairobi",
            fontSize = 15.sp,
            fontWeight = FontWeight.ExtraBold,
            fontFamily = FontFamily.Serif,
        )
        Spacer(modifier = Modifier.height(5.dp))

        Row {
            Icon(
                imageVector = Icons.Default.Star,
                contentDescription = "star",
                tint = Color.Blue
            )
            Icon(
                imageVector = Icons.Default.Star,
                contentDescription = "star",
                tint = Color.Blue
            )
            Icon(
                imageVector = Icons.Default.Star,
                contentDescription = "star",
                tint = Color.Blue
            )
            Icon(
                imageVector = Icons.Default.Star,
                contentDescription = "star",
                tint = Color.Blue
            )
            Icon(
                imageVector = Icons.Default.Star,
                contentDescription = "star",
                tint = Color.Blue
            )
        }
        Spacer(modifier = Modifier.height(3.dp))
        androidx.compose.material3.Text(
            text = "512 Reviews",
            fontSize = 15.sp,
            fontWeight = FontWeight.ExtraBold,
            fontFamily = FontFamily.Serif,
        )
        Spacer(modifier = Modifier.height(3.dp))
        androidx.compose.material3.Text(
            text = "Ksh.47,000",
            fontSize = 15.sp,
            fontWeight = FontWeight.ExtraBold,
            fontFamily = FontFamily.Serif,
            color = Color.Blue
        )
        Spacer(modifier = Modifier.height(6.dp))

        Row {
            OutlinedButton(onClick = {
                val callIntent = Intent(Intent.ACTION_DIAL)
                callIntent.data = "tel:0741690058".toUri()
                mContext.startActivity(callIntent)
            }) {
                androidx.compose.material3.Text(text = "Call")

            }
            Spacer(modifier = Modifier.width(4.dp))
            OutlinedButton(onClick = {
                val shareIntent = Intent(Intent.ACTION_SEND)
                shareIntent.type = "text/plain"
                shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("sherlymosoti@gmail.com"))
                shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Destination Booking")
                shareIntent.putExtra(
                    Intent.EXTRA_TEXT,
                    "Hello,welcome to our ticket booking site ."
                )
                mContext.startActivity(shareIntent)
            }) {
                androidx.compose.material3.Text(text = "Email")


            }
        }


    }



    //End of Column
}

@Preview(showBackground = true)
@Composable
fun ExplorePreview(){
    Explore()

}

