package com.example.kcb

import android.content.Intent
import android.os.Bundle
import android.provider.Settings
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
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
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
import com.example.kcb.ui.theme.KCBTheme

class DestinationActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Destination()


        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Destination(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            )
    {
        val mContext = LocalContext.current

        TopAppBar(title = { Text(text = "Destination", color = Color.Gray) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Black),

            navigationIcon = {
                IconButton(onClick = {

                    mContext.startActivity(Intent(mContext, Layoutactivity::class.java))
                }) {
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
                    //end of topappbar

                }


            })


        Box (modifier = Modifier
            .fillMaxWidth()
            .height(250.dp),
            contentAlignment = Alignment.Center){
            Image(painter = painterResource(id = R.drawable.nairobi), contentDescription ="nairobi" ,
                modifier =Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )

            androidx.compose.material3.Text(
                text ="Let's plan your next vacation",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                textAlign = TextAlign.Center)

        }
        //End of box

        Spacer(modifier = Modifier.height(20.dp))

        var search by remember{ mutableStateOf("")
        }

        OutlinedTextField(
            value =search , onValueChange ={search = it},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            placeholder ={ androidx.compose.material3.Text(text = "What's your next destination?") },
            leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = "search")})
        //End of search bar

        Spacer(modifier = Modifier.height(20.dp))

        androidx.compose.material3.Text(text ="Recently viewed..." ,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.SansSerif,
            modifier = Modifier.padding(20.dp, end = 20.dp))

        Spacer(modifier = Modifier.height(7.dp))

        Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {
            Card (modifier = Modifier
                .height(250.dp)
                .width(200.dp)){
                Column {
                    Box(modifier = Modifier
                        .fillMaxWidth()
                        .height(150.dp),
                        contentAlignment = Alignment.Center) {
                        Image(painter = painterResource(id = R.drawable.nairobi), contentDescription ="nairobi",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop)
                    }

                    Spacer(modifier = Modifier.height(10.dp))

                    //card 1
                    androidx.compose.material3.Text(
                        text = "Kianda.",
                        fontSize = 16.sp,
                        modifier = Modifier
                            .fillMaxWidth(),
                        textAlign = TextAlign.Center)


                }

            }
            //End of Card 1
            Spacer(modifier = Modifier.width(5.dp))
            Card (modifier = Modifier
                .height(250.dp)
                .width(200.dp)){
                Column {
                    Box(modifier = Modifier
                        .fillMaxWidth()
                        .height(150.dp),
                        contentAlignment = Alignment.Center) {
                        Image(painter = painterResource(id = R.drawable.nairobi), contentDescription ="nairobi",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop)
                    }

                    Spacer(modifier = Modifier.height(10.dp))

                    //card 1
                    androidx.compose.material3.Text(
                        text = "Nairobi.",
                        fontSize = 16.sp,
                        modifier = Modifier
                            .fillMaxWidth(),
                        textAlign = TextAlign.Center)




                }

            }
            //End of Card 1
            Spacer(modifier = Modifier.width(5.dp))

            Card (modifier = Modifier
                .height(250.dp)
                .width(200.dp)){
                Column {
                    Box(modifier = Modifier
                        .fillMaxWidth()
                        .height(150.dp),
                        contentAlignment = Alignment.Center) {
                        Image(painter = painterResource(id = R.drawable.nairobi), contentDescription ="nairobi",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop)
                    }

                    Spacer(modifier = Modifier.height(10.dp))

                    //card 1
                    androidx.compose.material3.Text(
                        text = "Gachie.",
                        fontSize = 16.sp,
                        modifier = Modifier
                            .fillMaxWidth(),
                        textAlign = TextAlign.Center)


                }

            }
            //End of Card 1
            Spacer(modifier = Modifier.width(5.dp))
            Card (modifier = Modifier
                .height(250.dp)
                .width(200.dp)){
                Column {
                    Box(modifier = Modifier
                        .fillMaxWidth()
                        .height(150.dp),
                        contentAlignment = Alignment.Center) {
                        Image(painter = painterResource(id = R.drawable.nairobi), contentDescription ="nairobi",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop)
                    }

                    Spacer(modifier = Modifier.height(10.dp))

                    //card 1
                    androidx.compose.material3.Text(
                        text = "Thindigwa.",
                        fontSize = 16.sp,
                        modifier = Modifier
                            .fillMaxWidth(),
                        textAlign = TextAlign.Center)



                }

            }
            //End of Card 1
            Spacer(modifier = Modifier.width(5.dp))




        }
        //End of row 1
    }



}




@Preview(showBackground = true)
@Composable
fun DestinationPreview(){
    Destination()

}
