package com.homework.autoconfigurator

/**
 * Приложение “Конфигуратор авто”
 *
 *
 * На основе пройденного материала необходимо написать приложение «Конфигуратор авто».
 * Приложение должно выводить на экран изображение автомобиля с помощью компонента Image,
 * пользователь должен иметь возможность выбирать цвет автомобиля c помощью RadioButton’ов
 * или selectable компонентов. Также пользователю должен быть предоставлен выбор
 * комплектации автомобиля с помощью RadioButton’ов. В зависимости от выбранной
 * комплектации должна меняться предполагаемая стоимость автомобиля,
 * которая отображается в компоненте Text.
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