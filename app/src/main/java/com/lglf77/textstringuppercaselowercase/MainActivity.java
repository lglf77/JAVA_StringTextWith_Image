package com.lglf77.textstringuppercaselowercase;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.text_test);
        imageView = findViewById(R.id.img_example);

        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(" ");
        spannableStringBuilder.setSpan(
                new ImageSpan(this, R.drawable.ic_person_pin_24),
                spannableStringBuilder.length() - 1,
                spannableStringBuilder.length(), 0
        );
        spannableStringBuilder.append(getText(R.string.text_comment));
        textView.setText(spannableStringBuilder);
    }
}