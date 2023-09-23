package com.example.homefoodfighter_android

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.DatePicker
import com.example.homefoodfighter_android.databinding.ActivityDatePickBinding
import java.util.*

class DatePickActivity : AppCompatActivity() {
    private lateinit var viewBinding : ActivityDatePickBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityDatePickBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)


        // 현재 날짜를 가져옵니다.
        val calendar = Calendar.getInstance()
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH)

        // DatePickerDialog를 만듭니다.
        val datePickerDialog = DatePickerDialog(
            this,
            R.style.MyDatePickerDialogTheme, // 사용자 지정 테마를 적용합니다.
            DatePickerDialog.OnDateSetListener { view: DatePicker, year: Int, month: Int, dayOfMonth: Int ->

            },
            year,
            month,
            dayOfMonth
        )
        // 헤더 숨기기
        datePickerDialog.setTitle("")
        datePickerDialog.show()

        viewBinding.datePicker.setOnClickListener {
            datePickerDialog.show()
        }

    }
}