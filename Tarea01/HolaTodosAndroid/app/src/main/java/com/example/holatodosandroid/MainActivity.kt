package com.example.holatodosandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.holatodosandroid.ui.theme.HolaTodosAndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HolaTodosAndroidTheme {
                Scaffold(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.White)
                ) { innerPadding ->
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding),
                        contentAlignment = Alignment.Center
                    ) {
                        DrawPacMan()
                    }
                }
            }
        }
    }
}

@Composable
fun DrawPacMan() {
    val pacMan = """
        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣤⣤⣤⣤⣤⣤⣤⣤⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
        ⠀⠀⠀⠀⠀⠀⢀⣤⣶####################⣤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀
        ⠀⠀⠀⠀⣠############################⣄⠀⠀⠀⠀⠀⠀⠀⠀
        ⠀⠀⢠#######⠟⠛⠻##################⣷⣄⠀⠀⠀⠀⠀⠀⠀
        ⠀⣰#####⠀⠀⠀⢸#####################⡿⠂⠀⠀⠀⠀⠀⠀
        ⣸######⣦⣤⣴################⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀
        ⢰####################⠿⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
        ⣾##############⠿⠋⠁⠀⠀⠀⢀⣀⠀⠀⠀⠀⠀⣀⠀⠀⠀
        ################⠋⠁⠀⠀⠀⣴⣿⣿⣿⣦⠀⠀⠀⣼⣿⣆⠀
        ################⣦⣀⠀⠀⠀⢿⣿⣿⣿⡟⠀⠀⠀⢿⣿⡏⠀
        ⢿################⣷⣦⣄⠀⠀⠉⠉⠁⠀⠀⠀⠀⠈⠉⠁⠀
        ⠸##################⣿⣦⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
        ⠀⢻##################⣿⣿⣶⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀
        ⠀⠀⠻####################⣿⣿⣿⣷⡄⠀⠀⠀⠀⠀⠀⠀
        ⠀⠀⠙⢿##################⣿⣿⡿⠋⠀⠀⠀⠀⠀⠀⠀
        ⠀⠀⠀⠀⠛⢿############⣿⡿⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀
        ⠀⠀⠀⠀⠀⠀⠉⠻⢿####⠿⠛⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀
        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠙⠛⠛⠻⠿⠿⠟⠛⠛⠋⠀
    """.trimIndent()

    Text(
        text = pacMan,
        fontFamily = FontFamily.Monospace,
        fontSize = 8.sp,
        color = Color.Black
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewPacMan() {
    HolaTodosAndroidTheme {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White),
            contentAlignment = Alignment.Center
        ) {
            DrawPacMan()
        }
    }
}
