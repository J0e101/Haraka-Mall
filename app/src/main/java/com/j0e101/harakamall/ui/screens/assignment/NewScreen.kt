package com.j0e101.harakamall.ui.screens.assignment

import android.widget.Space
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
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
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.layout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.j0e101.harakamall.R
import com.j0e101.harakamall.ui.theme.Gold
import com.j0e101.harakamall.ui.theme.Grass
import com.j0e101.harakamall.ui.theme.Orange
import com.j0e101.harakamall.ui.theme.Red
import com.j0e101.harakamall.ui.theme.Sand
import com.j0e101.harakamall.ui.theme.Sky

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NewScreen(navController: NavHostController) {
    Column {
        //Scaffold

        var selectedIndex by remember { mutableStateOf(0) }

        Scaffold(
            //TopBar
            topBar = {
                TopAppBar(
                    title = { Text("Assignment") },
                    navigationIcon = {
                        IconButton(onClick = { /* Handle back/nav */ }) {
                            Icon(Icons.Default.ArrowBack, contentDescription = "Back")
                        }
                    },
                    colors = TopAppBarDefaults.topAppBarColors(
                        containerColor = Orange,
                        titleContentColor = Color.White,
                        navigationIconContentColor = Color.White
                    )
                )
            },

            //BottomBar
            bottomBar = {
                NavigationBar(
                    containerColor = Color.White
                ){
                    NavigationBarItem(
                        icon = { Icon(Icons.Default.Home, contentDescription = "Home") },
                        selected = selectedIndex == 0,
                        onClick = { selectedIndex = 0
                            //navController.navigate(ROUT_HOME)
                        }
                    )
                    NavigationBarItem(
                        icon = { Icon(painter = painterResource(R.drawable.notepad), contentDescription = "Favorites") },
                        selected = selectedIndex == 1,
                        onClick = { selectedIndex = 1
                            // navController.navigate(ROUT_HOME)
                        },
                        modifier = Modifier.height(25.dp)
                    )
                    NavigationBarItem(
                        icon = { Icon(painter = painterResource(R.drawable.bookmark), contentDescription = "Favorites") },
                        selected = selectedIndex == 1,
                        onClick = { selectedIndex = 1
                            // navController.navigate(ROUT_HOME)
                        },
                        modifier = Modifier.height(30.dp)
                    )
                    NavigationBarItem(
                        icon = { Icon(painter = painterResource(R.drawable.profile), contentDescription = "Profile") },
                        selected = selectedIndex == 2,
                        onClick = { selectedIndex = 2
                            //  navController.navigate(ROUT_HOME)
                        },
                        modifier = Modifier.height(height = 30.dp)
                    )

                }
            },


            content = { paddingValues ->
                Column(
                    modifier = Modifier
                        .padding(paddingValues)
                        .fillMaxSize()
                        .verticalScroll(rememberScrollState())
                        .background(color = Color.White)
                ) {
                    //Phase(1)
                    Row (
                        modifier = Modifier.padding(start = 20.dp)
                    ){
                        Column (
                            modifier = Modifier.padding(top = 60.dp, end = 30.dp)
                        ){
                            Text(
                                text = "Hi Samantha",
                                fontSize = 30.sp,
                                fontWeight = FontWeight.ExtraBold
                            )
                            Text(
                                text = "Here are your projects",
                                fontSize = 15.sp,
                                fontWeight = FontWeight.Light
                            )
                        }

                        Spacer(modifier = Modifier.width(width = 20.dp))

                        Box{
                            Card (
                                modifier = Modifier.fillMaxWidth()
                                    .height(height = 150.dp),
                                shape = RoundedCornerShape(bottomStart = 200.dp),
                                colors = CardDefaults.cardColors(Gold)
                            ){  }

                            Image(
                                painter = painterResource(R.drawable.character),
                                contentDescription = "",
                                modifier = Modifier.width(150.dp)
                                    .height(height = 200.dp)
                                    .offset(x = -50.dp, y = -25.dp),
                                alpha = 0.8f

                            )
                        }

                    }
                    //EndPhase(1)


                    //Phase(2)
                    Row (
                        modifier = Modifier.padding(start = 20.dp, end = 20.dp, bottom = 20.dp)
                            .horizontalScroll(rememberScrollState()),

                    ){
                        //Card(1)
                        Card (
                            modifier = Modifier.width(width = 150.dp)
                                .height(height = 250.dp)
                        ){
                            Column (
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center,
                                modifier = Modifier.fillMaxSize()
                                    .background(color = Sky)
                            ){
                                Image(
                                    painter = painterResource(R.drawable.crypto),
                                    contentDescription = "",
                                    modifier = Modifier.size(size = 90.dp)
                                        .padding(end = 10.dp)

                                )
                                Text(
                                    text = "Cryptocurrency",
                                    fontWeight = FontWeight.Bold,
                                    color = Color.White,
                                )

                                Spacer(modifier = Modifier.height(height=5.dp))

                                Text(
                                    text = "Loading page",
                                    fontWeight = FontWeight.Bold,
                                    color = Color.White,
                                    modifier = Modifier.padding(end = 10.dp),
                                )
                            }
                        }
                        //EndCard(1)

                        Spacer(modifier = Modifier.width(width = 10.dp))

                        //Card(2)
                        Card (
                            modifier = Modifier.width(width = 150.dp)
                                .height(height = 250.dp)
                        ){
                            Column (
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center,
                                modifier = Modifier.fillMaxSize()
                                    .background(color = Sand)
                            ){
                                Image(
                                    painter = painterResource(R.drawable.statistical),
                                    contentDescription = "",
                                    modifier = Modifier.size(size = 90.dp)
                                        .padding(end = 10.dp)
                                )
                                Text(
                                    text = "Statistics",
                                    fontWeight = FontWeight.Bold,
                                    color = Color.White,
                                    modifier = Modifier.padding(end = 40.dp),
                                )

                                Spacer(modifier = Modifier.height(height = 5.dp))

                                Text(
                                    text = "Dashboard",
                                    fontWeight = FontWeight.Bold,
                                    color = Color.White,
                                    modifier = Modifier.padding(end = 30.dp),
                                )
                            }
                        }
                        //EndCard(2)

                        Spacer(modifier = Modifier.width(width = 10.dp))

                        //Card(3)
                        Card (
                            modifier = Modifier.width(width = 150.dp)
                                .height(height = 250.dp)
                        ){
                            Column (
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center,
                                modifier = Modifier.fillMaxSize()
                                    .background(color = Grass)
                            ){
                                Image(
                                    painter = painterResource(R.drawable.ecomm),
                                    contentDescription = "",
                                    modifier = Modifier.size(size = 90.dp)
                                        .padding(end = 10.dp)
                                )
                                Text(
                                    text = "e-Commerce",
                                    fontWeight = FontWeight.Bold,
                                    color = Color.White,
                                    modifier = Modifier.padding(end = 17.dp)
                                )

                                Spacer(modifier = Modifier.height(height = 5.dp))

                                Text(
                                    text = "Projected Sales",
                                    fontWeight = FontWeight.Bold,
                                    color = Color.White
                                )
                            }
                        }
                        //EndCard(3)

                    }
                    //EndPhase(2)

                    Spacer(modifier = Modifier.height(height = 10.dp))

                    //Phase(3)
                    Column (
                        modifier = Modifier.background(color = Color.LightGray)
                            .fillMaxSize()
                            .height(height = 246.dp)

                    ){
                        Column (
                            modifier = Modifier.padding(start = 20.dp, top = 15.dp, end = 20.dp)
                        ){
                            Text(
                                text = "Personal Tasks",
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(bottom = 15.dp)
                            )

                            Card (
                                colors = CardDefaults.cardColors(Color.White),
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Row(
                                    modifier = Modifier.padding(15.dp)
                                ) {
                                    Image(
                                        painter = painterResource(R.drawable.video),
                                        contentDescription = ""
                                    )

                                    Column (
                                        modifier = Modifier.padding(start = 20.dp, top = 5.dp)
                                    ){
                                        Text(
                                            text = "NDA Review for Website Project",
                                            fontWeight = FontWeight.Bold
                                        )
                                        Text(
                                            text = "Today -10 p.m.",
                                            fontWeight = FontWeight.Light
                                        )
                                    }
                                }
                            }

                            Spacer(modifier = Modifier.height(height = 10.dp))

                            Card (
                                colors = CardDefaults.cardColors(Color.White),
                                modifier = Modifier.fillMaxWidth()
                            ){
                                Row (
                                    modifier = Modifier.padding(15.dp)
                                ){
                                    Image(
                                        painter = painterResource(R.drawable.mail),
                                        contentDescription = ""
                                    )
                                    Column(
                                        modifier = Modifier.padding(start = 20.dp, top = 5.dp)
                                    ){
                                        Text(
                                            text = "Email Reply for Green Project",
                                            fontWeight = FontWeight.Bold
                                        )
                                        Text(
                                            text = "Today -10 p.m.",
                                            fontWeight = FontWeight.Light
                                        )
                                    }
                                }
                            }
                        }
                    }
                }
                    //EndPhase(3)




            }
        )
    }


        //End of scaffold
}


@Preview(showBackground = true)
@Composable
fun NewScreenPreview(){
    NewScreen(rememberNavController())
}