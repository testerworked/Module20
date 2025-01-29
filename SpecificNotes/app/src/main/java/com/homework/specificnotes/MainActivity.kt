package com.homework.specificnotes

/**
 * FloatingActionButton
 * Приложение «Заметки» На основе пройденного материала необходимо написать приложение
 * для написания и просмотра заметок, с возможностью их удаления.
 *
 * Приложение должно включать в себя:
 *
 * - Text, отображающий заголовок приложения;
 *
 * - LazyColumn, который будет отображать написанные пользователем заметки;
 * -TextField/OutlinedTextField, в который пользователь сможет вводить текст заметки;
 *
 * - FloatingActionButton, при нажатии на которую, написанный пользователем текст
 * в TextField/OutlinedTextField будет добавляться в список;
 *
 * - IconButton напротив каждой заметки, при нажатии на которую,
 * соответствующая заметка будет удаляться.
 *
 * Рекомпозиция элементов экрана должнапроисходить моментально.
 * При изменении ориентации экрана, состояние компонентов должно сохраняться.
 */
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}