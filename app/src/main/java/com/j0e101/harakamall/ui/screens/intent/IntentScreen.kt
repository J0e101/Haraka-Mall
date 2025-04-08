package com.j0e101.harakamall.ui.screens.intent

import android.content.Intent
import android.provider.MediaStore
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.net.toUri
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.j0e101.harakamall.ui.theme.Orange
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun IntentScreen(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {

        val mContext = LocalContext.current

        //TopAppBar
        TopAppBar(
            title = {
                Text(
                    text = "Intents",
                    color = Color.White,
                )

            },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Orange,
                navigationIconContentColor = Color.White,
                actionIconContentColor = Color.White,
            ),
            navigationIcon = {
                IconButton(
                    onClick = {}
                ) {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = "Icon Menu",
                    )
                }
            },

            actions = {
                IconButton(
                    onClick = {}
                ) {
                    Icon(
                        imageVector = Icons.Default.Share,
                        contentDescription = "",
                    )
                }
                IconButton(
                    onClick = {}
                ) {
                    Icon(
                        imageVector = Icons.Default.Settings,
                        contentDescription = "",
                    )
                }
                IconButton(
                    onClick = {}
                ) {
                    Icon(
                        imageVector = Icons.Default.ArrowForward,
                        contentDescription = "",
                    )
                }
            }

        )
        //End

        Spacer(modifier = Modifier.height(height = 20.dp))

        Column(
            modifier = Modifier.verticalScroll(rememberScrollState())
        ) {
            //STK
            Button(
                onClick = {
                    val simToolKitLaunchIntent =
                        mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                    simToolKitLaunchIntent?.let { mContext.startActivity(it)}
                    },
                colors = ButtonDefaults.buttonColors(Orange),
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier.fillMaxWidth().padding(start = 10.dp, end = 10.dp),
            ) {
                Text(
                    text = "M-PESA"
                )

            }

            //End

            Spacer(modifier = Modifier.height(height = 20.dp))

            //STK
            Button(
                onClick = {
                    val callIntent=Intent(Intent.ACTION_DIAL)
                    callIntent.data="tel:0742183000".toUri()
                    mContext.startActivity(callIntent)
                },
                colors = ButtonDefaults.buttonColors(Orange),
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier.fillMaxWidth().padding(start = 10.dp, end = 10.dp),
            ) {
                Text(
                    text = "CALL US"
                )

            }

            //End

            Spacer(modifier = Modifier.height(height = 20.dp))

            //STK
            Button(
                onClick = {
                    val shareIntent = Intent(Intent.ACTION_SEND)
                    shareIntent.type = "text/plain"
                    shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("akinyiglory2@gmail.com"))
                    shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
                    shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is the email body")
                    mContext.startActivity(shareIntent)
                },
                colors = ButtonDefaults.buttonColors(Orange),
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier.fillMaxWidth().padding(start = 10.dp, end = 10.dp),
            ) {
                Text(
                    text = "EMAIL US"
                )

            }

            //End

            Spacer(modifier = Modifier.height(height = 20.dp))

            //STK
            Button(
                onClick = {
                    val shareIntent = Intent(Intent.ACTION_SEND)
                    shareIntent.type = "text/plain"
                    shareIntent.putExtra(Intent.EXTRA_TEXT, "Check out this is a cool content")
                    mContext.startActivity(Intent.createChooser(shareIntent, "Share"))
                },
                colors = ButtonDefaults.buttonColors(Orange),
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier.fillMaxWidth().padding(start = 10.dp, end = 10.dp),
            ) {
                Text(
                    text = "SHARE WITH"
                )

            }

            //End

            Spacer(modifier = Modifier.height(height = 20.dp))

            //STK
            Button(
                onClick = {
                    val smsIntent=Intent(Intent.ACTION_SENDTO)
                    smsIntent.data="smsto:0720245837".toUri()
                    smsIntent.putExtra("sms_body","Testing 1, 2, 3...")
                    mContext.startActivity(smsIntent)
                },
                colors = ButtonDefaults.buttonColors(Orange),
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier.fillMaxWidth().padding(start = 10.dp, end = 10.dp),
            ) {
                Text(
                    text = "SMS"
                )

            }

            Spacer(modifier = Modifier.height(height = 20.dp))

            //STK
            Button(
                onClick = {
                    val cameraIntent=Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                    if (cameraIntent.resolveActivity(mContext.packageManager)!=null){
                        mContext.startActivity(cameraIntent)
                    }else{
                        println("Camera app is not available")}
                },
                colors = ButtonDefaults.buttonColors(Orange),
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier.fillMaxWidth().padding(start = 10.dp, end = 10.dp),
            ) {
                Text(
                    text = "CAMERA"
                )

            }

            //End

            //End

        }
        }



}


@Preview(showBackground = true)
@Composable
fun IntentScreenPreview(){
    IntentScreen(rememberNavController())
}
