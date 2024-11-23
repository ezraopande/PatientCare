package com.ezra.liza

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.List
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PatientCareTrackerScreen()
        }
    }
}


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Preview()
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PatientCareTrackerScreen() {
    Scaffold(
        topBar = { TopAppBar(title = { Text("Patient Care Tracker") }) },
        floatingActionButton = {
            FloatingActionButton(onClick = {  }) {
                Icon(Icons.Default.Add, contentDescription = "Add")
            }
        },
       content = {
           LazyColumn(
               modifier = Modifier
                   .fillMaxSize()
                   .padding(it)
                   .background(Color(0xFFF8F9FA))
           ) {
               item {
                   Column(modifier = Modifier.fillMaxSize()) {

                       // Vital Signs Section
                       Card(
                           modifier = Modifier
                               .fillMaxWidth()
                               .padding(16.dp),
                           elevation = CardDefaults.cardElevation(6.dp),
                           shape = RoundedCornerShape(12.dp)
                       ) {
                           Column(modifier = Modifier.padding(16.dp)) {
                               Text(
                                   text = "Vital Signs",
                                   style = MaterialTheme.typography.titleLarge,
                                   color = MaterialTheme.colorScheme.primary
                               )
                               Spacer(modifier = Modifier.height(12.dp))
                               Row(verticalAlignment = Alignment.CenterVertically) {
                                   Icon(
                                       Icons.Default.Favorite,
                                       contentDescription = "Heart Rate",
                                       tint = Color.Red,
                                       modifier = Modifier.size(24.dp)
                                   )
                                   Spacer(modifier = Modifier.width(8.dp))
                                   Text("Heart Rate: 75 bpm", fontSize = 16.sp, fontWeight = FontWeight.Medium)
                               }
                               Spacer(modifier = Modifier.height(8.dp))
                               Row(verticalAlignment = Alignment.CenterVertically) {
                                   Icon(
                                       Icons.Default.CheckCircle,
                                       contentDescription = "Temperature",
                                       tint = Color.Blue,
                                       modifier = Modifier.size(24.dp)
                                   )
                                   Spacer(modifier = Modifier.width(8.dp))
                                   Text("Temperature: 98.6°F", fontSize = 16.sp, fontWeight = FontWeight.Medium)
                               }
                           }
                       }

                       // Medications Section
                       Card(
                           modifier = Modifier
                               .fillMaxWidth()
                               .padding(16.dp),
                           elevation = CardDefaults.cardElevation(6.dp),
                           shape = RoundedCornerShape(12.dp)
                       ) {
                           Column(modifier = Modifier.padding(16.dp)) {
                               Text(
                                   text = "Medications",
                                   style = MaterialTheme.typography.titleLarge,
                                   color = MaterialTheme.colorScheme.secondary
                               )
                               Spacer(modifier = Modifier.height(12.dp))
                               Text("Aspirin 100mg", style = MaterialTheme.typography.bodyLarge)
                               Spacer(modifier = Modifier.height(8.dp))
                               Row(
                                   verticalAlignment = Alignment.CenterVertically,
                                   horizontalArrangement = Arrangement.SpaceBetween,
                                   modifier = Modifier.fillMaxWidth()
                               ) {
                                   Text(
                                       text = "Vitamin D 200 IU",
                                       style = MaterialTheme.typography.bodyLarge
                                   )
                               }
                           }
                       }

                       // Dietary Intake Section
                       Card(
                           modifier = Modifier
                               .fillMaxWidth()
                               .padding(16.dp),
                           elevation = CardDefaults.cardElevation(6.dp),
                           shape = RoundedCornerShape(12.dp)
                       ) {
                           Column(modifier = Modifier.padding(16.dp)) {
                               Text(
                                   text = "Dietary Intake",
                                   style = MaterialTheme.typography.titleLarge,
                                   color = MaterialTheme.colorScheme.tertiary
                               )
                               Spacer(modifier = Modifier.height(12.dp))
                               Text("Breakfast: Eggs & Toast", fontSize = 16.sp)
                               Spacer(modifier = Modifier.height(8.dp))
                               Text("Lunch: Chicken Salad", fontSize = 16.sp)
                               Spacer(modifier = Modifier.height(16.dp))

                           }
                       }

                       Card(
                           modifier = Modifier
                               .fillMaxWidth()
                               .padding(16.dp),
                           elevation = CardDefaults.cardElevation(6.dp),
                           shape = RoundedCornerShape(12.dp)
                       ) {
                           Column(modifier = Modifier.padding(16.dp)) {

                               Text(
                                   text = "Fluid Balance",
                                   style = MaterialTheme.typography.titleLarge,
                                   color = MaterialTheme.colorScheme.primary
                               )
                               Spacer(modifier = Modifier.height(12.dp))

                               FluidBalancePieChart()




                           }
                       }

                   }
               }
           }

       },
        bottomBar = {
            BottomNavigation(
                elevation = 10.dp,
                modifier = Modifier.windowInsetsPadding(WindowInsets.systemBars),
            ) {
                BottomNavigationItem(
                    icon = { Icon(imageVector = Icons.Default.Favorite, contentDescription = "Vital Signs", tint = Color.White) },
                    label = { Text("Vital Signs", color = Color.White) },
                    selected = false,
                    onClick = { /* Do nothing */ }
                )
                BottomNavigationItem(
                    icon = { Icon(imageVector = Icons.Default.Face, contentDescription = "Medications", tint = Color.White) },
                    label = { Text("Medications", color = Color.White) },
                    selected = false,
                    onClick = { /* Do nothing */ }
                )
                BottomNavigationItem(
                    icon = { Icon(imageVector = Icons.Default.List, contentDescription = "Dietary", tint = Color.White) },
                    label = { Text("Dietary", color = Color.White) },
                    selected = false,
                    onClick = { /* Do nothing */ }
                )
                BottomNavigationItem(
                    icon = { Icon(imageVector = Icons.Default.Edit, contentDescription = "Fluid Balance", tint = Color.White) },
                    label = { Text("Add", color = Color.White) },
                    selected = false,
                    onClick = { /* Do nothing */ }
                )
            }
        }
    )
}

@Composable
fun FluidBalancePieChart() {
    val slices = listOf(
        "Water" to 60f,
        "Other Fluids" to 40f
    )


    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(300.dp)
            .padding(16.dp)
    ) {
        Canvas(modifier = Modifier.fillMaxSize()) {
            val total = slices.sumOf { it.second.toDouble() }.toFloat()
            var startAngle = -90f


            slices.forEach { (label, value) ->
                val sweepAngle = (value / total) * 360f
                drawArc(
                    color = when (label) {
                        "Water" -> Color(0xFF4CAF50)
                        "Other Fluids" -> Color(0xFF2196F3)
                        else -> Color.Gray
                    },
                    startAngle = startAngle,
                    sweepAngle = sweepAngle,
                    useCenter = true,
                    size = size.copy(minOf(size.width, size.height), minOf(size.width, size.height)),
                    style = Fill
                )
                startAngle += sweepAngle
            }
        }


        Text(
            text = "Fluid Balance",
            modifier = Modifier.align(Alignment.Center),
            color = Color.Black
        )
    }
}


