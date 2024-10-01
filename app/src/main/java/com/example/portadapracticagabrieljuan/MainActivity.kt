package com.example.portadapracticagabrieljuan

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ColorMatrix
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.portadapracticagabrieljuan.ui.theme.PortadaPracticaGabrielJuanTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val imagenPortada: Painter = painterResource(R.drawable.mythology_zeus_cover)
            val tituloLibro: String = "Mythology"
            val autorLibro: String = "Edit Hamilton"
            val comentarioLibro1: String = "\"Un viaje épico a los mitos\""
            val comentarioLibro2: String = "\"El favorito de Dionisio\""

            PortadaPracticaGabrielJuanTheme {
                Surface(modifier = Modifier.fillMaxSize(), color = Color.LightGray) {
                    PortadaImagen(
                        titulo = tituloLibro,
                        autor = autorLibro,
                        comentario1 = comentarioLibro1,
                        comentario2 = comentarioLibro2,
                        imagen = imagenPortada
                    )
                }
            }
        }
    }
}


@Composable
fun PortadaImagen(
    titulo: String, autor: String, comentario1: String, comentario2: String, imagen: Painter
) {
    Box {
        Image(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            painter = imagen,
            contentScale = ContentScale.Crop,
            contentDescription = null,
        )
        PortadaTexto(titulo, autor, comentario1, comentario2)
    }
}

@Composable
fun PortadaTexto(titulo: String, autor: String, comentario1: String, comentario2: String) {
    val imagenSeparador: Painter = painterResource(R.drawable.imageedit_1_4542108723)

    Column(
        verticalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.Top, modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                modifier = Modifier.fillMaxWidth(),
                color = Color.White,
                text = titulo,
                fontSize = 60.sp,
                fontStyle = FontStyle.Italic,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                style = TextStyle(
                    shadow = Shadow(
                        color = Color.Black,
                        offset = Offset(8f, 8f),
                        blurRadius = 2f
                    )
                )
            )
            Text(
                modifier = Modifier.fillMaxWidth(),
                color = Color.White,
                text = autor,
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                style = TextStyle(
                    shadow = Shadow(
                        color = Color.Black,
                        offset = Offset(8f, 8f),
                        blurRadius = 2f
                    )
                )
            )
        }
        Row(
            horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                modifier = Modifier
                    .padding(6.dp)
                    .weight(1f),
                color = Color.White,
                text = comentario1,
                fontSize = 16.sp,
                textAlign = TextAlign.Center,
                style = TextStyle(
                    shadow = Shadow(
                        color = Color.Black,
                        offset = Offset(6f, 6f),
                        blurRadius = 2f
                    )
                )
            )
//            Text(
//                modifier = Modifier.weight(0.25f),
//                color = Color.White,
//                text = "✖",
//                fontSize = 16.sp,
//                textAlign = TextAlign.Center,
//                style = TextStyle(shadow = Shadow(
//                    color = Color.Black,
//                    offset = Offset(8f, 8f),
//                    blurRadius = 2f
//                ))
            Image(
                modifier = Modifier.weight(0.75f),
                painter = imagenSeparador,
                contentDescription = null
            )
            Text(
                modifier = Modifier
                    .padding(6.dp)
                    .weight(1f),
                color = Color.White,
                text = comentario2,
                fontSize = 16.sp,
                textAlign = TextAlign.Center,
                style = TextStyle(
                    shadow = Shadow(
                        color = Color.Black,
                        offset = Offset(6f, 6f),
                        blurRadius = 2f
                    )
                )
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PortadaGabriel() {
    PortadaPracticaGabrielJuanTheme {
        val imagenPortada: Painter = painterResource(R.drawable.mythology_zeus_cover)
        val tituloLibro: String = "Mythology"
        val autorLibro: String = "Edit Hamilton"
        val comentarioLibro1: String = "\"Un viaje épico a los mitos\""
        val comentarioLibro2: String = "\"El favorito de Dionisio\""

        PortadaPracticaGabrielJuanTheme {
            Surface(modifier = Modifier.fillMaxSize(), color = Color.LightGray) {
                PortadaImagen(
                    titulo = tituloLibro,
                    autor = autorLibro,
                    comentario1 = comentarioLibro1,
                    comentario2 = comentarioLibro2,
                    imagen = imagenPortada
                )
            }
        }
    }
}