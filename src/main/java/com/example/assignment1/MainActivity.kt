import android.annotation.SuppressLint
import android.widget.TextView
import com.example.assignment1.R

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // get the button , Text View and Edit Text using the id we set on the user face.

        val submitButton = findViewById<Button>(R.id.submitButton)
        val resetButton = findViewById<Button>(R.id.resetButton)
        val editName = findViewById<EditText>(R.id.editName)
        val textDisplay = findViewById<TextView>(R.id.textDisplay)

        fun resetAllTasks() {
            TODO("Not yet implemented")
        }

        fun addTask(s: String) {
            TODO("Not yet implemented")
        }

        // type of meal suggestions based on time of the day
        fun setupClickListeners() {
            // Morning section
            findViewById<Button>(R.id.submitButton).setOnClickListener {
                addTask("morning")
            }

            // Afternoon section
            findViewById<Button>(R.id.submitButton).setOnClickListener {
                addTask("afternoon")
            }

            // Evening section
            findViewById<Button>(R.id.submitButton).setOnClickListener {
                addTask("evening")
            }

            // Reset button
            findViewById<Button>(R.id.resetButton).setOnClickListener {
                resetAllTasks()
            }

            // MealSuggestionManager.kt
            class MealSuggestionManager {
                private val mealSuggestions = mapOf(
                    "morning" to listOf(
                        "Oatmeal with fruits" ,
                        "Scrambled eggs with whole wheat toast" ,
                        "Greek yogurt with berries" ,
                        "Avocado toast with eggs" ,
                        "Smoothie bowl with granola"
                    ) ,
                    "afternoon" to listOf(
                        "Grilled chicken salad" ,
                        "Whole grain sandwich with vegetables" ,
                        "Lentil soup with crackers" ,
                        "Quinoa bowl with roasted vegetables" ,
                        "Fresh fruit salad with nuts"
                    ) ,
                    "evening" to listOf(
                        "Spaghetti with tomato sauce" ,
                        "Grilled salmon with roasted vegetables" ,
                        "Chicken stir-fry with brown rice" ,
                        "Vegetable curry with whole grain rice" ,
                        "Baked chicken with sweet potatoes"
                    )
                )

                fun getSuggestion(timeOfDay: String): String {
                    return mealSuggestions[timeOfDay]?.random() ?: "No suggestions available"
                }
            }
        }
    }
}





















































































































































































































































































































































































