package com.j0e101.harakamall.ui.screens.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.j0e101.harakamall.R
import com.j0e101.harakamall.ui.theme.Orange
import com.j0e101.harakamall.ui.theme.Red

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashboardScreen(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize().background(color = Orange)
    ) {
        TopAppBar(
            navigationIcon = {
                IconButton(
                    onClick = {}
                ) {
                    Icon(imageVector = Icons.Default.Menu,
                        contentDescription ="Menu")
                }
            },

            title = {
                Text(
                    text = "Dashboard Section",
                )
            }
        )

        Column (
            modifier = Modifier.verticalScroll(rememberScrollState())
        ) {
            Box {
                //Card
                Card(
                    modifier = Modifier.fillMaxWidth()
                        .height(height = 300.dp),
                    shape = RoundedCornerShape(bottomStart = 60.dp, bottomEnd = 60.dp),
                    colors = CardDefaults.cardColors(Red)

                ) {
                    Text(
                        text = "Yeet"
                    )
                    Text(
                        text = "Scurrt"
                    )
                }
                //End

                Card(
                    modifier = Modifier.fillMaxWidth()
                        .height(height = 180.dp)
                        .align(alignment = Alignment.BottomCenter)
                        .padding(start = 20.dp, end = 20.dp)
                        .offset(y = 90.dp)
                ) { }
            }

            Spacer(modifier = Modifier.height(height = 100.dp))

            //Row(1)
            Row(
                modifier = Modifier.padding(start = 20.dp, end = 20.dp)
                    .fillMaxWidth()
            ) {
                //Card(1)
                Card(
                    modifier = Modifier.width(160.dp)
                        .height(180.dp)
                        .padding(start = 20.dp),
                    elevation = CardDefaults.cardElevation(10.dp)
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Image(
                            painter = painterResource(R.drawable.home),
                            contentDescription = "",
                            modifier = Modifier.size(100.dp)
                        )
                        Text(
                            text = "Home",
                            fontSize = 15.sp,
                        )
                    }

                }
                //EndCard(1)

                Spacer(modifier = Modifier.width(width = 35.dp))

                //Card(2)
                Card(
                    modifier = Modifier.width(160.dp)
                        .height(180.dp)
                        .padding(end = 20.dp)
                ) {
                    Column (
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ){
                        Image(
                            painter = painterResource(R.drawable.about),
                            contentDescription = "",
                            modifier = Modifier.size(100.dp)
                        )
                        Text(
                            text = "About",
                            fontSize = 15.sp,
                        )
                    }
                    }
                }
            //EndCard(2)
            
            }
            //EndRow

        //Row(2)
        Row(
            modifier = Modifier.padding(start = 20.dp, end = 20.dp, top = 20.dp)
                .fillMaxWidth()
        ) {
            //Card(1)
            Card(
                modifier = Modifier.width(160.dp)
                    .height(180.dp)
                    .padding(start = 20.dp),
                elevation = CardDefaults.cardElevation(10.dp)
            ) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(R.drawable.contact),
                        contentDescription = "",
                        modifier = Modifier.size(100.dp)
                    )
                    Text(
                        text = "Contact",
                        fontSize = 15.sp,
                    )
                }

            }
            //EndCard(1)

            Spacer(modifier = Modifier.width(width = 35.dp))

            //Card(2)
            Card(
                modifier = Modifier.width(160.dp)
                    .height(180.dp)
                    .padding(end = 20.dp)
            ) {
                Column (
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ){
                    Image(
                        painter = painterResource(R.drawable.product),
                        contentDescription = "",
                        modifier = Modifier.size(100.dp)
                    )
                    Text(
                        text = "Products",
                        fontSize = 15.sp,
                    )
                }
            }
        }
        //EndCard(2)

    }
    //EndRow

}


@Preview(showBackground = true)
@Composable
fun DashboardScreenPreview(){
    DashboardScreen(rememberNavController())
}