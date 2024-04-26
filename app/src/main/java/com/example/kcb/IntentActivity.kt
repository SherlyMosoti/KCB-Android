package com.example.kcb

import android.content.Intent
import android.graphics.drawable.Icon
import android.os.Bundle
import android.provider.MediaStore
import android.provider.Settings
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
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
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import com.example.kcb.ui.theme.KCBTheme

class IntentActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyIntents()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyIntents(){
    Column(modifier = Modifier
        .fillMaxSize()
        .paint(painterResource(id = R.drawable.background), contentScale = ContentScale.FillBounds)

    ) {
        val mContext = LocalContext.current


        TopAppBar(title = { Text(text = "Intents", color = Color.Gray) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Black),
            navigationIcon = {
                IconButton(onClick = { mContext.startActivity(Intent(mContext, Layoutactivity::class.java)) }) {
                    Icon(imageVector = Icons.Default.ArrowBack,
                        contentDescription = "arrowback" ,
                        tint = Color.DarkGray)
                }
            },
            actions = {

                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Add,
                        contentDescription = "add",
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

        //STK

        OutlinedButton(onClick = {
            val simToolKitLaunchIntent =
                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simToolKitLaunchIntent?.let { mContext.startActivity(it) }
        },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 85.dp, end = 85.dp),
            shape = RoundedCornerShape(10.dp),
            border = BorderStroke(2.dp, Color.Gray)
        ) {
            androidx.compose.material3.Text(
                text = "M-pesa",
                color = Color.White)
            
        }


        Spacer(modifier = Modifier.height(5.dp))

        //Email

        OutlinedButton(onClick = {
            val shareIntent = Intent(Intent.ACTION_SEND)
            shareIntent.type = "text/plain"
            shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("sherlymosoti@gmail.com"))
            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Mansory Car Expo")
            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, the Expo is scheduled for 22nd to 26th July 2024.")
            mContext.startActivity(shareIntent)
        },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 85.dp, end = 85.dp),
            shape = RoundedCornerShape(10.dp),
            border = BorderStroke(2.dp, Color.Gray)
        ) {
            androidx.compose.material3.Text(
                text = "Email",
                color = Color.White)

        }

        Spacer(modifier = Modifier.height(5.dp))

        //SMS

        OutlinedButton(onClick = {
            val smsIntent=Intent(Intent.ACTION_SENDTO)
            smsIntent.data="smsto:0741690058".toUri()
            smsIntent.putExtra("sms_body","Hello Sherly,how was your day?")
            mContext.startActivity(smsIntent)

        },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 85.dp, end = 85.dp),
            shape = RoundedCornerShape(10.dp),
            border = BorderStroke(2.dp, Color.Gray)
        ) {
            androidx.compose.material3.Text(
                text = "SMS",
                color = Color.White)

        }

        //Call
        Spacer(modifier = Modifier.height(5.dp))

        OutlinedButton(onClick = {
            val callIntent=Intent(Intent.ACTION_DIAL)
            callIntent.data="tel:0741690058".toUri()
            mContext.startActivity(callIntent)
        },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 85.dp, end = 85.dp),
            shape = RoundedCornerShape(10.dp),
            border = BorderStroke(2.dp, Color.Gray)
        ) {
            androidx.compose.material3.Text(
                text = "Call",
                color = Color.White)

        }

        //Camera
        Spacer(modifier = Modifier.height(5.dp))

        OutlinedButton(onClick = {
            val cameraIntent=Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            if (cameraIntent.resolveActivity(mContext.packageManager)!=null){
                mContext.startActivity(cameraIntent)

            }else{
                println("Camera app is not available")
            }

        },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 85.dp, end = 85.dp),
            shape = RoundedCornerShape(10.dp),
            border = BorderStroke(2.dp, Color.Gray)
        ) {
            androidx.compose.material3.Text(
                text = "Camera",
                color = Color.White)
        }
        //Share
        Spacer(modifier = Modifier.height(5.dp))

        OutlinedButton(onClick = {
            val shareIntent=Intent(Intent.ACTION_SEND)
            shareIntent.type="text/plain"
            shareIntent.putExtra(Intent.EXTRA_TEXT, "Check out this is a cool content")
            mContext.startActivity(Intent.createChooser(shareIntent, "Share"))

        },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 85.dp, end = 85.dp),
            shape = RoundedCornerShape(10.dp),
            border = BorderStroke(2.dp, Color.Gray)
        ) {
            androidx.compose.material3.Text(
                text = "Share",
                color = Color.White)
        }
        androidx.compose.material3.Text(
            text = "Don't have an aacount? Register.",
            fontSize = 16.sp,
            modifier = Modifier
                .fillMaxWidth()
                .clickable {
                    mContext.startActivity(Intent(mContext,formactivity::class.java))
                },
            textAlign = TextAlign.Center,

            textDecoration = TextDecoration.Underline,
            color = Color.White

        )
    }
}
@Preview(showBackground = true)
@Composable

fun MyIntentsPreview(){
    MyIntents()
}