package com.example.quoteoftheday

import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.quoteoftheday.ui.theme.QuoteOftheDayTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val quote: TextView = findViewById(R.id.quote)
        val next: Button = findViewById(R.id.next)
        val smile: Button = findViewById(R.id.smile)
        val quotes = listOf(
            "All our dreams can come true, if we have the courage to pursue them. — Walt Disney",
        "Hard things will happen to us. We will recover. We will learn from it. We will grow more resilient because of it. — Taylor Swift",
        "You define beauty yourself, society doesn’t define your beauty. — Lady Gaga",
        "It is during our darkest moments that we must focus to see the light. — Aristotle",
        "If you don't like the road you're walking, start paving another one. — Dolly Parton",
        "Your story is what you have, what you will always have. It is something to own. — Michelle Obama",
        "It takes courage to grow up and become who you really are. — E.E. Cummings",
        "To bring about change, you must not be afraid to take the first step. We will fail when we fail to try. — Rosa Parks"
        )
        val content: TextView = findViewById(R.id.content)
        next.setOnClickListener {
            val randomQuote = quotes[Random.nextInt(quotes.size)]
            content.text = randomQuote
        }
        smile.setOnClickListener {
            Toast.makeText(this, "YOU LOOKS AWESOME TODAY!", Toast.LENGTH_SHORT).show()
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    QuoteOftheDayTheme {
        Greeting("Android")
    }
}