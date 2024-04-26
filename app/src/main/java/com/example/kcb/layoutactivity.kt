package com.example.kcb

import android.content.Intent
import android.media.audiofx.BassBoost
import android.os.Bundle
import android.provider.Settings
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kcb.ui.theme.KCBTheme

class Layoutactivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Layout()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Layout(){
    Column(modifier = Modifier
        .fillMaxSize()
        .paint(painterResource(id = R.drawable.background),
            contentScale = ContentScale.FillBounds)) {

        val mContext = LocalContext.current
        //TopAppBar
        TopAppBar(title = { androidx.compose.material3.Text(text = "Home", color = Color.Gray) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Black),
            navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Menu,
                        contentDescription = "Menu" ,
                        tint = Color.DarkGray)
                }
            },
            actions = {

                IconButton(onClick = {
                    val shareIntent=Intent(Intent.ACTION_SEND)
                    shareIntent.type="text/plain"
                    shareIntent.putExtra(Intent.EXTRA_TEXT, "Check out this is a cool content")
                    mContext.startActivity(Intent.createChooser(shareIntent, "Share"))
                }) {
                    Icon(imageVector = Icons.Default.Share,
                        contentDescription = "share",
                        tint = Color.White)
                    
                }
                IconButton(onClick = {
                    val settingsIntent = Intent(Settings.ACTION_SETTINGS)
                    mContext.startActivity(settingsIntent)



                }) {
                    Icon(imageVector = Icons.Default.Settings,
                        contentDescription = "settings",
                        tint = Color.White)

                }

            })
        //End of TopAppBar

        Spacer(modifier = Modifier.height(5.dp))
        androidx.compose.material3.Text(text = "Cars on sale",
            color = Color.White,
            fontWeight = FontWeight.ExtraBold,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontSize = 26.sp
        )


        Spacer(modifier = Modifier.height(15.dp))
    Row {
        Image(painter = painterResource(id = R.drawable.mansory3),
            contentDescription ="car" ,
            modifier = Modifier.size(width = 250.dp, height = 150.dp))

        Spacer(modifier = Modifier.width(20.dp))
        Column {
            androidx.compose.material3.Text(text = "Mercedes G-Wagon",
                fontSize = 20.sp,
                color = Color.White)
            androidx.compose.material3.Text(text = "Most exquisite type of Mercedes for trips",
                color = Color.White)
        }
    }
   //End of row1
        Spacer(modifier = Modifier.height(15.dp))
        Row {
            Image(painter = painterResource(id = R.drawable.mansory10),
                contentDescription ="car" ,
                modifier = Modifier.size(width = 250.dp, height = 150.dp))
            Spacer(modifier = Modifier.width(20.dp))
            Column {
                androidx.compose.material3.Text(text = " Bentley Continental GT",
                    fontSize = 20.sp,
                    color = Color.White)
                androidx.compose.material3.Text(text = "Can either be luxurious or sporty",
                    color = Color.White)
            }
        }
        //End of row2
        Spacer(modifier = Modifier.height(15.dp))
        Row {
            Image(painter = painterResource(id = R.drawable.mansory1),
                contentDescription ="car" ,
                modifier = Modifier.size(width = 250.dp, height = 150.dp))
            Spacer(modifier = Modifier.width(20.dp))
            Column {
                androidx.compose.material3.Text(text = "Mc Laren",
                    fontSize = 20.sp,
                    color = Color.White)
                androidx.compose.material3.Text(text = "An upgraded sports car ",
                    color = Color.White)
            }
        }

        Spacer(modifier = Modifier.height(32.dp))
       Row {
           Spacer(modifier = Modifier.width(56.dp))

           Button(
               onClick = {
                         mContext.startActivity(Intent(mContext,MainActivity::class.java))
               },
               shape = RoundedCornerShape(5.dp),
               colors = ButtonDefaults.buttonColors(Color.DarkGray),

           ) {
               Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "arrowbar", tint = Color.Black)
               androidx.compose.material3.Text(text = "Back",
                   color = Color.Black)
           }
           Spacer(modifier = Modifier.width(42.dp))
           Button(
               onClick = {
                   mContext.startActivity(Intent(mContext,IntentActivity::class.java))
                         },
               shape = RoundedCornerShape(5.dp),
               colors = ButtonDefaults.buttonColors(Color.DarkGray),
           ) {
               Icon(imageVector = Icons.Default.ArrowForward, contentDescription = "arrowbar", tint = Color.Black)
               androidx.compose.material3.Text(text = "Next",
                   color = Color.Black)
           }


       }
    }

}


@Preview(showBackground = true)
@Composable
fun LayoutPreview(){
    Layout()

}